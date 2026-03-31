package com.RESTAPI_2.hospitalManagement.repository.DoctorRepo;


import com.RESTAPI_2.hospitalManagement.entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctors, Long> {
}
