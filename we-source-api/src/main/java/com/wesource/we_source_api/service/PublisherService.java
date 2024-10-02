package com.wesource.we_source_api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesource.we_source_api.model.Publisher;
import com.wesource.we_source_api.repository.PublisherRepository;

@Service
public class PublisherService {
	
	@Autowired
	private PublisherRepository publisherRepository;
	
	public void saveNewPublisher(Publisher publisher) {
		
		publisher.setAdm_publisher_created_date(new Date());
		
		publisherRepository.save(publisher);
		
	}

}
