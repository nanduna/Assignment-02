package com.department.Deparment.DTO;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "departments")
public class DepartmentDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depId;

    @Column(nullable = false)
    private String depName;

    @Column(unique = true, nullable = false)
    private String depCode;
}
