package com.tina.CM.repository;

import com.tina.CM.domain.model.Mail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRepo extends JpaRepository<Mail, Long> {
}
