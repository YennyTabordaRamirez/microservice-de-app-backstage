package com.appoiments.repository;

import com.appoiments.entity.AppoimentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMasterRepository extends CrudRepository<AppoimentEntity, Integer> {
}
