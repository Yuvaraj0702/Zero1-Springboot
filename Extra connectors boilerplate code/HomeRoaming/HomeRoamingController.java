package com.back.demo.HomeRoaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/HomeRoaming")
public class HomeRoamingController {
	private final com.back.demo.HomeRoaming.HomeRoamingService HomeRoamingService;

	@Autowired
	public HomeRoamingController(com.back.demo.HomeRoaming.HomeRoamingService HomeRoamingService) {
		this.HomeRoamingService = HomeRoamingService;
	}

	@GetMapping
	public List<HomeRoaming> getHomeRoaming(){
		return HomeRoamingService.getHomeRoaming();
	}

	@PostMapping
	public void registerNewHomeRoaming(@RequestBody HomeRoaming HomeRoaming) {
		HomeRoamingService.addNewHomeRoaming(HomeRoaming);
	}
}
