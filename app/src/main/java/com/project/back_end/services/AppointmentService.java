package com.project.back_end.services;

import com.project.back_end.models.Appointment;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    // Dummy list simulate karne ke liye jab tak repository data layer active na ho
    private final List<Appointment> appointmentList = new ArrayList<>();

    // 1. Appointment save karne ka business logic
    public Appointment createAppointment(Appointment appointment) {
        // Yahan aap future me rules laga sakte hain (jaise double-booking check karna)
        appointmentList.add(appointment);
        return appointment;
    }

    // 2. Kisi Doctor ke saare appointments ki list return karna
    public List<Appointment> getAllAppointments() {
        return appointmentList;
    }
}
