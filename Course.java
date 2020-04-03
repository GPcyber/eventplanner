package com.example.Eduinstitute.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

    @Id
    Long cid;
    String cname;
    String cduration;
    String csdate;

    public Course(Long cid, String cname, String cduration, String csdate) {
        this.cid = cid;
        this.cname = cname;
        this.cduration = cduration;
        this.csdate = csdate;
    }

    public Course() {

    }


    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname(Course course) {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCduration() {
        return cduration;
    }

    public void setCduration(String cduration) {
        this.cduration = cduration;
    }

    public String getCsdate() {
        return csdate;
    }

    public void setCsdate(String csdate) {
        this.csdate = csdate;
    }

//    public String toString(){
//        return "courses{"+"cid="+cid+",cname="+cname+",cduration="+cduration+",csdate="+csdate+"}";
//    }


}
