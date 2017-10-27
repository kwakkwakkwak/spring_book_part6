package org.zerock.domain;

import java.util.Date;

public class MessageVO {
    private Integer mid;
    private String targetid;
    private String sender;
    private String message;
    private Date poendate;
    private Date senddate;

    @Override
    public String toString() {
        return "MessageVO{" +
                "mid=" + mid +
                ", targetid='" + targetid + '\'' +
                ", sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", poendate=" + poendate +
                ", senddate=" + senddate +
                '}';
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getTargetid() {
        return targetid;
    }

    public void setTargetid(String targetid) {
        this.targetid = targetid;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getPoendate() {
        return poendate;
    }

    public void setPoendate(Date poendate) {
        this.poendate = poendate;
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }
}
