package com.entity;

import java.sql.Date;
public class PersonInfor {
    private int pid ;
    private String pname ;
    private String psex ;
    private Date pbirth ;
    private String pnational ;
    private String pnativeplace ;
    private String ppoliticalstatus ;
    private String pworkplace;
    private String pzhicheng;
    private String pxueli ;
    private String pcurrentposition ;
    private String psocialwork;
    private Date pjoinworktime;
    private Date pjoinpartytime;
    private String phonor ;
    private String ptraining;
    private String pcanzhengyizheng ;
    private String pcontactnum ;
    private String pinfor;

    public String getPnativeplace() {
        return pnativeplace;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public String getPsex() {
        return psex;
    }

    public String getPnational() {
        return pnational;
    }

    public Date getPbirth() {
        return pbirth;
    }

    public String getPpoliticalstatus() {
        return ppoliticalstatus;
    }

    public String getPworkplace() {
        return pworkplace;
    }

    public String getPzhicheng() {
        return pzhicheng;
    }

    public String getPxueli() {
        return pxueli;
    }

    public String getPcurrentposition() {
        return pcurrentposition;
    }

    public String getPsocialwork() {
        return psocialwork;
    }

    public Date getPjoinworktime() {
        return pjoinworktime;
    }

    public Date getPjoinpartytime() {
        return pjoinpartytime;
    }

    public String getPhonor() {
        return phonor;
    }

    public String getPtraining() {
        return ptraining;
    }

    public String getPcanzhengyizheng() {
        return pcanzhengyizheng;
    }

    public String getPcontactnum() {
        return pcontactnum;
    }

    public String getPinfor() {
        return pinfor;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPnativeplace(String pnativeplace) {
        this.pnativeplace = pnativeplace;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPsex(String psex) {
        this.psex = psex;
    }

    public void setPnational(String pnational) {
        this.pnational = pnational;
    }

    public void setPbirth(Date pbirth) {
        this.pbirth = pbirth;
    }

    public void setPpoliticalstatus(String ppoliticalstatus) {
        this.ppoliticalstatus = ppoliticalstatus;
    }

    public void setPworkplace(String pworkplace) {
        this.pworkplace = pworkplace;
    }

    public void setPzhicheng(String pzhicheng) {
        this.pzhicheng = pzhicheng;
    }

    public void setPxueli(String pxueli) {
        this.pxueli = pxueli;
    }

    public void setPcurrentposition(String pcurrentposition) {
        this.pcurrentposition = pcurrentposition;
    }

    public void setPsocialwork(String psocialwork) {
        this.psocialwork = psocialwork;
    }

    public void setPjoinworktime(Date pjoinworktime) {
        this.pjoinworktime = pjoinworktime;
    }

    public void setPjoinpartytime(Date pjoinpartytime) {
        this.pjoinpartytime = pjoinpartytime;
    }

    public void setPhonor(String phonor) {
        this.phonor = phonor;
    }

    public void setPtraining(String ptraining) {
        this.ptraining = ptraining;
    }

    public void setPcanzhengyizheng(String pcanzhengyizheng) {
        this.pcanzhengyizheng = pcanzhengyizheng;
    }

    public void setPcontactnum(String pcontactnum) {
        this.pcontactnum = pcontactnum;
    }

    public void setPinfor(String pinfor) {
        this.pinfor = pinfor;
    }

    @Override
    public String toString() {
        return "PersonInfor{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", psex='" + psex + '\'' +
                ", pnational='" + pnational + '\'' +
                ", pbirth=" + pbirth +
                ", ppoliticalstatus='" + ppoliticalstatus + '\'' +
                ", pworkplace='" + pworkplace + '\'' +
                ", pzhicheng='" + pzhicheng + '\'' +
                ", pxueli='" + pxueli + '\'' +
                ", pcurrentposition='" + pcurrentposition + '\'' +
                ", psocialwork='" + psocialwork + '\'' +
                ", pjoinworktime=" + pjoinworktime +
                ", pjoinpartytime=" + pjoinpartytime +
                ", phonor='" + phonor + '\'' +
                ", ptraining='" + ptraining + '\'' +
                ", pcanzhengyizheng='" + pcanzhengyizheng + '\'' +
                ", pcontactnum='" + pcontactnum + '\'' +
                ", pinfor='" + pinfor + '\'' +
                '}';
    }

    public PersonInfor(int pid, String pname, String psex, Date pbirth, String pnational, String pnativeplace, String ppoliticalstatus, String pworkplace, String pzhicheng, String pxueli, String pcurrentposition, String psocialwork, Date pjoinworktime, Date pjoinpartytime, String phonor, String ptraining, String pcanzhengyizheng, String pcontactnum, String pinfor) {
        this.pid = pid;
        this.pname = pname;
        this.psex = psex;
        this.pbirth = pbirth;
        this.pnational = pnational;
        this.pnativeplace = pnativeplace;
        this.ppoliticalstatus = ppoliticalstatus;
        this.pworkplace = pworkplace;
        this.pzhicheng = pzhicheng;
        this.pxueli = pxueli;
        this.pcurrentposition = pcurrentposition;
        this.psocialwork = psocialwork;
        this.pjoinworktime = pjoinworktime;
        this.pjoinpartytime = pjoinpartytime;
        this.phonor = phonor;
        this.ptraining = ptraining;
        this.pcanzhengyizheng = pcanzhengyizheng;
        this.pcontactnum = pcontactnum;
        this.pinfor = pinfor;
    }

    public PersonInfor(){

    }

    public PersonInfor(String pname, String psex, Date pbirth, String pnational, String pnativeplace, String ppoliticalstatus, String pworkplace, String pzhicheng, String pxueli, String pcurrentposition, String psocialwork, Date pjoinworktime, Date pjoinpartytime, String phonor, String ptraining, String pcanzhengyizheng, String pcontactnum, String pinfor) {
        this.pname = pname;
        this.psex = psex;
        this.pbirth = pbirth;
        this.pnational = pnational;
        this.pnativeplace = pnativeplace;
        this.ppoliticalstatus = ppoliticalstatus;
        this.pworkplace = pworkplace;
        this.pzhicheng = pzhicheng;
        this.pxueli = pxueli;
        this.pcurrentposition = pcurrentposition;
        this.psocialwork = psocialwork;
        this.pjoinworktime = pjoinworktime;
        this.pjoinpartytime = pjoinpartytime;
        this.phonor = phonor;
        this.ptraining = ptraining;
        this.pcanzhengyizheng = pcanzhengyizheng;
        this.pcontactnum = pcontactnum;
        this.pinfor = pinfor;
    }
}
