#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by kd40173 on 20/06/14.
 */
public class ServiceFrontEnd {

    @Path("/")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sayHello(Greeting greeting){
        return null;
    }
}
