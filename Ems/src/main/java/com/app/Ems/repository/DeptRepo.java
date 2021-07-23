package com.app.Ems.repository;

import com.app.Ems.dto.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepo extends JpaRepository<Dept, Integer> {
}
