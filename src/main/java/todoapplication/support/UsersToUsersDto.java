package todoapplication.support;


import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import todoapplication.model.User;
import todoapplication.web.dto.UserDTO;

@Component
public class UsersToUsersDto implements Converter<User, UserDTO>{

    @Override
    public UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setName(user.getName());
        userDTO.setLastName(user.getLastName());
        userDTO.setUsername(user.getUsername());

        return userDTO;
    }

    public List<UserDTO> convert(List<User> users){
        List<UserDTO> userDTOs = new ArrayList<>();

        for(User u : users) {
            UserDTO dto = convert(u);
            userDTOs.add(dto);
        }

        return userDTOs;
    }
}
