package com.odontosmile.controller;

import com.odontosmile.model.Administrator;
import com.odontosmile.service.administrator.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/administrator")
@CrossOrigin(origins = "*")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @GetMapping("/id")
    private ResponseEntity<Administrator> GetById(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(administratorService.getById(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/all")
    private ResponseEntity<List<Administrator>> GetAll(){
        try{
            return new ResponseEntity<>(administratorService.getAll(), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/save")
    private ResponseEntity<Administrator> Save(@RequestBody Administrator administrator){
        System.out.println(administrator);
        try{
            return new ResponseEntity<>(administratorService.save(administrator), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> Delete(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(administratorService.delete(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(Boolean.FALSE, HttpStatus.BAD_REQUEST);
        }
    }
}
