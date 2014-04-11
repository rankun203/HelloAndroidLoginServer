package org.rankun.HelloAndroidLogin.rest;

import org.rankun.HelloAndroidLogin.rest.bean.Info;

import javax.annotation.security.PermitAll;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by rankun203 on 14-3-28
 */
@Path("/api")
public class LoginController {

    @POST
    @Path("/authenticate")
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    public Info authenticate() {
        return new Info("success");
    }

}
