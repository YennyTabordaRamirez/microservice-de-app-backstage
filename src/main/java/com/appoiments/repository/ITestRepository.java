package com.appoiments.repository;

import com.appoiments.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestRepository extends CrudRepository<TestEntity, Integer> {

}
