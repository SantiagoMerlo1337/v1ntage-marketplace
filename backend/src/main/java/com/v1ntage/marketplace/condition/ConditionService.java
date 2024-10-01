package com.v1ntage.marketplace.condition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConditionService {
    @Autowired
    ConditionRepository conditionRepository;

    public List<Condition> getAll(){
        return conditionRepository.findAll();
    }

    public Optional<Condition> get(Integer id){
        return conditionRepository.findById(id);
    }

    public void saveOrUpdate(Condition condition){
        conditionRepository.save(condition);
    }

    public void delete(Integer id){
        conditionRepository.deleteById(id);
    }

}
