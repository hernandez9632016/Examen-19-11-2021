package com.example.Examen911.repository;

import com.example.Examen911.entety.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface AlumnoRepositoryDAO extends CrudRepository<Alumno,Integer> {

    @Query(value = "Select t.nombre, id, apellido, direccion from Alumno t where t.id=:id")
    public List<String> findAlumno(Integer id);
}
