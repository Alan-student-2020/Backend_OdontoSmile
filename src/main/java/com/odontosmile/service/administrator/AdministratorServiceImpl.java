package com.odontosmile.service.administrator;

import com.odontosmile.model.Administrator;
import com.odontosmile.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService {
    @Autowired
    private AdministratorRepository administratorRepository;

    @Override
    public Administrator getById(Long id) {
        try{
            return administratorRepository.findById(id).get();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Administrator getByDocumentNumber(Long documentNumber) {
        try{
            return administratorRepository.findByDocumentNumber(documentNumber);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Administrator> getAll() {
        try{
            return administratorRepository.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Administrator save(Administrator administrator) {
        try{
            return administratorRepository.save(administrator);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean delete(Long id) {
        try{
            if(id != null){
                administratorRepository.deleteById(id);
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
