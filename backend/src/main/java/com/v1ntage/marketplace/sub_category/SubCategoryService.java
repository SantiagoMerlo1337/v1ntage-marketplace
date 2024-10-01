package com.v1ntage.marketplace.sub_category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubCategoryService {
    @Autowired
    SubCategoryRepository subCategoryRepository;

    public List<SubCategory> getAll(){
        return subCategoryRepository.findAll();
    }

    public Optional<SubCategory> get(Integer id){
        return subCategoryRepository.findById(id);
    }

    public void saveOrUpdate(SubCategory subCategory){
        subCategoryRepository.save(subCategory);
    }

    public void delete(Integer id){
        subCategoryRepository.deleteById(id);
    }
}
