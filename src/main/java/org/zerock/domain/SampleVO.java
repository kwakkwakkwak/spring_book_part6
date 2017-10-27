package org.zerock.domain;

public class SampleVO {

    private Integer mno;
    private String fristName;
    private String lastName;

    @Override
    public String toString() {
        return "SampleVO{" +
                "mno=" + mno +
                ", fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Integer getMno() {
        return mno;
    }

    public void setMno(Integer mno) {
        this.mno = mno;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
