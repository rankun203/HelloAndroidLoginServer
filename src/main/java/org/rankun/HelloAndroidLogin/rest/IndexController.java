package org.rankun.HelloAndroidLogin.rest;

import org.rankun.HelloAndroidLogin.rest.bean.ApiSummary;
import org.rankun.HelloAndroidLogin.rest.tool.URITool;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rankun203 on 14-3-28
 */
@Path("/api")
public class IndexController {

    @GET
    @Path("/index")
    @PermitAll
    @Produces(MediaType.APPLICATION_JSON)
    public List index(@Context HttpServletRequest req) {

        List<ApiSummary> apiList = new LinkedList<ApiSummary>();
        ApiSummary api1 = new ApiSummary("Authentication", "POST",
                URITool.getHost(req) + "/api/authenticate");
        ApiSummary api2 = new ApiSummary("Get Users", "GET",
                URITool.getHost(req) + "/api/users");
        ApiSummary api3 = new ApiSummary("Get User", "GET",
                URITool.getHost(req) + "/api/users/1");
        ApiSummary api4 = new ApiSummary("Update User", "PUT",
                URITool.getHost(req) + "/api/users/1");
        api4.setGroup("ADMIN");
        ApiSummary api5 = new ApiSummary("Add User", "POST",
                URITool.getHost(req) + "/api/users");
        api5.setGroup("ADMIN");
        List<String> params = new ArrayList<String>();
        params.add("username");
        params.add("password");
        api5.setParams(params);

        apiList.add(api1);
        apiList.add(api2);
        apiList.add(api3);
        apiList.add(api4);
        apiList.add(api5);
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
