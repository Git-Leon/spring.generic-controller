package com.github.git_leon.lcontroller;

import org.springframework.data.repository.CrudRepository;

public interface LRepositoryInterface<EntityType, IdType> extends CrudRepository<EntityType, IdType> {
}
