package lk.ijse.easy_car_rental.service.impl;

import lk.ijse.easy_car_rental.dto.CustomDTO;
import lk.ijse.easy_car_rental.dto.PaymentDTO;
import lk.ijse.easy_car_rental.entity.Car;
import lk.ijse.easy_car_rental.entity.Driver;
import lk.ijse.easy_car_rental.entity.Payment;
import lk.ijse.easy_car_rental.entity.Rent;
import lk.ijse.easy_car_rental.repo.CarRepo;
import lk.ijse.easy_car_rental.repo.DriverRepo;
import lk.ijse.easy_car_rental.repo.PaymentRepo;
import lk.ijse.easy_car_rental.repo.RentRepo;
import lk.ijse.easy_car_rental.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

import static lk.ijse.easy_car_rental.enums.AvailabilityType.AVAILABLE;
import static lk.ijse.easy_car_rental.enums.AvailabilityType.UNDER_MAINTAIN;
import static lk.ijse.easy_car_rental.enums.RentRequest.PAY;


@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepo paymentRepo;

    @Autowired
    private RentRepo rentRepo;
    @Autowired
    private CarRepo carRepo;
    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private ModelMapper mapper;
    @Override
    public CustomDTO paymentIdGenerate() {
        return new CustomDTO(paymentRepo.getLastIndex());
    }

    @Override
    public void savePayment(PaymentDTO dto, String rentID) {
        Payment payment = mapper.map(dto, Payment.class);
        Rent rent = rentRepo.findById(rentID).get();
        if (rent.getRentDetails().get(0).getDriverID() != null) {

            Driver drivers = driverRepo.findById(rent.getRentDetails().get(0).getDriverID()).get();
            drivers.setDriverAvailability(AVAILABLE);
            driverRepo.save(drivers);

            Car car = carRepo.findById(rent.getRentDetails().get(0).getCarID()).get();
            car.setVehicleAvailabilityType(UNDER_MAINTAIN);
            carRepo.save(car);

            rent.setRentType(PAY);
            rentRepo.save(rent);
        }
        if (rent.getRentDetails().get(0).getDriverID() == null) {
            Car car = carRepo.findById(rent.getRentDetails().get(0).getCarID()).get();
            car.setVehicleAvailabilityType(UNDER_MAINTAIN);
            carRepo.save(car);

            rent.setRentType(PAY);
            rentRepo.save(rent);
        }
        paymentRepo.save(payment);
    }

    @Override
    public ArrayList<PaymentDTO> getAllPayment() {
        return mapper.map(paymentRepo.findAll(), new TypeToken<ArrayList<PaymentDTO>>() {
        }.getType());
    }
}
