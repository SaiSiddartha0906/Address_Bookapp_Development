package net.siddartha.addressbookapp.repository;


import net.siddartha.addressbookapp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
