/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */

import scala.collection.JavaConversions._
import org.fusesource.scalate.support.TemplateConversions._

object $_scalate_$scalate7763202339621588663_jade {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    import _root_.org.fusesource.scalate.support.RenderHelper.{sanitize=>$_scalate_$_sanitize, preserve=>$_scalate_$_preserve, indent=>$_scalate_$_indent, smart_sanitize=>$_scalate_$_smart_sanitize, attributes=>$_scalate_$_attributes}
    ;{
      implicit val context: org.fusesource.scalate.servlet.ServletRenderContext = $_scalate_$_context.attribute("context")
      import context._
      
    // common imports go here
    import Website._;
    
      
      $_scalate_$_context << ( "<table>\n  <tr>\n    <th>File</th>\n    <th>Note</th>\n    <th>Check</th>\n  </tr>\n  <tr>\n    <td rowspan=\"2\">\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "`pom.xml`" );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td>\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "Look at each of the dependencies in\nthe `<dependencies>` section. Do you understand why each is required?" );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td class=\"symbol\">?</td>\n  </tr>\n  <tr valign=\"top\">\n    <td>\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "Examine the configuration\ninstructions for the `maven-bundle-plugin`. Do you understand how the\nOSGi bundle is being created?" );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td class=\"symbol\">?</td>\n  </tr>\n  <tr valign=\"top\">\n    <td rowspan=\"2\">\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "`RouteByCurrencyRouter.java`" );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td>\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "Examine the router; do you understand\nthe flow of control?" );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td class=\"symbol\">?</td>\n  </tr>\n  <tr valign=\"top\">\n    <td>\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "Why are the `InitializingBean`\nand `DisposableBean` interfaces implemented?" );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td class=\"symbol\">?</td>\n  </tr>\n  <tr valign=\"top\">\n    <td>\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "`RouteByFileNameRouter.java`" );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td>\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "Examine the router; do you understand\nthe flow of control?" );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td class=\"symbol\">?</td>\n  </tr>\n  <tr valign=\"top\">\n    <td>\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "`bundle-context.xml`" );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td>\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "Do you understand how each route is\nbeing initialized?" );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td class=\"symbol\">?</td>\n  </tr>\n  <tr valign=\"top\">\n    <td>\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "`camelContext.xml`" );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td>\n      " );
      $_scalate_$_context << ( $_scalate_$_indent ( "      ", $_scalate_$_context.value ( _root_.org.fusesource.scalate.filter.FilterRequest("markdown", $_scalate_$_context.capture { 
        $_scalate_$_context << ( "Note how this file simply includes the\nbundle-context.xml file. This is to allow the camel:run plugin to re-use\nSpring configuration while running outside of an OSGi container." );
      } ) ) ) );
      $_scalate_$_context << ( "\n    </td>\n    <td class=\"symbol\">?</td>\n  </tr>\n</table>\n" );
    }
  }
}


class $_scalate_$scalate7763202339621588663_jade extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$scalate7763202339621588663_jade.$_scalate_$render(context)
}
