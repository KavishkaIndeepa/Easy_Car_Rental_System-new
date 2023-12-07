package lk.ijse.easy_car_rental.service;


import lk.ijse.easy_car_rental.dto.CustomDTO;
import lk.ijse.easy_car_rental.dto.Reg_UserDTO;
import lk.ijse.easy_car_rental.entity.Reg_User;

import java.util.ArrayList;

public interface Reg_UserService {
    void saveUser(Reg_UserDTO dto);
    void updateUser(Reg_UserDTO dto);
    void deleteUser(String reg_ID);
    ArrayList<Reg_UserDTO> getAllUser();
    CustomDTO userIdGenerate();
    Reg_User searchUserId(String id);
    CustomDTO getSumUser();
    Reg_UserDTO availableUser(String userName);
}