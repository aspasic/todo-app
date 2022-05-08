package todoapplication.support;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import todoapplication.model.Users;
import todoapplication.web.dto.UsersDTO;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsersToUsersDto implements Converter<Users, UsersDTO>{

    @Override
    public UsersDTO convert(Users user) {
        UsersDTO userDTO = new UsersDTO();

        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setName(user.getName());
        userDTO.setLastName(user.getLastName());
        userDTO.setUsername(user.getUsername());

        return userDTO;
    }

    public List<UsersDTO> convert(List<Users> users){
        List<UsersDTO> userDTOs = new ArrayList<>();

        for(Users u : users) {
            UsersDTO dto = convert(u);
            userDTOs.add(dto);
        }

        return userDTOs;
    }
}
