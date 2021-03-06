package com.jide.addressbook.contact;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void addNewContact(Contact contact) {
        contactRepository.save(contact);
    }

    public List<Contact> getContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactByName(String name) {
        return contactRepository.findContactByName(name);
    }

    public void updateContact(Long id, Contact contact) {
        Optional<Contact> c = contactRepository.findById(id);

        if (c.isPresent()) {
            contactRepository.save(contact);
        }
    }

    public void removeContactById(Long id) {
        contactRepository.deleteById(id);
    }

    public void removeAllContacts() {
        contactRepository.deleteAll();
    }
}
