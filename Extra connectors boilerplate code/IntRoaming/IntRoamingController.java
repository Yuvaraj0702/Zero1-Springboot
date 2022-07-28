package com.back.demo.IntRoaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IntRoaming")
public class IntRoamingController {
	private final IntRoamingService IntRoamingService;

	@Autowired
	public IntRoamingController(IntRoamingService IntRoamingService) {
		this.IntRoamingService = IntRoamingService;
	}

	@GetMapping
	public List<IntRoaming> getIntRoaming(){
		return IntRoamingService.getIntRoaming();
	}

	@PostMapping
	public void registerNewIntRoaming(@RequestBody IntRoaming IntRoaming) {
		IntRoamingService.addNewIntRoaming(IntRoaming);
	}
}
