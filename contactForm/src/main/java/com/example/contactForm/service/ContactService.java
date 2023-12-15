package com.example.contactForm.service;

import com.example.contactForm.model.Contact;
import com.example.contactForm.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = false;

        Contact savedContact = contactRepository.save(contact);

        if(null != savedContact && savedContact.getContactId() > 0){
            isSaved = true;
        }
        return isSaved;
    }
}
