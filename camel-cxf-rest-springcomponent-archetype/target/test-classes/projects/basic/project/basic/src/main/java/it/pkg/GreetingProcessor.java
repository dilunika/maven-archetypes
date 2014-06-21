package it.pkg;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;

/**
 * Created by kd40173 on 20/06/14.
 */

@Component
public class GreetingProcessor implements Processor {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {

        Greeting greeting = exchange.getIn().getBody(Greeting.class);

        LOGGER.info("Greetings : {}", greeting);

        exchange.getIn().setBody(Response.ok().build());
    }
}
