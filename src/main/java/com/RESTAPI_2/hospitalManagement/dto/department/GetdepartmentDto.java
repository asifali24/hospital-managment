package com.RESTAPI_2.hospitalManagement.dto.department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetdepartmentDto {
    private String name;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
