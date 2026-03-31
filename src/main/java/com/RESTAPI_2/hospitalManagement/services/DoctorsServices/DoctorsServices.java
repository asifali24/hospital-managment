package com.RESTAPI_2.hospitalManagement.services.DoctorsServices;

import com.RESTAPI_2.hospitalManagement.dto.doctor.CreateDoctorDto;
import com.RESTAPI_2.hospitalManagement.dto.doctor.GetDoctorDto;

public interface DoctorsServices {
    GetDoctorDto createDoctor(CreateDoctorDto createDoctor);
}
