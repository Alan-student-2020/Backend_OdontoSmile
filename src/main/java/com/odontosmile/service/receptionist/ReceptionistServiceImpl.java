package com.odontosmile.service.receptionist;

import com.odontosmile.model.Receptionist;
import com.odontosmile.repository.ReceptionistRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ReceptionistServiceImpl implements ReceptionistService{

    @Autowired
    private ReceptionistRepository receptionistRepository;

    @Override
    public Receptionist getById(Long id) {
        try{
            return receptionistRepository.findById(id).get();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Receptionist getByDocumentNumber(Long documentNumber) {
        try{
            return receptionistRepository.findByDocumentNumber(documentNumber);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Receptionist> getAll() {
        try{
            return receptionistRepository.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Receptionist save(Receptionist receptionist) {
        try{
            return receptionistRepository.save(receptionist);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean delete(Long id) {
        try{
            if(id != null){
                receptionistRepository.deleteById(id);
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
