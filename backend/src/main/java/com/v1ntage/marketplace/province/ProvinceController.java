package com.v1ntage.marketplace.province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "api/v1/provinces")
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;

    @GetMapping
    public List<Province> getProvinces(){
        return provinceService.getAll();
    }

    @GetMapping("/{provinceId}")
    public Optional<Province> getProvince(@PathVariable("provinceId") Integer id){
        return provinceService.get(id);
    }

    @PostMapping
    public ResponseEntity<Province> createProvince(@RequestBody Province province) {
        try {
            provinceService.saveOrUpdate(province);
            return new ResponseEntity<>(province, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
