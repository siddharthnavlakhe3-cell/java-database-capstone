package com.project.back_end.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    // Doctor dwara prescription submit karne ka endpoint
    @PostMapping
    public ResponseEntity<Map<String, Object>> createPrescription(@RequestBody Map<String, Object> prescriptionData) {
        // Business response object map structure
        Map<String, Object> response = new HashMap<>();
        response.put("status", "Success");
        response.put("message", "Prescription created successfully");
        response.put("data", prescriptionData);
        
        return ResponseEntity.ok(response);
    }
}
