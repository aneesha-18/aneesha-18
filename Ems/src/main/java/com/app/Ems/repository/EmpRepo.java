package com.app.Ems.repository;

import com.app.Ems.dto.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
