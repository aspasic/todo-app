package todoapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import todoapplication.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

	Project findOneById(Long id);

	Project findByNameContainsIgnoreCase(String name);

	List<Project> findByProjectOwner_Id(Long id);

}
