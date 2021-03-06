package io.quarkus.ts.openshift.scaling;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.UUID;

@Path("/scaling")
public class ScalingResource {

    private final static UUID uuid = UUID.randomUUID();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return uuid.toString();
    }
}
