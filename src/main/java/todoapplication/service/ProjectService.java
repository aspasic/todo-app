package todoapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import todoapplication.model.Project;

public interface ProjectService {

	Project findOne(Long id);
	
	List<Project> findAll();
	
	Project save(Project project);
	
	Project delete(Long id);
	
	Project findByName(String name);

	List<Project> findByProjectOwner(Long id);

	Project findOneById(Long id);

	Project update(Project p);
}
