package com.RESTAPI_2.hospitalManagement.services.DoctorsServices.impl;

import com.RESTAPI_2.hospitalManagement.dto.doctor.CreateDoctorDto;
import com.RESTAPI_2.hospitalManagement.dto.doctor.GetDoctorDto;
import com.RESTAPI_2.hospitalManagement.entity.Doctors;
import com.RESTAPI_2.hospitalManagement.repository.DoctorRepo.DoctorRepo;
import com.RESTAPI_2.hospitalManagement.services.DoctorsServices.DoctorsServices;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DoctorsServicesImpl implements DoctorsServices {

    final private DoctorRepo doctorRepo;
    private final ModelMapper modelMapper;

    @Override
    public GetDoctorDto createDoctor(CreateDoctorDto doctorBody){
        Doctors doc = modelMapper.map(doctorBody , Doctors.class);
        Doctors newDoc = doctorRepo.save(doc);
        return  modelMapper.map(newDoc,GetDoctorDto.class);
    }
}
