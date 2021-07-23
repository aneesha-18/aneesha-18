package com.app.Ems.service;

import com.app.Ems.dto.Dept;
import com.app.Ems.dto.Emp;
import com.app.Ems.exception.CustomException;
import com.app.Ems.repository.DeptRepo;
import com.app.Ems.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    private DeptRepo drep;

    public List<Dept> listAll() {

        return drep.findAll();
    }

    public void save(Dept d){
        try {
            drep.save(d);
        }catch (Exception exp){
            throw new CustomException("Department could not be saved.");
        }
    }


    public Dept get(int deptID) {

        return drep.findById(deptID)
                .orElseThrow(() -> new CustomException("Department not found."));
    }

    public void delete(int deptID) {

        if(deptID==0) {
            throw new CustomException("Department ID cannot be null.");
            //rep.deleteById(empID);
        }

        drep.deleteById(deptID);
    }
}
