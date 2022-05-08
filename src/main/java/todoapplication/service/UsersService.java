package todoapplication.service;



import org.springframework.data.domain.Page;

import todoapplication.model.Users;

import java.util.List;
import java.util.Optional;

public interface UsersService {

    Optional<Users> findOne(Long id);

    List<Users> findAll();

    Page<Users> findAll(int pageNumber);

    Users save(Users user);

    void delete(Long id);

    Optional<Users> findbyUsername(String username);
}
