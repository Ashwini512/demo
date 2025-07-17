package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DemoDTO;
import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	@Autowired
	private DemoService demoService;
	@GetMapping("/demo")
	public String demoDetails() {
		return "demorelated controllers";
	}
	@PostMapping("/save")
	public String postDemoDetails(@RequestBody DemoDTO demoDto) {
		return demoService.addDemoDetails(demoDto);
		
	}
	@PutMapping("/update/{id}")
	public String putDemoDetails(@PathVariable long id,@RequestBody DemoDTO demodto) {
		return demoService.updateDemoDetails(id,demodto);
		
	}
	@PatchMapping("/patch/{id}/{topic}")
	public String patchDemoDetails(@PathVariable long id,@PathVariable String topic ) {
		return demoService.patchDemoDetails(id,topic);
	}
	@DeleteMapping("/delete/{id}")
	public DemoEntity deleteDemoDetails(@PathVariable long id) {
		return demoService.deleteDemoDetails(id);
	}
	@GetMapping("/getAllTopics")
	public List<String> getAllTpoics(){
		return demoService.getAllTopics();
	}
	@GetMapping("getDemoByTopic")
	public DemoEntity getDemoByTopic(@RequestParam String topic) {
		return demoService.getDemoByTopic(topic);
	}

}
