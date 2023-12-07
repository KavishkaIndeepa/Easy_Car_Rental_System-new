package lk.ijse.easy_car_rental.service;


import lk.ijse.easy_car_rental.dto.CustomDTO;
import lk.ijse.easy_car_rental.dto.DriverDTO;
import lk.ijse.easy_car_rental.entity.Driver;

import java.util.ArrayList;

public interface DriverService {
    void saveDriver(DriverDTO dto);
    void updateDriver(DriverDTO dto);
    void deleteDriver(String reg_ID);
    ArrayList<DriverDTO> getAllDriver();
    ArrayList<DriverDTO> getAllAvalabileDriver();
    CustomDTO userIdGenerate();
    CustomDTO getSumAvailableDriver();
    CustomDTO getSumUnavailableDriver();
    Driver searchDriverId(String id);
    CustomDTO getSumDriver();
}
