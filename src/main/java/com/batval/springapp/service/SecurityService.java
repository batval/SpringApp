package com.batval.springapp.service;

/**
 * Service for Security.
 *
 * @author Baturo Valery
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
