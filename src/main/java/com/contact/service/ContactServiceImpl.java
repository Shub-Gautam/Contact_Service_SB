package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> contactList = List.of(
            new Contact(1L,"shubham@gmail.com","Shubham",1312L),
            new Contact(2L,"Mariyam@gmail.com","Mariyam",1311L),
            new Contact(3L,"Aditya@gmail.com","Aditya",1313L),
            new Contact(4L,"Garima@gmail.com","Garima",1311L),
            new Contact(5L,"Adi@gmail.com","Adi",1311L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
