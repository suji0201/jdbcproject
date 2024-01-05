package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.userentity;
import com.example.demo.repository.userrepo;

@RestController
public class usercontroller {
	@Autowired
	private userrepo repo;
	@PostMapping("/adduser")
	public userentity adduser(@RequestBody userentity pro) {
try {
	repo.save(pro);
	return pro;
}catch(Exception e) {
	e.printStackTrace();
}
return null;
}

@GetMapping("/getuser")
public List<userentity>getuser(){
	try {
		return repo.findAll();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}

@PutMapping("/updateuser")
public userentity updateuser(@RequestBody userentity pro) {
try {
repo.save(pro);
return pro;
}catch(Exception e) {
e.printStackTrace();
}
return null;
}

@DeleteMapping("/delete/{Id}")
public String deleteuser(@PathVariable int Id) {
	try {
		userentity user=repo.getOne(Id);
		repo.delete(user);
		return"user deleted";
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
}
