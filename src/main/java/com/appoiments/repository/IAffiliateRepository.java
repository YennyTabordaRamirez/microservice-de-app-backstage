package com.appoiments.repository;

import com.appoiments.entity.AffiliateEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAffiliateRepository extends CrudRepository<AffiliateEntity, Integer> {
}
