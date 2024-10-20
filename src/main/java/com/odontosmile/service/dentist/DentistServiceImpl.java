package com.odontosmile.service.dentist;

import com.odontosmile.model.Dentist;
import com.odontosmile.repository.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistServiceImpl implements DentistService {

    @Autowired
    private DentistRepository dentistRepository;

    @Override
    public Dentist getById(Long id) {
        try{
            return dentistRepository.findById(id).get();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Dentist getByDocumentNumber(Long documentNumber) {
        try{
            return dentistRepository.findByDocumentNumber(documentNumber);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Dentist> getAll() {
        try{
            return dentistRepository.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Dentist save(Dentist dentist) {
        try{
            return dentistRepository.save(dentist);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean delete(Long id) {
        try{
            if(id != null){
                dentistRepository.deleteById(id);
                return Boolean.TRUE;
            }else{
                return Boolean.FALSE;
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return Boolean.FALSE;
        }
    }
}
