package com.wesource.we_source_api.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wesource.we_source_api.model.Seeker;
import com.wesource.we_source_api.repository.SeekerRepository;

@Controller
@RequestMapping(value = "/seeker")
public class SeekerController {
	
	//TODO eliminate the repo usage in ctrlr
	@Autowired
	private SeekerRepository seekerRepository;
	
	@RequestMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getAllSeeker()
	{
		return "[ {'Name':'David','Category':'Driver'}, {'Name':'Manjula','Category':'House-Keeping'} ]";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	public void createSeeker(@RequestBody Seeker seeker) {
		//TODO need to change the 404 response on success save and return new ID
		seekerRepository.save(seeker);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity <Optional <Seeker>> getSeekerById(@PathVariable(value = "id") Integer seekerId) {
		return (ResponseEntity <Optional <Seeker>>) ResponseEntity.ok(seekerRepository.findById(seekerId));
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateSeeker(@RequestBody Seeker seeker, @PathVariable Integer id) {
		Optional<Seeker> savedSeeker = seekerRepository.findById(id);
		//TODO need to add the fields for all, Also success response now its sending as 404 which is not advised.
		savedSeeker.get().setApl_seeker_name(seeker.getApl_seeker_name());
		seekerRepository.save(savedSeeker.get());
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteSeekerById(@PathVariable(value = "id") Integer seekerId) {
		//TODO return success code with success message
		seekerRepository.deleteById(seekerId);
	}

}