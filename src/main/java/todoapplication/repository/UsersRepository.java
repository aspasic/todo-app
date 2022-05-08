package todoapplication.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import todoapplication.model.Users;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Optional<Users> findFirstByUsername(String username);

    Optional<Users> findFirstByUsernameAndPassword(String username,String password);
}
