package com.project.back_end.services;

import com.project.back_end.models.Doctor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {
    private final List<Doctor> doctorList = new ArrayList<>();

    public Doctor saveDoctor(Doctor doctor) {
        doctorList.add(doctor);
        return doctor;
    }
    public List<Doctor> getAllDoctors() {
        return doctorList;
    }
}
