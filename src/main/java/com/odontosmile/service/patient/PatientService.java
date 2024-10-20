package com.odontosmile.service.patient;

import com.odontosmile.model.Patient;

import java.util.List;

public interface PatientService {

    Patient getById(Long id);
    List<Patient> getAll();
    Patient save(Patient patient);
    Boolean delete(Long id);
}
