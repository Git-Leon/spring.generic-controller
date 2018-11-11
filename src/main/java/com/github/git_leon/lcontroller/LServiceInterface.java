package com.github.git_leon.lcontroller;

import org.springframework.data.repository.CrudRepository;

public interface LServiceInterface<EntityType, IdType> {
    EntityType post(EntityType entity);
    EntityType get(IdType id);
    EntityType put(EntityType entity);
    EntityType delete(IdType id);
    CrudRepository<EntityType, IdType> getRepository();
}
