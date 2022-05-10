package todoapplication.service;

import java.util.List;

import todoapplication.model.Task;

public interface TaskService {

	Task findOne(Long id);
	
	List<Task> findAll();
	
	Task save(Task project);
	
	void delete(Long id);
	
	Task findByName(String name);
}
