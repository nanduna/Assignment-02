package com.employee.Employee.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.employee.Employee.DTO.EmployeeDTO;

public interface EmployeeRepositoty extends JpaRepository<EmployeeDTO, Long>{

    List<EmployeeDTO> findByDepartmentId(Long departmentId);
}
