package de.etiennebader.itsecbackend.persistence;

import de.etiennebader.itsecbackend.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserPersistenceImpl implements IUserPersistence{

    private Map<Integer,User> users = new HashMap<>();

    @Override
    public boolean addUser(User user) {
        users.put(user.getId(), user);
        return users.containsKey(user.getId());
    }

    @Override
    public boolean deleteUser(User user) {
        users.remove(user.getId());
        return !users.containsKey(user.getId());
    }

    @Override
    public boolean updateUser(User user) {
        users.remove(user.getId());
        users.put(user.getId(), user);
        return users.get(user.getId()).equals(user);
    }

    @Override
    public List<User> getUsers() {
        return users.values().stream().toList();
    }

    @Override
    public User getUserById(int id) {
        return users.get(id);
    }

    @Override
    public User getUserByUsername(String username) {
        for (User user : users.values()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public int getUserCount() {
        return users.size();
    }
}
