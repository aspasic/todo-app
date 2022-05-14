package todoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import todoapplication.model.Subtask;

@Repository
public interface SubtaskRepository extends JpaRepository<Subtask, Long> {

	Subtask findOneById(Long id);

	Subtask findByNameContainsIgnoreCase(String name);

}
