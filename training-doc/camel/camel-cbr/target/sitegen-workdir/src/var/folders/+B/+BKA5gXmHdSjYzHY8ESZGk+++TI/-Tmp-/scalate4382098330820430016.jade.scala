/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */

import scala.collection.JavaConversions._
import org.fusesource.scalate.support.TemplateConversions._

object $_scalate_$scalate4382098330820430016_jade {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    import _root_.org.fusesource.scalate.support.RenderHelper.{sanitize=>$_scalate_$_sanitize, preserve=>$_scalate_$_preserve, indent=>$_scalate_$_indent, smart_sanitize=>$_scalate_$_smart_sanitize, attributes=>$_scalate_$_attributes}
    ;{
      implicit val context: org.fusesource.scalate.maven.DummyRenderContext = $_scalate_$_context.attribute("context")
      import context._
      ;{
        val response: org.fusesource.scalate.maven.DummyResponse = $_scalate_$_context.attributeOrElse("response", new org.fusesource.scalate.maven.DummyResponse())
        
    // common imports go here
    import Website._;
    
        
        $_scalate_$_context << ( "<div class=\"body\">\n  " );
        $_scalate_$_context << ( $_scalate_$_indent ( "  ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
          $_scalate_$_context << ( "\n# Table of Content\n\n{:toc}\n\n# 3. Content Based Router\nIn this exercise, we will build and deploy some content-based routers. The first router uses an XPath query to perform routing decisions on XML payload. The second router uses a header \ufffd containing the name of the file that initiates the route \ufffd to perform routing.\n\n<img src=images/camel-cbr.png width=500 height=300/>\n\n## 3.1 Review of Solution\nThe files for this exercise are located in the directory camel-exercises-cbr/. Before beginning the exercise, locate and open each of the files in the table below and preview the file as instructed." );
        } ) ) ) );
        $_scalate_$_context << ( "\n  " );
        $_scalate_$_context << ( $_scalate_$_indent ( "  ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
          $_scalate_$_context << ( "</p>\n<table width=\"590\" border=\"2\" cellspacing=\"0\">\n<tr valign=\"top\">\n  <td bgcolor=\"#F3F3F3\"><font size=\"3\" face=\"Times New Roman\">File</font></td>\n  <td bgcolor=\"#F3F3F3\"><font size=\"3\" face=\"Arial\">Note</font></td>\n  <td bgcolor=\"#F3F3F3\"><font size=\"3\" face=\"Times New Roman\">Check</font></td></tr>\n<tr valign=\"top\"><td rowspan=\"2\"><font size=\"3\" face=\"Courier New\">pom.xml</font></td>\n  <td><font size=\"3\" face=\"Arial\">Look at each of the dependencies in\n  the &lt;dependencies&gt; section. Do you understand why each is required? </font>\n\n  </td>\n  <td><font size=\"3\" face=\"Symbol\">?</font></td></tr>\n<tr valign=\"top\"><td><font size=\"3\" face=\"Arial\">Examine the configuration\n  instructions for the maven-bundle-plugin. Do you understand how the\n  OSGi bundle is being created?</font></td>\n  <td><font size=\"3\" face=\"Symbol\">?</font></td></tr>\n<tr valign=\"top\"><td rowspan=\"2\"><font size=\"3\" face=\"Courier New\">RouteByCurrencyRouter.java</font></td>\n  <td><font size=\"3\" face=\"Arial\">Examine the router; do you understand\n  the flow of control? </font></td>\n  <td><font size=\"3\" face=\"Symbol\">?</font></td></tr>\n\n<tr valign=\"top\"><td><font size=\"3\" face=\"Arial\">Why are the InitializingBean\n  and DisposableBean interfaces implemented?</font></td>\n  <td><font size=\"3\" face=\"Symbol\">?</font></td></tr>\n<tr valign=\"top\"><td><font size=\"3\" face=\"Courier New\">RouteByFileNameRouter.java</font></td>\n  <td><font size=\"3\" face=\"Arial\">Examine the router; do you understand\n  the flow of control?</font></td>\n  <td><font size=\"3\" face=\"Symbol\">?</font></td></tr>\n<tr valign=\"top\"><td><font size=\"3\" face=\"Courier New\">bundle-context.xml</font></td>\n  <td><font size=\"3\" face=\"Arial\">Do you understand how each route is\n  being initialized?</font></td>\n\n  <td><font size=\"3\" face=\"Symbol\">?</font></td></tr>\n<tr valign=\"top\"><td><font size=\"3\" face=\"Courier New\">camelContext.xml</font></td>\n  <td><font size=\"3\" face=\"Arial\">Note how this file simply includes the\n  bundle-context.xml file. This is to allow the camel:run plugin to re-use\n  Spring configuration while running outside of an OSGi container.</font></td>\n  <td><font size=\"3\" face=\"Symbol\">?</font></td></tr>\n</table>\n\n\n## 3.2\tBuilding and Running the Solution\nTo build the solution use 'mvn install'; to run the solution from the command-line, use 'mvn camel:run'.\n\n## 3.3\tOptional: Deploying the Solution in Servicemix 4\nTo deploy the solution into Servicemix 4, install the 'camel-exercises-cbr' feature from the ServiceMix shell if you installed the entire exercise feature beforehand. Otherwise follow the readme.txt file.\n\n    karaf@root> features:install camel-exercises-cbr\n\n## 3.4\tValidating the Solution\nThe validation here is for the deployment inside Servicemix 4 but it works the same way when started with but then you don\ufffdt need to copy any files and the output directory would be inside ./target/test-classes/camel/out directory.\nThe XPath router listens on the directory /camel-exercises/cbr/xml/in for XML files. Copy a sample file from the ./target/test-classes/camel/in/xml directory into /camel-exercises/cbr/xml/in. It should \ufffddisappear\ufffd after a short interval, and be processed by the route and new files should appear in /camel-exercises/cbr/xml/out after a few seconds.\n\nThe header-based router listens on the directory /camel-exercises/cbr/csv/in. Copy a sample file from the ./target/test-classes/camel/in/csv directory. Again, it should 'disappear' after a short interval, and be processed by the route and new files should appear in /camel-exercises/cbr/csv/out after a few seconds." );
        } ) ) ) );
        $_scalate_$_context << ( "\n</div>\n" );
      }
    }
  }
}


class $_scalate_$scalate4382098330820430016_jade extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$scalate4382098330820430016_jade.$_scalate_$render(context)
}