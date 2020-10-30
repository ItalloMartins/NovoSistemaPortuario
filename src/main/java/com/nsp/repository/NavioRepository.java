package com.nsp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nsp.model.ModelNavio;

@Repository
public interface NavioRepository extends CrudRepository<ModelNavio, Long>{

	List<ModelNavio> findByNomeNavio(String nomeNavio);
	
}
