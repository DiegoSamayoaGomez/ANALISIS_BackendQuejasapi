package com.Analisis.QuejasAPI.repository;

import com.Analisis.QuejasAPI.model.Queja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuejaRepository extends JpaRepository<Queja, Long> {


}
