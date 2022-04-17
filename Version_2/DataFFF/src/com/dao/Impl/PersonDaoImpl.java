package com.dao.Impl;

import com.dao.PersonDao;
import com.entity.person;
import com.util.BaseDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl extends BaseDao implements PersonDao {
    @Override
    public boolean login(String pname, String pwd) {
        String sql = "select * from person where pname=? and pwd=?" ;
        ResultSet rs = this.getDataByAny(sql,new Object[]{pname,pwd}) ;
        boolean flag = false ;
            try {
                while(rs.next()){
                    flag = true ;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return flag ;
    }

    @Override
    public List<person> getAllPerson() {
        String sql = "select * from person" ;
        ResultSet rs = this.getDataByAny(sql,new Object[]{}) ;
        List<person> list = new ArrayList<>() ;
        try {
            while(rs.next()){
                person p = new person() ;
                p.setPid(rs.getInt(1)) ;
                p.setPname(rs.getString(2));
                p.setPage(rs.getInt(3));
                p.setPbirth(rs.getDate(4)) ;
                p.setPwd(rs.getString(5));
                list.add(p) ;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list ;
    }

    @Override
    public int delPersonById(int pid) {
        String sql = "delete from person where pid=?" ;
        return this.modifyData(sql,new Object[] {pid}) ;
    }
}
