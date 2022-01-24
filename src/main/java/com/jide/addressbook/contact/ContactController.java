package com.jide.addressbook.contact;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/contact")
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<ContactResponse> addContact(@RequestBody Contact contact) {
        contactService.addNewContact(contact);

        ContactResponse r = new ContactResponse(
                "200",
                "Contact added for " + contact.getName(),
                contact.getPhone());

        return new ResponseEntity<>(r, HttpStatus.OK);
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getContacts();
    }

    @GetMapping(path = "{name}")
    public Optional<Contact> getContact(@PathVariable("name") String name) {
        return contactService.getContactByName(name);
    }

}
