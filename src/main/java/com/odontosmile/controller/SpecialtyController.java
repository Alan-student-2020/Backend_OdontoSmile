package com.odontosmile.controller;

import com.odontosmile.model.Specialty;
import com.odontosmile.service.specialty.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/specialty")
@CrossOrigin(origins = "*")
public class SpecialtyController {

    @Autowired
    private SpecialtyService specialtyService;

    @GetMapping("/id")
    private ResponseEntity<Specialty> GetById(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(specialtyService.getById(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/all")
    private ResponseEntity<List<Specialty>> GetAll(){
        try{
            return new ResponseEntity<>(specialtyService.getAll(), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/save")
    private ResponseEntity<Specialty> Save(@RequestBody Specialty specialty){
        try{
            return new ResponseEntity<>(specialtyService.save(specialty), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> Delete(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(specialtyService.delete(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(Boolean.FALSE, HttpStatus.BAD_REQUEST);
        }
    }
}
