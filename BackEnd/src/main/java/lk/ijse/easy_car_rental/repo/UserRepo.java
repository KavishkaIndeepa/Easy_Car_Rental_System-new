package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, String> {
//    @Query(value = " SELECT * FROM User WHERE role_Type =?1 and user_Name=?2 and password=?3", nativeQuery = true)
//    User findUserByUser_NameAndPassword(String role_Type, String user_Name, String password);
@Query(value = "select * from User where user_Name=? AND password=? limit 1",nativeQuery = true)
User findUserByUser_NameAndPassword(String username, String password) throws RuntimeException;
}
