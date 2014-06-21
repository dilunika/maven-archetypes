#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by kd40173 on 21/06/14.
 */
@Component
public class GreetingRouteBuilder extends RouteBuilder {

    @Autowired
    private GreetingProcessor greetingProcessor;

    @Override
    public void configure() throws Exception {

          from("cxfrs:bean:restServer?bindingStyle=SimpleConsumer")
              .process(greetingProcessor);
    }
}
