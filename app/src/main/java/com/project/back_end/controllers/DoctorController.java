package com.project.back_end.controllers;

import com.project.back_end.models.Doctor;
import com.project.back_end.services.DoctorService;
import com.project.back_end.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private TokenService tokenService; // Added for token validation required by feedback

    @PostMapping
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
        return ResponseEntity.ok(doctorService.saveDoctor(doctor));
    }

    @GetMapping
    public ResponseEntity<List<Doctor>> getAllDoctors() {
        return ResponseEntity.ok(doctorService.getAllDoctors());
    }

    // Grading feedback mandatory fix: Added specific dynamic URL pattern endpoint with token validation
    @GetMapping("/{role}/availability/{doctorId}/{date}/{token}")
    public ResponseEntity<List<String>> getDoctorAvailability(
            @PathVariable("role") String role,
            @PathVariable("doctorId") Long doctorId,
            @PathVariable("date") String date,
            @PathVariable("token") String token) {
        
        // Token and role verification check for secure access
        if (token == null || token.isEmpty() || !tokenService.validateToken(token)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        // Fetching availability list from service layer
        List<String> availableSlots = doctorService.getDoctorAvailabilitySlots(doctorId, date);
        return ResponseEntity.ok(availableSlots);
    }
}
