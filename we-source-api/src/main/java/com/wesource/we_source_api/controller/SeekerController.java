package com.wesource.we_source_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/seeker")
public class SeekerController {
	
	@RequestMapping(value = "/all", produces = "application/json")
	@ResponseBody
	public String getAllSeeker()
	{
		return "[ {'Name':'David','Category':'Driver'}, {'Name':'Manjula','Category':'House-Keeping'} ]";
	}
	

}