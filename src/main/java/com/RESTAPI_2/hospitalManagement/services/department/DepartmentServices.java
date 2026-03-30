package com.RESTAPI_2.hospitalManagement.services.department;

import com.RESTAPI_2.hospitalManagement.dto.department.CreateDepartmentDto;
import com.RESTAPI_2.hospitalManagement.dto.department.GetdepartmentDto;

import java.util.List;


public interface DepartmentServices {
    GetdepartmentDto createDepartment(CreateDepartmentDto createDepartment);
    List<GetdepartmentDto> getDepartments(Boolean status);
}
