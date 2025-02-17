package com.department.Deparment.Repository;

import com.department.Deparment.DTO.DepartmentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepatmentRepository extends JpaRepository<DepartmentDTO, Long> {

}
