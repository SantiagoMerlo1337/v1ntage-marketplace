package com.v1ntage.marketplace.city;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public List<City> getAll(){
        return cityRepository.findAll();
    }

    public Optional<City> get(Long id){
        return cityRepository.findById(id);
    }

    public void saveOrUpdate(City city){
        cityRepository.save(city);
    }

    public void delete(Long id){
        cityRepository.deleteById(id);
    }

}
