/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */

import scala.collection.JavaConversions._
import org.fusesource.scalate.support.TemplateConversions._

object $_scalate_$scalate6897555893210817265_jade {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    import _root_.org.fusesource.scalate.support.RenderHelper.{sanitize=>$_scalate_$_sanitize, preserve=>$_scalate_$_preserve, indent=>$_scalate_$_indent, smart_sanitize=>$_scalate_$_smart_sanitize, attributes=>$_scalate_$_attributes}
    ;{
      implicit val context: org.fusesource.scalate.servlet.ServletRenderContext = $_scalate_$_context.attribute("context")
      import context._
      
    // common imports go here
    import Website._;
    
      
      $_scalate_$_context << ( "<div class=\"body\">\n  " );
      $_scalate_$_context << ( $_scalate_$_indent ( "  ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "\n# Table of Content\n\n{:toc}\n\n# 3. Content Based Router\nIn this exercise, we will build and deploy some content-based routers. The first router \nuses an XPath query to perform routing decisions on XML payload. The second router uses\na header - containing the name of the file that initiates the route - to perform routing.\n\n<img src=images/camel-cbr.png width=500 height=300/>\n\n## 3.1 Review of Solution\nThe files for this exercise are located in the directory `camel-exercises-cbr/`. Before \nbeginning the exercise, locate and open each of the files in the table below and preview \nthe file as instructed.\n\n{filter::jade}\ntable.clients\n  tr\n    th File\n    th Note\n    th Check\n  \n  tr\n    td(rowspan=\"2\")\n      :markdown\n        `pom.xml`\n    td\n      :markdown\n        Look at each of the dependencies in\n        the `<dependencies>` section. Do you understand why each is required?\n    td.symbol ?\n  \n  tr(valign=\"top\")\n    td\n      :markdown\n        Examine the configuration\n        instructions for the `maven-bundle-plugin`. Do you understand how the\n        OSGi bundle is being created?\n    td.symbol ?\n  \n  tr(valign=\"top\")\n    td(rowspan=\"2\")\n      :markdown\n        `RouteByCurrencyRouter.java`\n    td\n      :markdown\n        Examine the router; do you understand\n        the flow of control?\n    td.symbol ?\n  \n  tr(valign=\"top\")\n    td\n      :markdown\n        Why are the `InitializingBean`\n        and `DisposableBean` interfaces implemented?\n    td.symbol ?\n  \n  tr(valign=\"top\")\n    td\n      :markdown\n        `RouteByFileNameRouter.java`\n    td\n      :markdown\n        Examine the router; do you understand\n        the flow of control?\n    td.symbol ?\n  \n  tr(valign=\"top\")\n    td\n      :markdown\n        `bundle-context.xml`\n    td\n      :markdown\n        Do you understand how each route is\n        being initialized?\n    td.symbol ?\n  tr(valign=\"top\")\n    td\n      :markdown\n        `camelContext.xml`\n    td\n      :markdown\n        Note how this file simply includes the\n        bundle-context.xml file. This is to allow the camel:run plugin to re-use\n        Spring configuration while running outside of an OSGi container.\n    td.symbol ?\n{filter}\n\n## 3.2 Building and Running the Solution\nTo build the solution use `mvn install`; to run the solution from the command-line, \nuse `mvn camel:run`.\n\n## 3.3 Optional: Deploying the Solution in Servicemix 4\nTo deploy the solution into Servicemix 4, install the `camel-exercises-cbr` feature from \nthe ServiceMix shell if you installed the entire exercise feature beforehand. Otherwise \nfollow the `readme.txt` file.\n\n    karaf@root> features:install camel-exercises-cbr\n\n## 3.4 Validating the Solution\nThe validation here is for the deployment inside Servicemix 4 but it works the same way when started with but then you don\ufffdt need to copy any files and the output directory would be inside `./target/test-classes/camel/out` directory.\nThe XPath router listens on the directory `/camel-exercises/cbr/xml/in` for XML files. Copy a sample file from the `./target/test-classes/camel/in/xml` directory into `/camel-exercises/cbr/xml/in`. It should \"disappear\" after a short interval, and be processed by the route and new files should appear in `/camel-exercises/cbr/xml/out` after a few seconds.\n\nThe header-based router listens on the directory `/camel-exercises/cbr/csv/in`. Copy a sample file from the `./target/test-classes/camel/in/csv` directory. Again, it should \"disappear\" after a short interval, and be processed by the route and new files should appear in `/camel-exercises/cbr/csv/out` after a few seconds." );
      } ) ) ) );
      $_scalate_$_context << ( "\n</div>\n" );
    }
  }
}


class $_scalate_$scalate6897555893210817265_jade extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$scalate6897555893210817265_jade.$_scalate_$render(context)
}
