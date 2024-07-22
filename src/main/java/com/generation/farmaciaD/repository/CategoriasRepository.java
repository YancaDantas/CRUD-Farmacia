package com.generation.farmaciaD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmaciaD.model.Categorias;

public interface CategoriasRepository extends JpaRepository<Categorias, Long> {

    public List<Categorias> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);

}