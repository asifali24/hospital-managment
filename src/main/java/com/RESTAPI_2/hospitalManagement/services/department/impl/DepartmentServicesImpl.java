package com.RESTAPI_2.hospitalManagement.services.department.impl;

import com.RESTAPI_2.hospitalManagement.controller.departmrnt.Department;
import com.RESTAPI_2.hospitalManagement.dto.department.CreateDepartmentDto;
import com.RESTAPI_2.hospitalManagement.dto.department.GetdepartmentDto;
import com.RESTAPI_2.hospitalManagement.entity.Departments;
import com.RESTAPI_2.hospitalManagement.repository.department.DepartmentRepo;
import com.RESTAPI_2.hospitalManagement.services.department.DepartmentServices;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class DepartmentServicesImpl implements DepartmentServices {
    private final DepartmentRepo departmentRepo;
    private final ModelMapper modelMapper;


    @Override
    public GetdepartmentDto createDepartment(CreateDepartmentDto createDepartment) {
        Departments dep = modelMapper.map(createDepartment ,Departments.class);
        Departments newDep = departmentRepo.save(dep);
        return modelMapper.map(newDep, GetdepartmentDto.class);
    }

    @Override
    public List<GetdepartmentDto> getDepartments(Boolean status){
        List<Departments> listOfDepartments ;
        if(status ==true){
            listOfDepartments = departmentRepo.findByStatus(status);
        }else{
            listOfDepartments = departmentRepo.findAll();
        }
        return listOfDepartments.stream()
                .map(d -> modelMapper.map(d, GetdepartmentDto.class))
                .toList();
    }

}
