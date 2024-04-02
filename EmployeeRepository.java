package com.spring.CrudApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.CrudApp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
}
