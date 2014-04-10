package org.rankun.HelloAndroidLogin.rest;

import org.rankun.HelloAndroidLogin.rest.bean.ApiSummary;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rankun203 on 14-3-28
 */
@Path("/ap")
public class IndexController {

    @GET
    @Path("/index")
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    public List index(@Context HttpServletRequest req) {

        List<ApiSummary> apiList = new LinkedList<ApiSummary>();
        ApiSummary api1 = new ApiSummary("Authentication", "POST",
                "/api/authenticate",
                null);

        apiList.add(api1);
        return apiList;
    }

    @GET
    @PermitAll
    @Produces(MediaType.TEXT_PLAIN)
    public String blank(@Context HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/api/index");
        return "success";
    }

}
