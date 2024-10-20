package com.odontosmile.repository;

import com.odontosmile.model.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {

    @Query(value = "select * from receptionist r where r.document_number = :documentNumber", nativeQuery = true)
    Receptionist findByDocumentNumber(@Param("documentNumber") Long documentNumber);
}
