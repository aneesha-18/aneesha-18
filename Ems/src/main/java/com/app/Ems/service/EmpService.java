package com.app.Ems.service;

import com.app.Ems.dto.Emp;
import com.app.Ems.exception.CustomException;
import com.app.Ems.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private EmpRepo rep;

    public Page<Emp> listAll(Pageable x) {
        return rep.findAll(x);
    }


    public void save(Emp e){
        try {
            rep.save(e);
        }catch (Exception exp){
            throw new CustomException("Employee could not be saved.");
        }
    }


    public Emp get(int empID) {

        return rep.findById(empID)
                .orElseThrow(() -> new CustomException("Employee not found."));
        //return rep.findById(empID).get();
    }


    public void delete(int empID) {

        if(empID==0) {
            throw new CustomException("Employee ID cannot be null.");
            //rep.deleteById(empID);
        }
        rep.deleteById(empID);
    }

}
