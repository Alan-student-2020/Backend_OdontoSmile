package com.odontosmile.service.administrator;

import com.odontosmile.model.Administrator;

import java.util.List;

public interface AdministratorService {
    Administrator getById(Long id);
    Administrator getByDocumentNumber(Long documentNumber);
    List<Administrator> getAll();
    Administrator save(Administrator administrator);
    Boolean delete(Long id);
}
