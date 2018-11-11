package com.github.git_leon.lcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
abstract public class LController<EntityType, IdType> implements LControllerInterface<EntityType, IdType> {
    private LServiceInterface<EntityType, IdType> service;

    @Autowired
    public LController(LServiceInterface<EntityType, IdType> service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<EntityType> post(EntityType entity) {
        return new ResponseEntity<>(service.post(entity), HttpStatus.CREATED);
    }

    @Override
    @GetMapping
    public ResponseEntity<EntityType> get(IdType id) {
        return new ResponseEntity<>(service.get(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityType> put(EntityType entity) {
        return new ResponseEntity<>(service.put(entity), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EntityType> delete(IdType id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

    @Override
    public LServiceInterface<EntityType, IdType> getService() {
        return service;
    }
}
