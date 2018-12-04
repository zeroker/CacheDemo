package com.swu.domain;

import java.sql.Date;

public class Student {
    private Integer id;
    private String ano;
    private String sname;
    private String sage;
    private Date sdate;
    private String ssex;

    public Student() {
    }

    public Student(Integer id, String ano, String sname, String sage, Date sdate, String ssex) {
        this.id = id;
        this.ano = ano;
        this.sname = sname;
        this.sage = sage;
        this.sdate = sdate;
        this.ssex = ssex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", ano='" + ano + '\'' +
                ", sname='" + sname + '\'' +
                ", sage='" + sage + '\'' +
                ", sdate=" + sdate +
                ", ssex='" + ssex + '\'' +
                '}';
    }
}
