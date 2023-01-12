package com.example.EmailSendingTest.EmailPackage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepo  extends JpaRepository<EmailDetails_entity,Long>{





}

