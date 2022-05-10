package todoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import todoapplication.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

	Task findOneById(Long id);

	Task findByNameContainsIgnoreCase(String name);


}
