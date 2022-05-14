package todoapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todoapplication.model.Project;
import todoapplication.repository.ProjectRepository;
import todoapplication.service.ProjectService;

@Service
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
	public Project delete(Long id) {
		Project p = projectRepository.findOneById(id);
		
		if( p != null) {
			
			p.getProjectOwner().getProjects().remove(p);
			
			projectRepository.deleteById(id);
			return p;
		}
		
		return null;
	}

	@Override
	public Project findByName(String name) {
		return projectRepository.findByNameContainsIgnoreCase(name);
	}

	@Override
	public Project findOneById(Long id) {
		return projectRepository.findOneById(id);
	}

	@Override
	public Project update(Project p) {
		return projectRepository.save(p);
	}

	@Override
	public List<Project> findByProjectOwner(Long id) {
		return projectRepository.findByProjectOwner_Id(id);
	}

}
