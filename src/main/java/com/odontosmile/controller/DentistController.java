package com.odontosmile.controller;

import com.odontosmile.model.Dentist;
import com.odontosmile.service.dentist.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dentist")
@CrossOrigin(origins = "*")
public class DentistController {

    @Autowired
    private DentistService dentistService;

    @GetMapping("/id")
    private ResponseEntity<Dentist> GetById(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(dentistService.getById(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    
    @GetMapping("/all")
    private ResponseEntity<List<Dentist>> GetAll(){
        try{
            return new ResponseEntity<>(dentistService.getAll(), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/save")
    private ResponseEntity<Dentist> Save(@RequestBody Dentist dentist){
        try{
            System.out.println(dentist);
            return new ResponseEntity<>(dentistService.save(dentist), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> Delete(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(dentistService.delete(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(Boolean.FALSE, HttpStatus.BAD_REQUEST);
        }
    }
}
