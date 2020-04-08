package com.sk.kms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sk.kms.model.Associate;

@Repository
public interface AssociateJpaRepository  extends JpaRepository<Associate, Integer>, AssociateRepository {

}
