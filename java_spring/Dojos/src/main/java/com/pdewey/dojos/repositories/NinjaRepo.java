package com.pdewey.dojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pdewey.dojos.models.Ninja;

public interface NinjaRepo extends CrudRepository<Ninja, Long>{
	
	List<Ninja> findAll();
}
