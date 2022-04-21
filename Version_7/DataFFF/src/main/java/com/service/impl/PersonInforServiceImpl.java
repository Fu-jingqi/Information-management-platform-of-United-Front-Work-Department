package com.service.impl;

import com.dao.Impl.PersonInforDaoImpl;
import com.dao.PersonInforDao;
import com.entity.PersonInfor;
import com.service.PersonInforService;
import java.util.List;

public class PersonInforServiceImpl implements PersonInforService {

    private PersonInforDao pd = new PersonInforDaoImpl();
    @Override
    public List<PersonInfor> getAllPerson() {
        return pd.getAllPerson() ;
    }

    @Override
    public int delPersonById(int pid) {
        return pd.delPersonById(pid) ;
    }

    @Override
    public PersonInfor getPersonById(int pid) {
        return pd.getPersonById(pid);
    }

    @Override
    public int UpdatePersonById(PersonInfor person) {
        return pd.UpdatePersonById(person);
    }

    @Override
    public int AddPerson(PersonInfor person) {
        return pd.AddPerson(person);
    }
}
