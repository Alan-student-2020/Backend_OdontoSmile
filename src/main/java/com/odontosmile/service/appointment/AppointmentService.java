package com.odontosmile.service.appointment;

import com.odontosmile.model.Appointment;

import java.util.List;

public interface AppointmentService {

    Appointment getById(Long id);
    List<Appointment> getAll();
    List<Appointment> getByDentist(Long id);
    Appointment save(Appointment appointment);
    Boolean delete(Long id);
}
