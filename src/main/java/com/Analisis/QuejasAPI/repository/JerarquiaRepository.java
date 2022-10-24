package com.Analisis.QuejasAPI.repository;
import com.Analisis.QuejasAPI.model.Jerarquia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JerarquiaRepository extends JpaRepository<Jerarquia, Long>{

}
