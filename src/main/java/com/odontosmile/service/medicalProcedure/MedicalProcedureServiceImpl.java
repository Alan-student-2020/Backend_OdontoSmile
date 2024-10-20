package com.odontosmile.service.medicalProcedure;

import com.odontosmile.model.MedicalProcedure;
import com.odontosmile.repository.MedicalProcedureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalProcedureServiceImpl implements MedicalProcedureService {
    @Autowired
    private MedicalProcedureRepository medicalProcedureRepository;

    @Override
    public MedicalProcedure getById(Long id) {
        try{
            return medicalProcedureRepository.findById(id).get();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<MedicalProcedure> getAll() {
        try{
            return medicalProcedureRepository.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public MedicalProcedure save(MedicalProcedure medicalProcedure) {
        try{
            return medicalProcedureRepository.save(medicalProcedure);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Boolean delete(Long id) {
        try{
            if(id != null){
                medicalProcedureRepository.deleteById(id);
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
