package com.springboot.document.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.document.service.entity.Document;
import com.springboot.document.service.respository.DocumentRespository;

@Service
public class DocumentService {
	
	@Autowired
	private DocumentRespository documentRespository;
	
	public Document saveDocument(Document document) {
		return documentRespository.save(document);
	}

	public Document findByDocumentId(Long documentID) {
		return documentRespository.findByDocumentId(documentID);
	}

}
