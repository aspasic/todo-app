package todoapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import todoapplication.model.Subtask;

public interface SubtaskService {

	Subtask findOne(Long id);
	
	List<Subtask> findAll();
	
	Subtask save(Subtask project);
	
	void delete(Long id);
	
	Subtask findByName(String name);
}
