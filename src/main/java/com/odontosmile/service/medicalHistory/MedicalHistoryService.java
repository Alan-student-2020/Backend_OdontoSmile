package com.odontosmile.service.medicalHistory;

import com.odontosmile.model.MedicalHistory;

import java.util.List;

public interface MedicalHistoryService {

    MedicalHistory getById(Long id);
    List<MedicalHistory> getAll();
    MedicalHistory save(MedicalHistory medicalHistory);
    Boolean delete(Long id);
    List<MedicalHistory> getByPatient(Long patient);
    MedicalHistory getByAppointment(Long appointment);
}
