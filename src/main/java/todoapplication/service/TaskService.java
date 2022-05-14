package todoapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import todoapplication.model.Task;

public interface TaskService {

	Task findOne(Long id);
	
	List<Task> findAll();
	
	Task save(Task project);
	
	void delete(Long id);
	
	Task findByName(String name);

	List<Task> findAllByProjectId(Long id);
}
