package com.RESTAPI_2.hospitalManagement.dto.doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateDoctorDto {
    private String name;
    private Integer specialisation;
}
