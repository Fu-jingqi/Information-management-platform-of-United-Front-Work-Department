package com.service;

import com.entity.PersonInfor;

import java.util.List;

public interface PersonInforService {
    public List<PersonInfor> getAllPerson() ;

    public int delPersonById(int pid) ;

    public PersonInfor getPersonById(int pid) ;

    public int UpdatePersonById(PersonInfor person) ;

    public int AddPerson(PersonInfor person) ;
}
