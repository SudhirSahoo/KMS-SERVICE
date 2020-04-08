package com.sk.kms.repository.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.sk.kms.model.Associate;
import com.sk.kms.repository.AssociateRepository;

@Repository
public class AssociateRepositoryImpl implements AssociateRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Associate findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}
}
