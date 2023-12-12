package com.api.curriculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.curriculos.model.Curriculo;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    
}