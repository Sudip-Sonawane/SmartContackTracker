package com.sct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sct.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, String> {

}
