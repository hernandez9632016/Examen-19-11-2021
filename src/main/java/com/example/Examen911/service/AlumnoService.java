package com.example.Examen911.service;

import com.example.Examen911.entety.Alumno;
import com.example.Examen911.repository.AlumnoRepository;
import com.example.Examen911.repository.AlumnoRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepositoryDAO alumnoRepositoryDAO;
    @Autowired
    AlumnoRepository alumnoRepository;

    public void AddAlumno(Alumno alumno) {
        alumnoRepository.creacionAlumno(alumno);
    }

    public List<String> getAlumno(Integer id) {
        return alumnoRepositoryDAO.findAlumno(id);
    }
}