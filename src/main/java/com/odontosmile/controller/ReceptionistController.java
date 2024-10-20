package com.odontosmile.controller;

import com.odontosmile.model.Receptionist;
import com.odontosmile.service.receptionist.ReceptionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/receptionist")
@CrossOrigin(origins = "*")
public class ReceptionistController {

    @Autowired
    private ReceptionistService receptionistService;


    @GetMapping("/id")
    private ResponseEntity<Receptionist> GetById(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(receptionistService.getById(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/all")
    private ResponseEntity<List<Receptionist>> GetAll(){
        try{
            return new ResponseEntity<>(receptionistService.getAll(), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/save")
    private ResponseEntity<Receptionist> Save(@RequestBody Receptionist receptionist){
        System.out.println(receptionist);
        try{
            return new ResponseEntity<>(receptionistService.save(receptionist), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> Delete(@RequestParam("id") Long id){
        try{
            return new ResponseEntity<>(receptionistService.delete(id), HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(Boolean.FALSE, HttpStatus.BAD_REQUEST);
        }
    }
}
