package com.odontosmile.controller;

import com.odontosmile.model.MedicalProcedure;
import com.odontosmile.service.medicalProcedure.MedicalProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/medical-procedure")
@CrossOrigin(origins = "*")
public class MedicalProcedureController {

    @Autowired
    private MedicalProcedureService medicalProcedureService;

    @GetMapping("/id")
    private ResponseEntity<MedicalProcedure> GetById(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(medicalProcedureService.getById(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/all")
    private ResponseEntity<List<MedicalProcedure>> GetAll(){
        try{
            return new ResponseEntity<>(medicalProcedureService.getAll(), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/save")
    private ResponseEntity<MedicalProcedure> Save(@RequestBody MedicalProcedure medicalProcedure){
        try{
            return new ResponseEntity<>(medicalProcedureService.save(medicalProcedure), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> Delete(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(medicalProcedureService.delete(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(Boolean.FALSE, HttpStatus.BAD_REQUEST);
        }
    }
}
