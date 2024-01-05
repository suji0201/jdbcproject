package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.userentity;
@Repository
public interface userrepo extends JpaRepository <userentity,Integer> {
	

}
