package com.RESTAPI_2.hospitalManagement.controller.departmrnt;


import com.RESTAPI_2.hospitalManagement.dto.doctor.CreateDoctorDto;
import com.RESTAPI_2.hospitalManagement.dto.doctor.GetDoctorDto;
import com.RESTAPI_2.hospitalManagement.services.DoctorsServices.DoctorsServices;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@GetMapping
@RestController
@RequiredArgsConstructor
@RequestMapping("/doctors")
public class Doctor {
    final private DoctorsServices doctorServices;

    @PostMapping
    public ResponseEntity<GetDoctorDto> createDoctor(@RequestBody CreateDoctorDto doctorCreationBody){
        return ResponseEntity.status(HttpStatus.OK).body(doctorServices.createDoctor(doctorCreationBody));
    }
}
