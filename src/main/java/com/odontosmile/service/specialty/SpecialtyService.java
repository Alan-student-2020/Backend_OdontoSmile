package com.odontosmile.service.specialty;

import com.odontosmile.model.Specialty;

import java.util.List;

public interface SpecialtyService {
    Specialty getById(Long id);
    List<Specialty> getAll();
    Specialty save(Specialty specialty);
    Boolean delete(Long id);
}
