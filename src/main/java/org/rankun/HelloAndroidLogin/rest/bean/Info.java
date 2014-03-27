package org.rankun.HelloAndroidLogin.rest.bean;

/**
 * Created by rankun203 on 14-3-28.
 */
public class Info {
    private String info;

    public Info(){}

    public Info(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Info{" +
                "info='" + info + '\'' +
                '}';
    }
}
