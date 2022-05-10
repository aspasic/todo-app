package todoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import todoapplication.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

	Project findOneById(Long id);

	Project findByNameContainsIgnoreCase(String name);

}
