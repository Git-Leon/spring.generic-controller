package com.github.git_leon.lcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
abstract public class LService<EntityType, IdType> implements LServiceInterface<EntityType, IdType> {
    private CrudRepository<EntityType, IdType> repository;

    @Autowired
    public LService(CrudRepository<EntityType, IdType> repository) {
        this.repository = repository;
    }

    @Override
    public EntityType post(EntityType entity) {
        return repository.save(entity);
    }

    @Override
    public EntityType get(IdType id) {
        return repository.findById(id).get();
    }

    @Override
    public EntityType put(EntityType entity) {
        return repository.save(entity);
    }

    @Override
    public EntityType delete(IdType id) {
        EntityType entity = get(id);
        repository.delete(entity);
        return entity;
    }

    @Override
    public CrudRepository<EntityType, IdType> getRepository() {
        return repository;
    }
}