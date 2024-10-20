package com.odontosmile.service.patient;

import com.odontosmile.model.Patient;
import com.odontosmile.repository.PatientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient getById(Long id) {
        try{
            return patientRepository.findById(id).get();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Patient> getAll() {
        try{
            return patientRepository.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Patient save(Patient patient) {
        try{
            return patientRepository.save(patient);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean delete(Long id) {
        try{
            if(id != null){
                patientRepository.deleteById(id);
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
