package com.odontosmile.service.dentist;

import com.odontosmile.model.Dentist;

import java.util.List;

public interface DentistService {
    Dentist getById(Long id);
    Dentist getByDocumentNumber(Long documentNumber);
    List<Dentist> getAll();
    Dentist save(Dentist dentist);
    Boolean delete(Long id);
}
