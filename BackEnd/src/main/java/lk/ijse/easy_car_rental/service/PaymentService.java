package lk.ijse.easy_car_rental.service;


import lk.ijse.easy_car_rental.dto.CustomDTO;
import lk.ijse.easy_car_rental.dto.PaymentDTO;

import java.util.ArrayList;

public interface PaymentService {
    CustomDTO paymentIdGenerate();
    void savePayment(PaymentDTO dto, String rentID);
    ArrayList<PaymentDTO> getAllPayment();
}
