package com.v1ntage.marketplace.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "api/v1/cities")
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping
    public List<City> getCities(){
        return cityService.getAll();
    }

    @GetMapping("/{cityId}")
    public Optional<City> getCity(@PathVariable("cityId") Long id){
        return cityService.get(id);
    }

    @PostMapping
    public ResponseEntity<City> createProvince(@RequestBody City city) {
        try {
            cityService.saveOrUpdate(city);
            return new ResponseEntity<>(city, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
