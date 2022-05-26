package com.back.demo.IDDData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IDD")
public class IDDController {
	private final IDDService IddService;

	@Autowired
	public IDDController(IDDService iddService) {
		IddService = iddService;
	}

	@GetMapping
	public List<IDD> getIDD(){
		return IddService.getIDD();
	}

	@PostMapping
	public void registerNewIDD(@RequestBody IDD idd) {
		IddService.addNewIDD(idd);
	}
}
