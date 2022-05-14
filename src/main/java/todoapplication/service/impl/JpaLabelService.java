package todoapplication.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todoapplication.model.Label;
import todoapplication.repository.LabelRepository;
import todoapplication.service.LabelService;

@Service
public class JpaLabelService implements LabelService {

	@Autowired
	private LabelRepository labelRepository;
	
	@Override
	public Optional<Label> findOne(Long id) {
		return labelRepository.findOneById(id);
	}

	@Override
	public List<Label> findAll() {
		return labelRepository.findAll();
	}

	@Override
	public Label save(Label label) {
		return labelRepository.save(label);
	}

	@Override
	public Label findByName(String labelName) {
		return labelRepository.findByNameContainsIgnoreCase(labelName);
	}

}
