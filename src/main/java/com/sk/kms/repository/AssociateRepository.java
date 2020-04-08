package com.sk.kms.repository;

import com.sk.kms.model.Associate;

public interface AssociateRepository {
	
	public Associate findByFirstName(String firstName);
	
}
