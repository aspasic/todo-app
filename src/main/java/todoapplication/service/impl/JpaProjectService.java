package todoapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import todoapplication.model.Project;
import todoapplication.repository.ProjectRepository;
import todoapplication.service.ProjectService;

public class JpaProjectService implements ProjectService{

	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public Project findOne(Long id) {
		return projectRepository.findOneById(id);
	}

	@Override
	public List<Project> findAll() {
		return projectRepository.findAll();
	}

	@Override
	public Project save(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public void delete(Long id) {
		projectRepository.deleteById(id);
	}

	@Override
	public Project findByName(String name) {
		return projectRepository.findByNameContainsIgnoreCase(name);
	}

}
