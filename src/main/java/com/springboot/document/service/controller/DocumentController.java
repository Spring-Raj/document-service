package com.springboot.document.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.document.service.entity.Document;
import com.springboot.document.service.service.DocumentService;

@RestController
@RequestMapping("/documents")
public class DocumentController {

	@Autowired
	private DocumentService documentService;
	
	@PostMapping("/")
	public Document saveDocument(@RequestBody Document document) {
		return documentService.saveDocument(document);
	}
	
	@GetMapping("/{id}")
	public Document findByDocumentId(@PathVariable("id") Long documentID) {
		return documentService.findByDocumentId(documentID);
	}
}
