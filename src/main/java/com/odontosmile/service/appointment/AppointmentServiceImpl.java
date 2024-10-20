package com.odontosmile.service.appointment;

import com.odontosmile.enums.AppointmentStatus;
import com.odontosmile.model.Appointment;
import com.odontosmile.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment getById(Long id) {
        try{
            return appointmentRepository.findById(id).get();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Appointment> getAll() {
        try{
            return appointmentRepository.findAll();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Appointment> getByDentist(Long id) {
        try{
            return appointmentRepository.findByDentist(id);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Appointment save(Appointment appointment) {
        try{
            if(appointment.getId() == null){
                appointment.setStatus(AppointmentStatus.Confirmed);
            }
            return appointmentRepository.save(appointment);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean delete(Long id) {
        try{
            if(id != null){
                appointmentRepository.deleteById(id);
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
