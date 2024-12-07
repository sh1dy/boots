package gamers_list.service;

import gamers_list.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void editUser(User user);

    void deleteUser(User user);
}
