package com.example.Examen911.controller;

import com.example.Examen911.entety.Alumno;
import com.example.Examen911.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping
    public ResponseEntity<Alumno> addAlumno(@RequestBody Alumno alumno) {
        System.out.println("Se hizo la solicitud");
        alumnoService.AddAlumno(alumno);
        return ResponseEntity.ok(alumno);
    }

    @GetMapping("/porid/{id}")
    public List<String> getAlumnoPorNombre(@PathVariable("id") Integer id){
        return alumnoService.getAlumno(id);
    }
}

