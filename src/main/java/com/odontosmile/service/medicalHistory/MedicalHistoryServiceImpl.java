package com.odontosmile.service.medicalHistory;

import com.odontosmile.model.MedicalHistory;
import com.odontosmile.repository.MedicalHistoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MedicalHistoryServiceImpl implements MedicalHistoryService {

    @Autowired
    private MedicalHistoryRepository medicalHistoryRepository;

    @Override
    public MedicalHistory getById(Long id) {
        try{
            return medicalHistoryRepository.findById(id).get();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<MedicalHistory> getAll() {
        try{
            return medicalHistoryRepository.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public MedicalHistory save(MedicalHistory medicalHistory) {
        try{
            return medicalHistoryRepository.save(medicalHistory);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean delete(Long id) {
        try{
            if(id != null){
                medicalHistoryRepository.deleteById(id);
                return Boolean.TRUE;
            }else{
                return Boolean.FALSE;
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return Boolean.FALSE;
        }
    }

    @Override
    public List<MedicalHistory> getByPatient(Long patient) {
        try{
            return medicalHistoryRepository.findByPatient(patient);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public MedicalHistory getByAppointment(Long appointment) {
        try{
            return medicalHistoryRepository.findByAppointment(appointment);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
