package com.v1ntage.marketplace.sub_category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/subcategories")
public class SubCategoryController {
    @Autowired
    SubCategoryService subCategoryService;

    @GetMapping
    public List<SubCategory> getCategories(){
        return subCategoryService.getAll();
    }

    @GetMapping("/{subCategoryId}")
    public Optional<SubCategory> getSubCategory(@PathVariable("subCategoryId") Integer id){
        return subCategoryService.get(id);
    }

    @PostMapping
    public ResponseEntity<SubCategory> createSubCategory(@RequestBody SubCategory subCategory) {
        try {
            subCategoryService.saveOrUpdate(subCategory);
            return new ResponseEntity<>(subCategory, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
