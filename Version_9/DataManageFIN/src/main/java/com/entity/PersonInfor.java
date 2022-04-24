package com.entity;

import java.sql.Date;

public class PersonInfor {
    // 序号
    private int pid ;
    // 姓名
    private String pname ;
    // 性别
    private String psex ;
    // 出生年月
    private Date pbirth ;
    // 民族
    private String pnational ;
    // 籍贯
    private String pnativeplace ;
    // 政治面貌
    private String ppoliticalstatus ;
    // 工作单位
    private String pworkplace;
    // 学历
    private String pxueli ;
    // 学位
    private String pxuewei;
    // 职称
    private String pzhicheng;
    // 现任职务
    private String pcurrentposition ;
    // 任同职级时间
    private Date pTenureOfTheSameRank ;
    // 任现职级时间
    private Date pLengthOfTenure ;
    // 社会职务
    private String psocialwork;
    // 参加工作时间
    private Date pjoinworktime;
    // 加入党派时间
    private Date pjoinpartytime;
    // 获得荣誉
    private String phonor ;
    // 培训情况
    private String pcanzhengyizheng ;
    // 参政议政情况
    private String ptraining;
    // 联系方式
    private String pcontactnum ;
    // 备注
    private String pinfor;

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public String getPsex() {
        return psex;
    }

    public Date getPbirth() {
        return pbirth;
    }

    public String getPnational() {
        return pnational;
    }

    public String getPnativeplace() {
        return pnativeplace;
    }

    public String getPpoliticalstatus() {
        return ppoliticalstatus;
    }

    public String getPworkplace() {
        return pworkplace;
    }

    public String getPxueli() {
        return pxueli;
    }

    public String getPxuewei() {
        return pxuewei;
    }

    public String getPzhicheng() {
        return pzhicheng;
    }

    public String getPcurrentposition() {
        return pcurrentposition;
    }

    public Date getpTenureOfTheSameRank() {
        return pTenureOfTheSameRank;
    }

    public Date getpLengthOfTenure() {
        return pLengthOfTenure;
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

    public String getPcanzhengyizheng() {
        return pcanzhengyizheng;
    }

    public String getPtraining() {
        return ptraining;
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

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPsex(String psex) {
        this.psex = psex;
    }

    public void setPbirth(Date pbirth) {
        this.pbirth = pbirth;
    }

    public void setPnational(String pnational) {
        this.pnational = pnational;
    }

    public void setPnativeplace(String pnativeplace) {
        this.pnativeplace = pnativeplace;
    }

    public void setPpoliticalstatus(String ppoliticalstatus) {
        this.ppoliticalstatus = ppoliticalstatus;
    }

    public void setPworkplace(String pworkplace) {
        this.pworkplace = pworkplace;
    }

    public void setPxueli(String pxueli) {
        this.pxueli = pxueli;
    }

    public void setPxuewei(String pxuewei) {
        this.pxuewei = pxuewei;
    }

    public void setPzhicheng(String pzhicheng) {
        this.pzhicheng = pzhicheng;
    }

    public void setPcurrentposition(String pcurrentposition) {
        this.pcurrentposition = pcurrentposition;
    }

    public void setpTenureOfTheSameRank(Date pTenureOfTheSameRank) {
        this.pTenureOfTheSameRank = pTenureOfTheSameRank;
    }

    public void setpLengthOfTenure(Date pLengthOfTenure) {
        this.pLengthOfTenure = pLengthOfTenure;
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

    public void setPcanzhengyizheng(String pcanzhengyizheng) {
        this.pcanzhengyizheng = pcanzhengyizheng;
    }

    public void setPtraining(String ptraining) {
        this.ptraining = ptraining;
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
                ", pbirth=" + pbirth +
                ", pnational='" + pnational + '\'' +
                ", pnativeplace='" + pnativeplace + '\'' +
                ", ppoliticalstatus='" + ppoliticalstatus + '\'' +
                ", pworkplace='" + pworkplace + '\'' +
                ", pxueli='" + pxueli + '\'' +
                ", pxuewei='" + pxuewei + '\'' +
                ", pzhicheng='" + pzhicheng + '\'' +
                ", pcurrentposition='" + pcurrentposition + '\'' +
                ", pTenureOfTheSameRank=" + pTenureOfTheSameRank +
                ", pLengthOfTenure=" + pLengthOfTenure +
                ", psocialwork='" + psocialwork + '\'' +
                ", pjoinworktime=" + pjoinworktime +
                ", pjoinpartytime=" + pjoinpartytime +
                ", phonor='" + phonor + '\'' +
                ", pcanzhengyizheng='" + pcanzhengyizheng + '\'' +
                ", ptraining='" + ptraining + '\'' +
                ", pcontactnum='" + pcontactnum + '\'' +
                ", pinfor='" + pinfor + '\'' +
                '}';
    }

    public PersonInfor(int pid, String pname, String psex, Date pbirth, String pnational, String pnativeplace, String ppoliticalstatus, String pworkplace, String pxueli, String pxuewei, String pzhicheng, String pcurrentposition, Date pTenureOfTheSameRank, Date pLengthOfTenure, String psocialwork, Date pjoinworktime, Date pjoinpartytime, String phonor, String pcanzhengyizheng, String ptraining, String pcontactnum, String pinfor) {
        this.pid = pid;
        this.pname = pname;
        this.psex = psex;
        this.pbirth = pbirth;
        this.pnational = pnational;
        this.pnativeplace = pnativeplace;
        this.ppoliticalstatus = ppoliticalstatus;
        this.pworkplace = pworkplace;
        this.pxueli = pxueli;
        this.pxuewei = pxuewei;
        this.pzhicheng = pzhicheng;
        this.pcurrentposition = pcurrentposition;
        this.pTenureOfTheSameRank = pTenureOfTheSameRank;
        this.pLengthOfTenure = pLengthOfTenure;
        this.psocialwork = psocialwork;
        this.pjoinworktime = pjoinworktime;
        this.pjoinpartytime = pjoinpartytime;
        this.phonor = phonor;
        this.pcanzhengyizheng = pcanzhengyizheng;
        this.ptraining = ptraining;
        this.pcontactnum = pcontactnum;
        this.pinfor = pinfor;
    }

    public PersonInfor(){

    }

    public PersonInfor(String pname, String psex, Date pbirth, String pnational, String pnativeplace, String ppoliticalstatus, String pworkplace, String pxueli, String pxuewei, String pzhicheng, String pcurrentposition, Date pTenureOfTheSameRank, Date pLengthOfTenure, String psocialwork, Date pjoinworktime, Date pjoinpartytime, String phonor, String pcanzhengyizheng, String ptraining, String pcontactnum, String pinfor) {
        this.pname = pname;
        this.psex = psex;
        this.pbirth = pbirth;
        this.pnational = pnational;
        this.pnativeplace = pnativeplace;
        this.ppoliticalstatus = ppoliticalstatus;
        this.pworkplace = pworkplace;
        this.pxueli = pxueli;
        this.pxuewei = pxuewei;
        this.pzhicheng = pzhicheng;
        this.pcurrentposition = pcurrentposition;
        this.pTenureOfTheSameRank = pTenureOfTheSameRank;
        this.pLengthOfTenure = pLengthOfTenure;
        this.psocialwork = psocialwork;
        this.pjoinworktime = pjoinworktime;
        this.pjoinpartytime = pjoinpartytime;
        this.phonor = phonor;
        this.pcanzhengyizheng = pcanzhengyizheng;
        this.ptraining = ptraining;
        this.pcontactnum = pcontactnum;
        this.pinfor = pinfor;
    }
}
