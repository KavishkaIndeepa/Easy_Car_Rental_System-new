package lk.ijse.easy_car_rental.service;


import lk.ijse.easy_car_rental.dto.UserDTO;

import java.util.ArrayList;

public interface UserService {
    ArrayList<UserDTO> getAllRegUsers();

    UserDTO getRegUsers(String username,String password);

}
