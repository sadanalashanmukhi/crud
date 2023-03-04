package com.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud.model.crud;
import com.crud.repository.crudRepository;

@RestController
@RequestMapping("/BFS")
public class crudController {
	@Autowired
	crudRepository cr;
	//Inserting a new Record	(CREATE)
	@PostMapping("/add")
	public crud addCertification(@RequestBody crud c) {
		return cr.save(c);
	}
	//To fetch the records		(READ)
	@GetMapping("/getall")
	public Iterable<crud> allDetails(){
		return cr.findAll();
	}
	@GetMapping("/getbyid/{id}")
	public Optional<crud> getById(@PathVariable("id") int eid){
		return cr.findById(eid);
		
	}
	//Update the record			(UPDATE)
	@PutMapping("/edit")
	public crud updateCrud(@RequestBody crud c) {
		return cr.save(c);
	}
	//Deleting the record 		(DELETE)
	@DeleteMapping("/delete/{id}")
	public void deleterec(@PathVariable("id") int eid) {
		 cr.deleteById(eid);
	}
	

}
