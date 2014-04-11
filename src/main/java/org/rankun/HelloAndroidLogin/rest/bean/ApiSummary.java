package org.rankun.HelloAndroidLogin.rest.bean;

import java.util.List;

/**
 * Created by rankun203 on 14-3-28
 */
public class ApiSummary {
    private String name;
    private String method;
    private String group;
    private String url;
    private List<String> params;

    public ApiSummary(){}
    public ApiSummary(String name, String method, String url) {
        this.name = name;
        this.method = method;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
