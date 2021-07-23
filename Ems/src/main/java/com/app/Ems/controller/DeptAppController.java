package com.app.Ems.controller;

import com.app.Ems.dto.Dept;
import com.app.Ems.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptAppController {

    @Autowired
    private DeptService dser;


    @GetMapping(value = "/deptlist")
    public List<Dept> getDepartments() {
        return dser.listAll();
    }

    @PostMapping(value = "/savedept")
    public String saveDepartment(@RequestBody Dept d) {
        dser.save(d);
        return "saved";
    }

    @GetMapping("/editdept/{deptID}")
    public Dept getDept(@PathVariable(name = "deptID") int deptID) {
        return dser.get(deptID);

    }

    @DeleteMapping("/deletedept/{deptID}")
    public String deleteEmployee(@PathVariable(name = "deptID") int deptID) {
        dser.delete(deptID);
        return "deleted";
    }
}
