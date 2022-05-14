package todoapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import todoapplication.model.Label;

@Repository
public interface LabelRepository extends JpaRepository<Label, Long>{

	Optional<Label> findOneById(Long id);

	Label findByNameContainsIgnoreCase(String labelName);

}
