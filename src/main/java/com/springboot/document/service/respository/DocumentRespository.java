package com.springboot.document.service.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.document.service.entity.Document;

@Repository
public interface DocumentRespository extends JpaRepository<Document, Long>{

	Document findByDocumentId(long documentID);

}
