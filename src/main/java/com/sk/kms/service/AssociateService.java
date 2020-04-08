package com.sk.kms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.kms.model.Associate;
import com.sk.kms.repository.AssociateJpaRepository;
import com.sk.kms.repository.AssociateRepository;

@Service
public class AssociateService  {

	@Autowired
	private AssociateJpaRepository associateJpaRepository;

	
	public List<Associate> findAll() {
		List<Associate> associateList = associateJpaRepository.findAll();
		return associateList; 
	}
	 
	public Associate create(Associate associate) {
		if(associate == null || associate.getId() == 0) {
			associate = new Associate(1001, "Brain", "Turner");
		}
		associate = associateJpaRepository.save(associate);
		return associate; 
	}

}
