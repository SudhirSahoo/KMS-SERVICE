package com.sk.kms.service;

import java.util.List;
import java.util.Random;

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
			int i = getRandomNumberInRange(1000, 9999);
			associate = new Associate(i, associate.getFirstName(), associate.getLastName());
		}
		associate = associateJpaRepository.save(associate);
		return associate; 
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public Associate delete(Associate associate) {
		if(associate != null && associate.getId() >= 0) {
			associateJpaRepository.delete(associate);
		}
		return associate; 
	}

}
