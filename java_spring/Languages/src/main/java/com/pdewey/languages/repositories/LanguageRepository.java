package com.pdewey.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pdewey.languages.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long>{
	
	// ********** Find All *********************
	
	List<Language> findAll();
}
