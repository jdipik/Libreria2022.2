package rjr.studio.libreria.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rjr.studio.libreria.data.entity.LibroEntity;

public interface LibroRepository extends JpaRepository<LibroEntity, Long>{

}
