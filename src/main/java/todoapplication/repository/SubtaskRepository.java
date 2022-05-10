package todoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import todoapplication.model.Subtask;

public interface SubtaskRepository extends JpaRepository<Subtask, Long> {

	Subtask findOneById(Long id);

	Subtask findByNameContainsIgnoreCase(String name);

}
