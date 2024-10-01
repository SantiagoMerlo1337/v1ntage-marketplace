package com.v1ntage.marketplace.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> get(UUID id){
        return userRepository.findById(id);
    }

    public void saveOrUpdate(User user){
        userRepository.save(user);
    }

    public void delete(UUID id){
        userRepository.deleteById(id);
    }

}
