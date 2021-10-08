package com.pdewey.dojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pdewey.dojos.models.Dojo;

public interface DojoRepo extends CrudRepository<Dojo, Long>{
	
	List<Dojo> findAll();

}
