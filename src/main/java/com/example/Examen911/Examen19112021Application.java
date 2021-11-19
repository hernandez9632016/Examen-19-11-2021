package com.example.Examen911;

import com.example.Examen911.entety.Alumno;
import com.example.Examen911.entety.Curso;
import com.example.Examen911.repository.AlumnoRepositoryDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Examen19112021Application {

    public static void main(String[] args) {
        SpringApplication.run(Examen19112021Application.class, args);
    }
/*
    @Bean
    public CommandLineRunner demo(AlumnoRepositoryDAO alumnoRepositoryDAO) {
        return args -> {


            Curso español = new Curso("español");
            Curso matematicas = new Curso("matematicas");

            Alumno alumno = new Alumno(List.of(español, matematicas), 1, "aaaaa", "bbbbb",  "ssasd", "dsada@asd" );
            alumnoRepositoryDAO.save(alumno);
        };
    }

 */
}
