package org.example.grupo20integrador3.repositories;

import org.example.grupo20integrador3.entities.Carrera;
import org.example.grupo20integrador3.entities.Estudiante;
import org.example.grupo20integrador3.entities.EstudianteCarrera;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstudianteCarreraRepository extends JpaRepository<EstudianteCarrera, Long> {
    Optional<EstudianteCarrera> findByEstudiante_LUAndCarrera_idCarrera(int LU, int idCarrera);


}

