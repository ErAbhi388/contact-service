package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;

public interface ContactService {
	
	public Contact getContactsById(Long userId);

}
