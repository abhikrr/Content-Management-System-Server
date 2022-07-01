package com.abhisu.contentManagemetSystem.controller;

import com.abhisu.contentManagemetSystem.dto.RoleDto;
import com.abhisu.contentManagemetSystem.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/role/{id}")
    public ResponseEntity<?> getRoleById(@PathVariable Integer id){
        return null;
    }
    @GetMapping("/role")
    public ResponseEntity<List<RoleDto>> getAllRole(){
        return null;
    }

    @PostMapping("/role")
    public ResponseEntity<String> addRole(){
        return null;
    }

    @PutMapping("/role")
    public ResponseEntity<?> updateRole(){
        return null;
    }

    @DeleteMapping("/role")
    public ResponseEntity<?> deleteRole(){
        return null;
    }
}
