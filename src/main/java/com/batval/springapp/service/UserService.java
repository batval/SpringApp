package com.batval.springapp.service;

import com.batval.springapp.model.User;

/**
 * Service class for {@link com.batval.springapp.model.User}
 *
 * @author Baturo Valery
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
