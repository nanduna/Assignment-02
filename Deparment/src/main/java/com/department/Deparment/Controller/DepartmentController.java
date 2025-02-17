package com.department.Deparment.Controller;

import com.department.Deparment.DTO.DepartmentDTO;
import com.department.Deparment.Repository.DepatmentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepatmentRepository departmentRepository;

    public DepartmentController(DepatmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    // Save Department API
    @PostMapping
    public ResponseEntity<DepartmentDTO> saveDepartment(@RequestBody DepartmentDTO department) {
        return ResponseEntity.ok(departmentRepository.save(department));
    }

    // Get Department by ID API
    @GetMapping("/{id}")
    public ResponseEntity<DepartmentDTO> getDepartment(@PathVariable Long id) {
        return departmentRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Get All Departments API
    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> getAllDepartments() {
        return ResponseEntity.ok(departmentRepository.findAll());
    }
}
