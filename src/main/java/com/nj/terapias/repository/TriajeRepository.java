package com.nj.terapias.repository;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nj.terapias.entity.Triaje;

@Repository("triajeRepository")
public interface TriajeRepository extends JpaRepository<Triaje, Serializable> {

	public abstract Triaje findById(int id);

}
