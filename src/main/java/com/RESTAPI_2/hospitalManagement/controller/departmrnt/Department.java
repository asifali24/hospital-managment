package com.RESTAPI_2.hospitalManagement.controller.departmrnt;

import com.RESTAPI_2.hospitalManagement.dto.department.CreateDepartmentDto;
import com.RESTAPI_2.hospitalManagement.dto.department.GetdepartmentDto;
import com.RESTAPI_2.hospitalManagement.services.department.DepartmentServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departments")
public class Department {

final private DepartmentServices departmentServices;


    @PostMapping
    public ResponseEntity<GetdepartmentDto> createDepartments(@RequestBody CreateDepartmentDto createDepartment){
        return ResponseEntity.status(HttpStatus.OK).body(departmentServices.createDepartment(createDepartment) );
    }

    @GetMapping
    public ResponseEntity<List<GetdepartmentDto>> getDepartments(@RequestParam(defaultValue = "true") Boolean status){

        return ResponseEntity.status(HttpStatus.OK).body(departmentServices.getDepartments(status));
    }
}
