package com.wesource.we_source_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wesource.we_source_api.model.Publisher;
import com.wesource.we_source_api.repository.PublisherRepository;
import com.wesource.we_source_api.service.PublisherService;

@Controller
@RequestMapping(value = "/publisher")
public class PublisherController {
	
	//TODO PublisherService has been introduce gradually eliminate the repo usage in ctrlr
	@Autowired
	private PublisherRepository publisherRepository;
	
	@Autowired
	private PublisherService publisherService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	public void savePublisher(@RequestBody Publisher publisher)
	{
		//TODO Save has started to work now... But need to change the 404 response on success save and return new ID
		publisherService.saveNewPublisher(publisher);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public ResponseEntity<List <Publisher>> getAllPubisher() {
		return (ResponseEntity<List<Publisher>>) ResponseEntity.ok(publisherRepository.findAll());
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<Optional<Publisher>> getPubisherById(@PathVariable(value = "id") Integer id) {
		//TODO return empty obj instead of null or 404 with user not found message
		return (ResponseEntity<Optional<Publisher>>) ResponseEntity.ok(publisherRepository.findById(id));
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updatePublisher(@PathVariable(value = "id") Integer id, @RequestBody Publisher publisher) {
		
		Optional<Publisher> savedPublisher = publisherRepository.findById(id);
		savedPublisher.get().setAdm_publisher_dob(publisher.getAdm_publisher_dob());
		//TODO Update worked, need to add the fields for all, Also success response now its sending as 404 which is not advised.
		publisherRepository.save(savedPublisher.get());
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deletePublisher(@PathVariable(value = "id") Integer id) {
		
		//TODO return success code with success message
		publisherRepository.deleteById(id);
		
	}

}
