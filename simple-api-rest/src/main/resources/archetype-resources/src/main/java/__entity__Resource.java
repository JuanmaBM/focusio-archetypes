package ${package};

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class ${entity}Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String greeting() {
        return "Hello World!";
    }
}
