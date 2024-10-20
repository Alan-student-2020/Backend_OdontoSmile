package com.odontosmile.service.specialty;

import com.odontosmile.model.Specialty;
import com.odontosmile.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtyServiceImpl implements SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    @Override
    public Specialty getById(Long id) {
        try{
            return specialtyRepository.findById(id).get();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Specialty> getAll() {
        try{
            return specialtyRepository.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Specialty save(Specialty specialty) {
        try{
            return specialtyRepository.save(specialty);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Boolean delete(Long id) {
        try{
            if(id != null){
                specialtyRepository.deleteById(id);
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
