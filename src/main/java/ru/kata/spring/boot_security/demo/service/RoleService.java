package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

@Service
public interface RoleService {
    public List<Role> allRoles();
    Set<Role> getRolesByIdIn(Set<Long> id);
    public void save(Role role);


}
