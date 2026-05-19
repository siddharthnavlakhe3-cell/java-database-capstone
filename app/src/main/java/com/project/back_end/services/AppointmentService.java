package com.project.back_end.services;

import com.project.back_end.models.Appointment;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {
    private final List<Appointment> appointmentList = new ArrayList<>();

    public Appointment createAppointment(Appointment appointment) {
        appointmentList.add(appointment);
        return appointment;
    }
    public List<Appointment> getAllAppointments() {
        return appointmentList;
    }
}
