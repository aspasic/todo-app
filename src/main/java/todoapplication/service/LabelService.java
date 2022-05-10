package todoapplication.service;

import java.util.List;
import java.util.Optional;

import todoapplication.model.Label;

public interface LabelService {
	
	Optional<Label> findOne(Long id);

    List<Label> findAll();

	Label save(Label label);
	
	Label findByName(String labelName);
}
