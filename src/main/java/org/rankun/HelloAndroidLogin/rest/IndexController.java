package org.rankun.HelloAndroidLogin.rest;

import org.rankun.HelloAndroidLogin.rest.bean.ApiSummary;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
@Path("/")
public class IndexController {

    @GET
    @Path("/index")
    @Produces(MediaType.APPLICATION_JSON)
    public List index(@Context HttpServletRequest req) {

        List<ApiSummary> apiList = new LinkedList<ApiSummary>();
        ApiSummary api1 = new ApiSummary("Authentication", "POST",
                req.getRequestURL() + "/api/authenticate",
                null);

        apiList.add(api1);
        return apiList;
    }

    @GET
    @Path("/")
    public void blank(@Context HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/index");
    }

}
