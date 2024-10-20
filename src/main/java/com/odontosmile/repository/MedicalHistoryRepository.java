package com.odontosmile.repository;

import com.odontosmile.model.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
    @Query(value = "select * from medical_history mh where mh.patient = :patient", nativeQuery = true)
    List<MedicalHistory> findByPatient(@Param("patient") Long patient);

    @Query(value = "select * from medical_history mh where mh.appointment = :appointment", nativeQuery = true)
    MedicalHistory findByAppointment(@Param("appointment") Long appointment);
}
