package com.github.git_leon.lcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public interface LControllerInterface<EntityType, IdType> {
    @PostMapping
    ResponseEntity<EntityType> post(@RequestBody EntityType entity);

    @GetMapping
    ResponseEntity<EntityType> get(@PathVariable IdType id);

    @PutMapping
    ResponseEntity<EntityType> put(@RequestBody EntityType entity);

    @DeleteMapping
    ResponseEntity<EntityType> delete(@PathVariable IdType id);

    LServiceInterface<EntityType, IdType> getService();
}
