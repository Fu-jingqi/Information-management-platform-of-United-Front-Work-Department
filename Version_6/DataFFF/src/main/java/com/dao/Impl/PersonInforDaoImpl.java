package com.dao.Impl;

import com.dao.PersonInforDao;
import com.entity.PersonInfor;
import com.entity.person;
import com.util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonInforDaoImpl extends BaseDao implements PersonInforDao {
    @Override
    public List<PersonInfor> getAllPerson() {
        String sql = "select * from workpersoninfor" ;
        ResultSet rs = this.getDataByAny(sql,new Object[]{}) ;
        List<PersonInfor> list = new ArrayList<>() ;
        try {
            while(rs.next()){
                PersonInfor p = new PersonInfor() ;
                p.setPid(rs.getInt(1)) ;
                p.setPname(rs.getString(2));
                p.setPsex(rs.getString(3));
                p.setPbirth(rs.getDate(4));
                p.setPnational(rs.getString(5));
                p.setPnativeplace(rs.getString(6));
                p.setPpoliticalstatus(rs.getString(7));
                p.setPworkplace(rs.getString(8));
                p.setPzhicheng(rs.getString(9));
                p.setPxueli(rs.getString(10));
                p.setPcurrentposition(rs.getString(11));
                p.setPsocialwork(rs.getString(12));
                p.setPjoinworktime(rs.getDate(13));
                p.setPjoinpartytime(rs.getDate(14));
                p.setPhonor(rs.getString(15));
                p.setPtraining(rs.getString(16));
                p.setPcanzhengyizheng(rs.getString(17));
                p.setPcontactnum(rs.getString(18));
                p.setPinfor(rs.getString(19));
                list.add(p) ;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list ;
    }

    @Override
    public int delPersonById(int pid) {
        String sql = "delete from workpersoninfor where pid=?" ;
        return this.modifyData(sql,new Object[] {pid}) ;
    }

    @Override
    public PersonInfor getPersonById(int pid) {
        String sql = "select * from workpersoninfor where pid=?" ;
        ResultSet rs = this.getDataByAny(sql,new Object[] {pid}) ;
        PersonInfor p = new PersonInfor() ;
        try {
            while(rs.next()){
//                PersonInfor p = new PersonInfor() ;
                p.setPid(rs.getInt(1)) ;
                p.setPname(rs.getString(2));
                p.setPsex(rs.getString(3));
                p.setPbirth(rs.getDate(4));
                p.setPnational(rs.getString(5));
                p.setPnativeplace(rs.getString(6));
                p.setPpoliticalstatus(rs.getString(7));
                p.setPworkplace(rs.getString(8));
                p.setPzhicheng(rs.getString(9));
                p.setPxueli(rs.getString(10));
                p.setPcurrentposition(rs.getString(11));
                p.setPsocialwork(rs.getString(12));
                p.setPjoinworktime(rs.getDate(13));
                p.setPjoinpartytime(rs.getDate(14));
                p.setPhonor(rs.getString(15));
                p.setPtraining(rs.getString(16));
                p.setPcanzhengyizheng(rs.getString(17));
                p.setPcontactnum(rs.getString(18));
                p.setPinfor(rs.getString(19));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public int UpdatePersonById(PersonInfor person) {
        String sql = "update workpersoninfor set pname=?,psex=?,pbirth=?,pnational=?,pnativeplace=?,ppoliticalstatus=?,pworkplace=?,pzhicheng=?,pxueli=?,pcurrentposition=?,psocialwork=?,pjoinworktime=?,pjoinpartytime=?,phonor=?,ptraining=?,pcanzhengyizheng=?,pcontactnum=?,pinfor=? where pid=?" ;
        return this.modifyData(sql,new Object[] {person.getPname(),person.getPsex(),person.getPbirth(),person.getPnational(),person.getPnativeplace(),person.getPpoliticalstatus(),person.getPworkplace(),person.getPzhicheng(),person.getPxueli(),person.getPcurrentposition(),person.getPsocialwork(),person.getPjoinworktime(),person.getPjoinpartytime(),person.getPhonor(),person.getPtraining(),person.getPcanzhengyizheng(),person.getPcontactnum(),person.getPcontactnum(),person.getPid()}) ;
    }

    @Override
    public int AddPerson(PersonInfor person) {
        String sql = "insert into workpersoninfor (pname, psex, pbirth,pnational,pnativeplace,ppoliticalstatus,pworkplace,pzhicheng,pxueli,pcurrentposition,psocialwork,pjoinworktime,pjoinpartytime,phonor,ptraining,pcanzhengyizheng,pcontactnum,pinfor) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;
        return this.modifyData(sql,new Object[]{person.getPname(),person.getPsex(),person.getPbirth(),person.getPnational(),person.getPnativeplace(),person.getPpoliticalstatus(),person.getPworkplace(),person.getPzhicheng(),person.getPxueli(),person.getPcurrentposition(),person.getPsocialwork(),person.getPjoinworktime(),person.getPjoinpartytime(),person.getPhonor(),person.getPtraining(),person.getPcanzhengyizheng(),person.getPcontactnum(),person.getPcontactnum()}) ;
    }

}
