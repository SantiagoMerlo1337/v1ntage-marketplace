package com.v1ntage.marketplace.condition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/conditions")
public class ConditionController {
    @Autowired
    ConditionService conditionService;

    @GetMapping
    public List<Condition> getConditions(){
        return conditionService.getAll();
    }

    @GetMapping("/{conditionId}")
    public Optional<Condition> getCondition(@PathVariable("conditionId") Integer id){
        return conditionService.get(id);
    }

    @PostMapping
    public ResponseEntity<Condition> createCondition(@RequestBody Condition condition){
        try {
            conditionService.saveOrUpdate(condition);
            return new ResponseEntity<>(condition, HttpStatus.CREATED);
        }
        catch (Exception e){
            e.printStackTrace(); // Muestra el error completo en los logs
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
