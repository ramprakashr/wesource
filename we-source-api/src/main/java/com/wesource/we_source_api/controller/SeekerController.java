package com.wesource.we_source_api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
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
		seekerRepository.save(seeker);
	}
	

}