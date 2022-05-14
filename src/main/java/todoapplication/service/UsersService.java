package todoapplication.service;



import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import todoapplication.model.User;


public interface UsersService {

    Optional<User> findOne(Long id);

    List<User> findAll();

    Page<User> findAll(int pageNumber);

    User save(User user);

    void delete(Long id);

    Optional<User> findbyUsername(String username);
}
