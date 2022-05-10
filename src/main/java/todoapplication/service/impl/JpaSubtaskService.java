package todoapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import todoapplication.model.Subtask;
import todoapplication.repository.SubtaskRepository;
import todoapplication.service.SubtaskService;

public class JpaSubtaskService implements SubtaskService{

	@Autowired
	private SubtaskRepository subtaskRepository;
	
	@Override
	public Subtask findOne(Long id) {
		return subtaskRepository.findOneById(id);
	}

	@Override
	public List<Subtask> findAll() {
		return subtaskRepository.findAll();
	}

	@Override
	public Subtask save(Subtask project) {
		return subtaskRepository.save(project);
	}

	@Override
	public void delete(Long id) {
		subtaskRepository.deleteById(id);
	}

	@Override
	public Subtask findByName(String name) {
		return subtaskRepository.findByNameContainsIgnoreCase(name);
	}

}
