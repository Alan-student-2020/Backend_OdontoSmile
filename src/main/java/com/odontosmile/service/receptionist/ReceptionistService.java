package com.odontosmile.service.receptionist;


import com.odontosmile.model.Receptionist;

import java.util.List;

public interface ReceptionistService {

    Receptionist getById(Long id);
    Receptionist getByDocumentNumber(Long documentNumber);
    List<Receptionist> getAll();
    Receptionist save(Receptionist receptionist);
    Boolean delete(Long id);
}
