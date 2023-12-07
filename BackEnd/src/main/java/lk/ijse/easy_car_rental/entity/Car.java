package lk.ijse.easy_car_rental.entity;

import lk.ijse.easy_car_rental.embeded.Image;
import lk.ijse.easy_car_rental.embeded.Rate;
import lk.ijse.easy_car_rental.enums.AvailabilityType;
import lk.ijse.easy_car_rental.enums.CarType;
import lk.ijse.easy_car_rental.enums.FuelType;
import lk.ijse.easy_car_rental.enums.TransmissionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {
    @Id
    private String car_Id;
    private String name;
    private String brand;
    @Enumerated(EnumType.STRING)
    private CarType type;
    @Embedded
    private Image image;
    private int number_Of_Passengers;
    @Enumerated(EnumType.STRING)
    private TransmissionType transmission_Type;
    @Enumerated(EnumType.STRING)
    private FuelType fuel_Type;
    @Embedded
    private Rate rent_Duration_Price;
    private double price_Extra_KM;
    private String registration_Number;
    private double free_Mileage;
    private String color;
    @Enumerated(EnumType.STRING)
    private AvailabilityType vehicleAvailabilityType;

}
