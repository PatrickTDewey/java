package com.pdewey.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pdewey.models.Project;

public interface ProjectRepository extends CrudRepository< Project, Long >{
	
	List<Project> findAll();
}
