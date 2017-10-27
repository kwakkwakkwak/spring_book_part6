package org.zerock.domain;

public class UserVO {

    private String uid;
    private String upw;
    private String string;
    private int upoint;


    @Override
    public String toString() {
        return "UserVO{" +
                "uid='" + uid + '\'' +
                ", upw='" + upw + '\'' +
                ", string='" + string + '\'' +
                ", upoint=" + upoint +
                '}';
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUpw() {
        return upw;
    }

    public void setUpw(String upw) {
        this.upw = upw;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getUpoint() {
        return upoint;
    }

    public void setUpoint(int upoint) {
        this.upoint = upoint;
    }
}
