package com.v1ntage.marketplace.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public List<Role> getAll(){
        return roleRepository.findAll();
    }

    public Optional<Role> get(Integer id){
        return roleRepository.findById(id);
    }

    public void saveOrUpdate(Role role){
        roleRepository.save(role);
    }

    public void delete(Integer id){
        roleRepository.deleteById(id);
    }
}
