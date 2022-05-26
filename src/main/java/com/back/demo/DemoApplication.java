package com.back.demo;

import com.back.demo.IDDData.IDD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
//@RestController
public class  DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping
//	public List<IDD> hello(){
//		return List.of(new IDD(1L,"Singapore",123,12,23,67),
//				new IDD(2L,"Nigeria",343,122,232,167));
//	}
}
