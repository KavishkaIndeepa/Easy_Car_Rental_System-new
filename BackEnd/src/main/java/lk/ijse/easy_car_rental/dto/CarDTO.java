package lk.ijse.easy_car_rental.dto;

import lk.ijse.easy_car_rental.embeded.ImageDTO;
import lk.ijse.easy_car_rental.embeded.Rate;
import lk.ijse.easy_car_rental.enums.AvailabilityType;
import lk.ijse.easy_car_rental.enums.CarType;
import lk.ijse.easy_car_rental.enums.FuelType;
import lk.ijse.easy_car_rental.enums.TransmissionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarDTO {
    private String car_Id;

    private String name;
    private String brand;
    private CarType type;
    private ImageDTO image;
    private int number_Of_Passengers;
    private TransmissionType transmission_Type;
    private FuelType fuel_Type;
    private Rate rent_Duration_Price;
    private double price_Extra_KM;
    private String registration_Number;
    private double free_Mileage;
    private String color;
    private AvailabilityType vehicleAvailabilityType;
}
