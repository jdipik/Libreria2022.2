package rjr.studio.libreria.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rjr.studio.libreria.data.entity.AutoreEntity;

@Repository
public interface AutoreRepository extends JpaRepository<AutoreEntity, Long>{

}
