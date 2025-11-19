package de.etiennebader.itsecbackend.persistence;

import de.etiennebader.itsecbackend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserPersistence {

    boolean addUser(User user);
    boolean deleteUser(User user);
    boolean updateUser(User user);
    List<User> getUsers();
    User getUserById(int id);
    User getUserByUsername(String username);
    int getUserCount();
}
