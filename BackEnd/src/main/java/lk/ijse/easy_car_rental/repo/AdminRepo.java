package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, String> {
}
