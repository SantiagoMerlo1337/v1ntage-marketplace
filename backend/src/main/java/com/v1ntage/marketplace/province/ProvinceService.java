package com.v1ntage.marketplace.province;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceService {
    @Autowired
    ProvinceRepository provinceRepository;

    public List<Province> getAll(){
        return provinceRepository.findAll();
    }

    public Optional<Province> get(Integer id){
        return provinceRepository.findById(id);
    }

    public void saveOrUpdate(Province province){
        provinceRepository.save(province);
    }

    public void delete(Integer id){
        provinceRepository.deleteById(id);
    }
}
