package org.rankun.HelloAndroidLogin.rest.tool;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by rankun203 on 14-4-12
 */
public class URITool {
    public static String getHost(HttpServletRequest request) {
        // Example: http://myhost:8080/people?lastname=Fox&age=30

        return request.getScheme() + "://" +   // "http" + "://
                request.getServerName() +       // "myhost"
                ":" + request.getServerPort();
    }
}
