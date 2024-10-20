package com.odontosmile.repository;

import com.odontosmile.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {

    @Query(value = "select * from administrator a where a.document_number = :documentNumber", nativeQuery = true)
    Administrator findByDocumentNumber(@Param("documentNumber") Long documentNumber);
}
