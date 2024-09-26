package com.wesource.we_source_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wesource.we_source_api.model.Publisher;
import com.wesource.we_source_api.repository.PublisherRepository;

@Controller
@RequestMapping(value = "/publisher")
public class PublisherController {
	
	@Autowired
	private PublisherRepository publisherRepository;
	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	public void savePublisher(@RequestBody Publisher publisher)
	{
		//TODO Save has started to work now... But need to change the 404 response on success save
		publisherRepository.save(publisher);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public ResponseEntity<List <Publisher>> getAllPubisher() {
		return (ResponseEntity<List<Publisher>>) ResponseEntity.ok(publisherRepository.findAll());
	}

}
