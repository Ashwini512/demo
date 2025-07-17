package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.DemoDTO;
import com.example.demo.entity.DemoEntity;

public interface DemoService {
	public String addDemoDetails(DemoDTO demoDto); 
	public String updateDemoDetails(long id,DemoDTO demoDto);
	public String patchDemoDetails(long id,String topic);
    public DemoEntity deleteDemoDetails(long id);
    public List<String> getAllTopics();

	public DemoEntity getDemoByTopic(String topic);
	
}
