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
        if(doctorList.isEmpty()) {
            doctorList.add(new Doctor(1L, "Dr. Siddharth Navlakhe", "Cardiology", "siddharth.doc@smartclinic.com"));
            doctorList.add(new Doctor(2L, "Dr. Ananya Rao", "Neurology", "ananya.rao@smartclinic.com"));
        }
        return doctorList;
    }
}
