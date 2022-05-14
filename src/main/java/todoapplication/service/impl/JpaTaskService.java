package todoapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todoapplication.model.Task;
import todoapplication.repository.TaskRepository;
import todoapplication.service.TaskService;

@Service
public class JpaTaskService implements TaskService{

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public Task findOne(Long id) {
		return taskRepository.findOneById(id);
	}

	@Override
	public List<Task> findAll() {
		return taskRepository.findAll();
	}

	@Override
	public Task save(Task project) {
		return taskRepository.save(project);
	}

	@Override
	public void delete(Long id) {
		taskRepository.deleteById(id);
	}

	@Override
	public Task findByName(String name) {
		return taskRepository.findByNameContainsIgnoreCase(name);
	}

	@Override
	public List<Task> findAllByProjectId(Long id) {
		return taskRepository.findByProjectId(id);
	}

}
