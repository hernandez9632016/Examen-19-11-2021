package com.example.Examen911.repository;

import com.example.Examen911.controller.AlumnoExeption;
import com.example.Examen911.entety.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class AlumnoRepository {

    @Autowired
    AlumnoRepositoryDAO alumnoRepositoryDAO;

    public void creacionAlumno(Alumno alumno) {
        alumnoRepositoryDAO.save(alumno);
    }

    private List<Alumno> listaAlumno = new ArrayList<>();

    public Optional<Alumno> getbyId(Integer id){
        return alumnoRepositoryDAO.findById(id);
    }

    public Optional<Alumno> buscarAlumno(Integer nombre) throws AlumnoExeption {

        for (Alumno a : listaAlumno) {
            if (a.getNombre().equals(nombre)) {
                return listaAlumno.stream().findFirst();
            }
        }
        throw new AlumnoExeption();
        //return listaCliente.stream().findFirst();
    }

    public Optional<Alumno> modificarAlumno(Integer id) throws AlumnoExeption {

        for (Alumno alum : listaAlumno){
            if (alum.getId().equals(id)){
                return listaAlumno.stream().findFirst();
            }
        }
        throw new AlumnoExeption();
    }
}