package todoapplication.service;

import java.util.List;

import todoapplication.model.Project;

public interface ProjectService {

	Project findOne(Long id);
	
	List<Project> findAll();
	
	Project save(Project project);
	
	void delete(Long id);
	
	Project findByName(String name);
}
