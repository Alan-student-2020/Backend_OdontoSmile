package com.odontosmile.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "medical_history")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient", referencedColumnName = "id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "appointment", referencedColumnName = "id", nullable = false)
    private Appointment appointment;

    @Column(name = "date")
    private Timestamp date = new Timestamp(System.currentTimeMillis());

    @Column(name = "note")
    private String note;

    @Column(name = "treatment")
    private String treatment;
}
