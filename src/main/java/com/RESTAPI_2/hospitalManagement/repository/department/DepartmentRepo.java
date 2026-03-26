package com.RESTAPI_2.hospitalManagement.repository.department;


import com.RESTAPI_2.hospitalManagement.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Departments, Long > {
}
