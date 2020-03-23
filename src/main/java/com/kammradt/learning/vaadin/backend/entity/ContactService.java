package com.kammradt.learning.vaadin.backend.entity;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ContactService {

    private ContactRepository contactRepository;

    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    public List<Contact> findAll() {
        return contactRepository.findAll();
    }
}
