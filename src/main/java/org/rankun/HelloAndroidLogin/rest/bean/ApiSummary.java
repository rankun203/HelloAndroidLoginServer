package org.rankun.HelloAndroidLogin.rest.bean;

/**
 * Created by rankun203 on 14-3-28
 */
public class ApiSummary {
    private String name;
    private String method;
    private String url;
    private Param params;

    public class Param {
        private String key;
        private String value;

        public Param(){}
        public Param(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
    public ApiSummary(){}
    public ApiSummary(String name, String method, String url, Param params) {
        this.name = name;
        this.method = method;
        this.url = url;
        this.params = params;
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

    public Param getParams() {
        return params;
    }

    public void setParams(Param params) {
        this.params = params;
    }
}
