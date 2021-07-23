package com.app.Ems.controller;


import com.app.Ems.dto.Emp;
import com.app.Ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class EmsAppController {

    @Autowired
    private EmpService ser;

   /*
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("employee", new Emp());
        return "new";
    }
*/

    @GetMapping(value = "/emplist")
    public ResponseEntity<Page<Emp>> getEmployees(Pageable x) {
        return ResponseEntity.ok(ser.listAll(x));
    }


    @PostMapping(value = "/save")
    public ResponseEntity saveEmployee(@RequestBody Emp e) {
        ser.save(e);
        return ResponseEntity.ok(null);
    }


    @GetMapping("/editemp/{empID}")
    public ResponseEntity <Emp> getEmp(@PathVariable(name = "empID") int empID) {
        return ResponseEntity.ok(ser.get(empID));
    }

    
    @DeleteMapping("/deleteemp/{empID}")
    public ResponseEntity<String> deleteEmployee(@PathVariable(name = "empID") int empID) {
        ser.delete(empID);
        return ResponseEntity.ok().build();
    }

}
