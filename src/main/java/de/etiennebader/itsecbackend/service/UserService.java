package de.etiennebader.itsecbackend.service;

import de.etiennebader.itsecbackend.entity.User;
import de.etiennebader.itsecbackend.persistence.IUserPersistence;
import de.etiennebader.itsecbackend.persistence.UserPersistenceImpl;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Hidden
@Service
public class UserService {

    IUserPersistence userPersistence = new UserPersistenceImpl();

    public boolean createUser(String username, String password, String firstName, String lastName, String email, String phone, String address) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPhone(phone);
        user.setAddress(address);
        return userPersistence.addUser(user);
    }

    public User getUserByUsername(String username) {
        return userPersistence.getUserByUsername(username);
    }

    public User getUserByID(int id) {
        return userPersistence.getUserById(id);
    }
}
