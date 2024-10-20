package com.odontosmile.model;

import com.odontosmile.enums.AppointmentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "appointment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient", referencedColumnName = "id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "dentist", referencedColumnName = "id", nullable = false)
    private Dentist dentist;

    @ManyToOne
    @JoinColumn(name = "medicalProcedure", referencedColumnName = "id", nullable = false)
    private MedicalProcedure medicalProcedure;

    @Column(name = "date")
    private Timestamp date;

    @Column(name = "status")
    private AppointmentStatus status;
}
