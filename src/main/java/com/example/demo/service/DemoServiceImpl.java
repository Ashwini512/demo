
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DemoDTO;
import com.example.demo.entity.DemoEntity;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {
	@Autowired
	private DemoRepository demoRepository;
	@Override
	 public String addDemoDetails( DemoDTO demoDto) {
		DemoEntity demoentity=new DemoEntity();
		demoentity.setDate(demoDto.getDate());
		demoentity.setTopic(demoDto.getTopic());
		DemoEntity savedentity=demoRepository.save(demoentity);
		return savedentity!=null ? "saved":"failed";
	 
		
	}
	@Override
	public String updateDemoDetails(long id,DemoDTO demodto) {
		DemoEntity updateEntity=demoRepository.findById(id).orElse(null);
	    updateEntity.setDate(demodto.getDate());
	    updateEntity.setTopic(demodto.getTopic());
	    demoRepository.save(updateEntity);
		return "updated the demo details";
		
	}
	@Override
	public String patchDemoDetails(long id,String topic) {
		DemoEntity updateEntity=demoRepository.findById(id).orElse(null);
		updateEntity.setTopic(topic);
		demoRepository.save(updateEntity);
		return "topic is updated";
		
	}
	@Override
	public DemoEntity deleteDemoDetails(long id) {
		DemoEntity deleteEntity=demoRepository.findById(id).orElse(null);
	    demoRepository.delete(deleteEntity);
	    return deleteEntity;
	}
	@Override
	public List<String> getAllTopics() {	
		List<DemoEntity> topic= demoRepository.findAll();
		List<String> topics=new ArrayList<>();
		for(DemoEntity entity:topic) {
			topics.add(entity.getTopic());
		}
		return topics;
	}
	@Override
	public DemoEntity getDemoByTopic(String topic) {
		DemoEntity entity=demoRepository.findByTopic(topic); 
		return entity;
	}
	
	public String applicationName() {
		
		return "Demo";
	}
	
	public void display() {
		System.out.println("It si a demo project");
	}
	

}
