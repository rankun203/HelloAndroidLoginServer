package org.rankun.HelloAndroidLogin.rest;

import org.rankun.HelloAndroidLogin.rest.bean.Info;
import org.rankun.HelloAndroidLogin.rest.data.UserDatabase;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

/**
 * Created by rankun203 on 14-3-28
 */
@Path("/")
public class LoginController {

    @POST
    @Path("/authenticate")
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    public Info authenticate() {
        return new Info("success");
    }

    @GET
    @PermitAll
    @Path("/users/{id}")
    public Response getUserById(@PathParam("id") int id,
                                @Context Request req) {
        Response.ResponseBuilder rb = Response.ok(UserDatabase.getUserById(id));
        return rb.build();
    }

    @PUT
    @RolesAllowed("ADMIN")
    @Path("/users/{id}")
    public Response updateUserById(@PathParam("id") int id) {
        //Update the User resource
        UserDatabase.updateUser(id);
        return Response.status(200).build();
    }
}
