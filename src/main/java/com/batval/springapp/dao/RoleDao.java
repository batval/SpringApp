package com.batval.springapp.dao;

import com.batval.springapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
