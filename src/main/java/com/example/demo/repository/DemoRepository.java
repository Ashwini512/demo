package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.DemoEntity;

public interface DemoRepository extends JpaRepository<DemoEntity, Long> {

}
