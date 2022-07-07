package com.back.demo.LocRoaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/LocRoaming")
public class LocRoamingController {
	private final LocRoamingService LocRoamingService;

	@Autowired
	public LocRoamingController(LocRoamingService LocRoamingService) {
		this.LocRoamingService = LocRoamingService;
	}

	@GetMapping
	public List<LocRoaming> getLocRoaming(){
		return LocRoamingService.getLocRoaming();
	}

	@PostMapping
	public void registerNewLocRoaming(@RequestBody LocRoaming LocRoaming) {
		LocRoamingService.addNewLocRoaming(LocRoaming);
	}
}
