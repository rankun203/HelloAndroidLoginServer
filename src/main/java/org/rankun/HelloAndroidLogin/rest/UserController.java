package org.rankun.HelloAndroidLogin.rest;

import org.rankun.HelloAndroidLogin.rest.bean.User;
import org.rankun.HelloAndroidLogin.rest.data.UserDatabase;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by rankun203 on 14-4-3
 */
@Path("/api")
public class UserController {
    @GET
    @PermitAll
    @Path("/users/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(@PathParam("id") int id) {
        return UserDatabase.getUserById(id);
    }
    @GET
    @PermitAll
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers() {
        return UserDatabase.getAllUsers();
    }

    @PUT
    @RolesAllowed("ADMIN")
    @Path("/users/{id}")
    public Response updateUserById(@PathParam("id") int id) {
        //Update the User resource
        UserDatabase.updateUser(id);
        return Response.status(200).build();
    }
    @POST
    @RolesAllowed("ADMIN")
    @Path("/users")
    public Response addUser(@FormParam("username") String username,
                            @FormParam("password") String password) {

        if (null == username || null == password) {
            return Response.status(404).build();
        }

        boolean success = UserDatabase.addUser(username, password);


        if (success) {
            return Response.status(200).build();
        } else {
            return Response.status(409).build();
        }
    }

}
