package com.odontosmile.repository;

import com.odontosmile.model.MedicalProcedure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalProcedureRepository extends JpaRepository<MedicalProcedure, Long> {
}
