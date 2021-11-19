package com.example.Examen911.repository;

import com.example.Examen911.entety.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AlumnoRepository {

    @Autowired
    AlumnoRepositoryDAO alumnoRepositoryDAO;

    public void creacionAlumno(Alumno alumno) {
        alumnoRepositoryDAO.save(alumno);
    }
}