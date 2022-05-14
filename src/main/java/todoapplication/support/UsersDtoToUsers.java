package todoapplication.support;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import todoapplication.model.User;
import todoapplication.service.UsersService;
import todoapplication.web.dto.UserDTO;

@Component
public class UsersDtoToUsers implements Converter<UserDTO, User> {

    @Autowired
    private UsersService usersService;


    @Override
    public User convert(UserDTO usersDTO) {
    	User user = null;
        if(usersDTO.getId() != null) {
        	user = usersService.findOne(usersDTO.getId()).get();
        }

        if(user == null) {
        	user = new User();
        }

        user.setUsername(usersDTO.getUsername());
        user.setEmail(usersDTO.getEmail());
        user.setName(usersDTO.getName());
        user.setLastName(usersDTO.getLastName());

        return user;
    }

}
