package com.contact.contact_service.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;

@Service
public class ContactServiceImpl {
	
	private List<Contact> contacts = List.of(new Contact(123l, "Arvind", "arvind.pandey@gmail.com", 9889L, 897L),
			new Contact(456L, "Subhra", "subhra.pandey@gmail.com", 788L, 567L),
			new Contact(789L, "Anushka", "Sundaram.pandey@gmail.com", 1267L, 567L),
			new Contact(333L, "Viabhav", "Vaibhav.pandey@gmail.com", 2234L, 123L),
			new Contact(123L, "Sunny", "Sunny.pandey@gmail.com", 8765L, 7665L));
	
	public List<Contact> getContactsById(Long id) {
		return this.contacts.stream().filter(contact -> contact.getUserId().equals(id)).collect(Collectors.toList());
	}

}
