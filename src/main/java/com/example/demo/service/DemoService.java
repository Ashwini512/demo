
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.DemoDTO;
import com.example.demo.entity.DemoEntity;

public interface DemoService {
	    String addDemoDetails(DemoDTO demoDto);
	    String updateDemoDetails(long id, DemoDTO demoDto);
	    String patchDemoDetails(long id, String topic);
	    DemoEntity deleteDemoDetails(long id);
	    List<String> getAllTopics();

	    DemoEntity getDemoByTopic(String topic);
	    DemoEntity getDemoById(long id);
	    String patchDetails(long id);
	

}

