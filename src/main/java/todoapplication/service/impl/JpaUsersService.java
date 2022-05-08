package todoapplication.service.impl;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import todoapplication.enumeration.UserRole;
import todoapplication.model.Users;
import todoapplication.repository.UsersRepository;
import todoapplication.service.UsersService;

@Service
public class JpaUsersService implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Optional<Users> findOne(Long id) {
        return usersRepository.findById(id);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Page<Users> findAll(int pageNumber) {
        return usersRepository.findAll(PageRequest.of(pageNumber,10));
    }

    @Override
    public Users save(Users user) {
        user.setRole(UserRole.KORISNIK);
        return usersRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        usersRepository.deleteById(id);
    }

    @Override
    public Optional<Users> findbyUsername(String username) {
        return usersRepository.findFirstByUsername(username);
    }

    
}
