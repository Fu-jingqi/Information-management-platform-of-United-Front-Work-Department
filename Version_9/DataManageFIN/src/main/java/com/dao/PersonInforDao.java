package com.dao;

import com.entity.PersonInfor;

import java.util.List;

public interface PersonInforDao {

    public List<PersonInfor> getAllPerson() ;

    public int delPersonById(int pid) ;

    public PersonInfor getPersonById(int pid) ;

    public int UpdatePersonById(PersonInfor person) ;

    public int AddPerson(PersonInfor person) ;

    public List<PersonInfor> getPersonByPage(int pageNo ,int pageSize) ;

    public int GetPersonCount() ;
}
