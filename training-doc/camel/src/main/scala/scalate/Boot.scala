package scalate

import org.fusesource.scalate.util.Logging
import java.util.concurrent.atomic.AtomicBoolean
import _root_.Website._
import org.fusesource.scalate.TemplateEngine
import org.fusesource.scalamd.{MacroDefinition, Markdown}
import java.util.regex.Matcher
import org.fusesource.scalate.wikitext.Pygmentize
import org.fusesource.scalate.RenderContext

class Boot(engine: TemplateEngine) extends Logging {

  private var _initialised = new AtomicBoolean(false)

  def run: Unit = {
    if (_initialised.compareAndSet(false, true)) {

      def filter(m:Matcher):String = {
        val filter_name = m.group(1)
        val body = m.group(2)
        engine.filter(filter_name) match {
          case Some(filter)=>
            filter.filter(RenderContext(), body)
          case None=> "<div class=\"macro error\"><p>filter not found: %s</p><pre>%s</pre></div>".format(filter_name, body)
        }
      }
      
      def pygmentize(m:Matcher):String = Pygmentize.pygmentize(m.group(2), m.group(1))

      // add some macros to markdown.
      Markdown.macros :::= List(
        MacroDefinition("""\{filter::(.*?)\}(.*?)\{filter\}""", "s", filter, true),
        MacroDefinition("""\{pygmentize::(.*?)\}(.*?)\{pygmentize\}""", "s", pygmentize, true),
        MacroDefinition("""\{pygmentize\_and\_compare::(.*?)\}(.*?)\{pygmentize\_and\_compare\}""", "s", pygmentize, true),
        MacroDefinition("""\$\{project_version\}""", "", _ => project_version.toString, true),
        MacroDefinition("""\$\{project_name\}""", "", _ => project_name.toString, true),
        MacroDefinition("""\$\{project_url\}""", "", _ => project_url.toString, true),
        MacroDefinition("""\$\{project_id\}""", "", _ => project_id.toString, true)
      )

      for( ssp <- engine.filter("ssp"); md <- engine.filter("markdown") ) {
        engine.pipelines += "ssp.md"-> List(ssp, md)
        engine.pipelines += "ssp.markdown"-> List(ssp, md)
      }
      info("Bootstrapped website gen for: %s".format(project_name))
    }
  }
}