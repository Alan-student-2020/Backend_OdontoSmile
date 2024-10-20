package com.odontosmile.controller;

import com.odontosmile.model.MedicalHistory;
import com.odontosmile.service.medicalHistory.MedicalHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/medical-history")
@CrossOrigin(origins = "*")
public class MedicalHistoryController {

    @Autowired
    private MedicalHistoryService medicalHistoryService;

    @GetMapping("/id")
    private ResponseEntity<MedicalHistory> GetById(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(medicalHistoryService.getById(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/all")
    private ResponseEntity<List<MedicalHistory>> GetAll(){
        try{
            return new ResponseEntity<>(medicalHistoryService.getAll(), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/save")
    private ResponseEntity<MedicalHistory> Save(@RequestBody MedicalHistory medicalHistory){
        try{
            return new ResponseEntity<>(medicalHistoryService.save(medicalHistory), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> Delete(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(medicalHistoryService.delete(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(Boolean.FALSE, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/patient")
    private ResponseEntity<List<MedicalHistory>> GetByPatient(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(medicalHistoryService.getByPatient(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/appointment")
    private ResponseEntity<MedicalHistory> GetByAppointment(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(medicalHistoryService.getByAppointment(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

}
