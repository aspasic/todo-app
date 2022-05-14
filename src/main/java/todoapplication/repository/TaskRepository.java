package todoapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import todoapplication.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

	Task findOneById(Long id);

	Task findByNameContainsIgnoreCase(String name);

	List<Task> findByProjectId(Long id);


}
