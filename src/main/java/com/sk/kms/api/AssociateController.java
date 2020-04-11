package com.sk.kms.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sk.kms.model.Associate;
import com.sk.kms.service.AssociateService;

//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3000", "https://ow59xl2smj.execute-api.us-east-1.amazonaws.com", "https://ow59xl2smj.execute-api.us-east-1.amazonaws.com/dev"})
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AssociateController {

	private List<Associate> associates = createList();
	
	@Autowired
	AssociateService associateService;
	
	@RequestMapping(value = "/associates", method = RequestMethod.GET, produces = "application/json")
	public List<Associate> firstPage() {
		return associates;
	}
	
	private static List<Associate> createList() {
		List<Associate> tempAssociates = new ArrayList<>();
		Associate associate1 = new Associate();
		associate1.setFirstName("emp1");
		associate1.setLastName("emp1");
		//associate1.setId("1");

		Associate associate2 = new Associate();
		associate2.setFirstName("emp2");
		associate2.setLastName("emp2");
		//associate2.setId("2");

		tempAssociates.add(associate1);
		tempAssociates.add(associate2);
		return tempAssociates;
	}

	@RequestMapping(value="/api/associate/findall", method = RequestMethod.GET, produces = "application/json")
	public List<Associate> getAllAssociates() {
		System.out.println("Getting all Associates");
		List<Associate> allAssociateList = associateService.findAll();
		
		return allAssociateList;
	}
	
	@RequestMapping(value = "/api/associate/create", method = RequestMethod.POST, consumes = "application/json")
    public Associate create(@RequestBody Associate associate) {
		System.out.println("Creating an Associate");
		associate = associateService.create(associate);
    	return associate;
    }
	
	@RequestMapping(value = "/api/associate/delete", method = RequestMethod.POST, consumes = "application/json")
    public Associate delete(@RequestBody Associate associate) {
		System.out.println("Creating an Associate");
		associate = associateService.delete(associate);
    	return associate;
    }

}
