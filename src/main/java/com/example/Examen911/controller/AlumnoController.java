package com.example.Examen911.controller;

import com.example.Examen911.entety.Alumno;
import com.example.Examen911.repository.AlumnoRepository;
import com.example.Examen911.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @PostMapping
    public ResponseEntity<Alumno> addAlumno(@RequestBody Alumno alumno) {
        System.out.println("Se hizo la solicitud");
        alumnoService.AddAlumno(alumno);
        return ResponseEntity.ok(alumno);
    }

    @GetMapping("/pornom/{id}")
    public ResponseEntity<Alumno> buscarPorId(@PathVariable("id") Integer id) {
        Optional<Alumno> existeAlumno = alumnoRepository.getbyId(id);
        if (existeAlumno.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(existeAlumno.get());
        }
    }


}

