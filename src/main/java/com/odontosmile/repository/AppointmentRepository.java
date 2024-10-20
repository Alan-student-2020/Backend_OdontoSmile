package com.odontosmile.repository;

import com.odontosmile.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    @Query(value = "select * from appointment a where a.dentist = :dentist and a.status = 'Confirmed'", nativeQuery = true)
    List<Appointment> findByDentist(@Param("dentist") Long dentist);
}
