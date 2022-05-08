package todoapplication.support;




import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import todoapplication.model.Users;
import todoapplication.service.UsersService;
import todoapplication.web.dto.UsersDTO;

import org.springframework.beans.factory.annotation.Autowired;

@Component
public class UsersDtoToUsers implements Converter<UsersDTO, Users> {

    @Autowired
    private UsersService usersService;


    @Override
    public Users convert(UsersDTO usersDTO) {
        Users user = null;
        if(usersDTO.getId() != null) {
        	user = usersService.findOne(usersDTO.getId()).get();
        }

        if(user == null) {
        	user = new Users();
        }

        user.setUsername(usersDTO.getUsername());
        user.setEmail(usersDTO.getEmail());
        user.setName(usersDTO.getName());
        user.setLastName(usersDTO.getLastName());

        return user;
    }

}
