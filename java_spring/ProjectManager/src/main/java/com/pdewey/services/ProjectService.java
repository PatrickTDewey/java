package com.pdewey.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdewey.models.Project;
import com.pdewey.models.User;
import com.pdewey.repositories.ProjectRepository;

@Service
public class ProjectService {
	// ***** Auto Add Repository Dependency ****
	
	@Autowired
	private ProjectRepository projectRepo;
	
	@Autowired
	private UserService userService;
	
	// ********** Create / Update **************
	
	public Project save( Project project ) {
		
		return projectRepo.save( project );
	}
	
	
	
	// ********** Find One *********************
	
	public Project findOne( Long id ) {
			
		Optional<Project> projectOptional = projectRepo.findById( id );
		
		if( projectOptional.isPresent() ) {
			
			return projectOptional.get();
		}

		else {
			
			return null;
		}
	}

	// ********** Find All *********************
	
	public List<Project> findAll(){
		
		return projectRepo.findAll();
	}
	
	// ********** Relationships ****************
	
	public Project addProjectToUser(Long projectId, Long userId) {
		Project project = findOne(projectId);
		
		User user = userService.getUser(userId);
		
		List<Project> projects = user.getProjects();
		
		List<User> users = project.getUsers();
		
		System.out.println("User Project List: ");
		System.out.println(projects);
		System.out.println("Project User List: ");
		System.out.println(users);
		
		projects.add(project);
		
		return save(project);
		
	}
	
	public Project removeUserFromProject(Long projectId, Long userId) {
		Project project = findOne(projectId);
		User user = userService.getUser(userId);
		
		project.getUsers().remove(user);
		
		return save(project);
	}
	

	// ********** Delete ***********************
	
	public void delete( Long id ) {
		
		projectRepo.deleteById( id );
	}
}
