/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */

import scala.collection.JavaConversions._
import org.fusesource.scalate.support.TemplateConversions._

object $_scalate_$scalate2816753994438999946_ssp {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      implicit val context: org.fusesource.scalate.maven.DummyRenderContext = $_scalate_$_context.attribute("context")
      import context._
      ;{
        val response: org.fusesource.scalate.maven.DummyResponse = $_scalate_$_context.attributeOrElse("response", new org.fusesource.scalate.maven.DummyResponse())
        
    // common imports go here
    import Website._;
    
        
        $_scalate_$_context << ( "\n" );
      }
    }
  }
}


class $_scalate_$scalate2816753994438999946_ssp extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$scalate2816753994438999946_ssp.$_scalate_$render(context)
}