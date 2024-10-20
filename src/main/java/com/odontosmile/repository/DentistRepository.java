package com.odontosmile.repository;

import com.odontosmile.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DentistRepository extends JpaRepository<Dentist, Long> {

    @Query(value = "select * from dentist d where d.document_number = :documentNumber", nativeQuery = true)
    Dentist findByDocumentNumber(@Param("documentNumber") Long documentNumber);
}
