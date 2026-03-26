package com.RESTAPI_2.hospitalManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "department", indexes = {
                @Index(name = "ind_dep_name", columnList = "name")
})
public class Departments {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(unique = true)
        private String name;

        private Boolean status = true;

        @CreationTimestamp
        @Column(updatable = false)
        private LocalDateTime createdAt;

        @UpdateTimestamp
        private LocalDateTime updatedAt;

}