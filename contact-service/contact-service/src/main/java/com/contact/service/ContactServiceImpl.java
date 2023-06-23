package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{
    //fake list of contacts
    //Will soon connect it with database

    List<Contact> list = List.of(
            new Contact(1L,"abc@hk.com","abc","lucknow",1211L),
            new Contact(2L,"ba@hk.com","def","amsterdam",1211L),
            new Contact(3L,"ef@hk.com","ghi","bhopal",1212L),
            new Contact(4L,"gh@hk.com","jkl","Dubai",1212L),
            new Contact(5L,"ij@hk.com","mno","kukuo",1213L),
            new Contact(6L,"kl@hk.com","pqr","rome",1213L),
            new Contact(7L,"kl@hk.com","stv","duke",1214L),
            new Contact(8L,"jl@hk.com","wxy","rome",1214L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}







