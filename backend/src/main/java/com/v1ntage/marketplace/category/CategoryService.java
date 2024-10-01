package com.v1ntage.marketplace.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    public Optional<Category> get(Integer id){
        return categoryRepository.findById(id);
    }

    public void saveOrUpdate(Category category){
        categoryRepository.save(category);
    }

    public void delete(Integer id){
        categoryRepository.deleteById(id);
    }
}
