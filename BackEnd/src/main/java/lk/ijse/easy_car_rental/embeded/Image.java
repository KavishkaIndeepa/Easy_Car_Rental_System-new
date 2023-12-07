package lk.ijse.easy_car_rental.embeded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Image {
    private String front_View;
    private String back_View;
    private String side_View;
    private String interior;
}
