package com.project.back_end.services;

import com.project.back_end.models.Doctor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    // Local runtime list database mimic karne ke liye
    private final List<Doctor> doctorList = new ArrayList<>();

    // 1. Doctor ko database/system me save karne ka logic
    public Doctor saveDoctor(Doctor doctor) {
        // Future scope: Yahan check kar sakte hain agar email pehle se exists toh nahi karta
        doctorList.add(doctor);
        return doctor;
    }

    // 2. Saare registered doctors ki list return karne ka logic
    public List<Doctor> getAllDoctors() {
        return doctorList;
    }
}
