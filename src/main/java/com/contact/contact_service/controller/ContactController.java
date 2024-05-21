package com.contact.contact_service.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.contact_service.entity.Contact;
import com.contact.contact_service.service.impl.ContactServiceImpl;

@RestController
@RequestMapping(value="/contacts")
public class ContactController {
	
	@Autowired
	ContactServiceImpl contactServiceImpl;
	
	@GetMapping(value="/{userId}")
	public List<Contact> getContactsByUserId(@PathVariable("userId")Long id) {
		return contactServiceImpl.getContactsById(id);
	}

	//	//http://localhost:9002/contacts/contact
	@GetMapping(value="/contact")
	public String helloContact() {
		return "This is contact microservice";
	}

	// http://localhost:9002/contacts/current-user
	@GetMapping(value="/current-user")
	public String getCurrentlyLoggedInUser(Principal principal) {

		return principal.getName();
	}
	
	

}
