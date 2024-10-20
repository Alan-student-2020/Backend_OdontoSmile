package com.odontosmile.service.medicalProcedure;

import com.odontosmile.model.MedicalProcedure;

import java.util.List;

public interface MedicalProcedureService {
    MedicalProcedure getById(Long id);
    List<MedicalProcedure> getAll();
    MedicalProcedure save(MedicalProcedure medicalProcedure);
    Boolean delete(Long id);
}
