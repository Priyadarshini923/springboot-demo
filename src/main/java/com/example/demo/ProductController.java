package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Details")
public class ProductController {
	@Autowired
	ProductService ps;
	@PostMapping(value="/sending")
	public String sending(@RequestBody Product p) {
		return ps.sending(p);
	}
	@GetMapping(value = "/show/{id}")
	public Product show(@PathVariable int id) {
		return ps.show(id);
	
	}
	@PostMapping(value="/List")
	public String bulk(@RequestBody List<Product> p) {
		return ps.bulk(p);
	}
	@DeleteMapping(value="/remove/{id}")
	public String deleteInfo(@PathVariable int id ) {
		return ps.deleteInfo(id);
	}
	@DeleteMapping(value ="/del")
	public String delete() {
		return ps.delete();
	}
	@PostMapping(value="/bulk")
	public String addInfo(@RequestBody List<Product> p) {
		return ps.addInfo(p);
	}
	
	

}
