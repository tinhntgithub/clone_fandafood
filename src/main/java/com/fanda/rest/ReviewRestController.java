package com.fanda.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/review")
public class ReviewRestController {
	@Autowired
	ReviewService rServ;
	
	
	@GetMapping()
	public List<Review> getAll() {
		return rServ.findAll();
	}
	@GetMapping("{id}")
	public Review getById(@PathVariable("id") String id) {
		return rServ.findById(id);
	}
	@PostMapping
	public Review create(@RequestBody Review o) {
		return rServ.create(o);
	}
	
	@PutMapping("{id}")
	public Review update(@PathVariable("id") String id, @RequestBody Review o) {
		return rServ.update(o);
	}
	

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") String id) {
		rServ.delete(id);
}