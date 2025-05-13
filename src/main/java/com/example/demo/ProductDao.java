package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;

	public String sending(Product p) {
		pr.save(p);
		return "successfully sent";
	}

	public Product show(int id) {
		return pr.findById(id).get();
		
	}

	public String bulk(List<Product> p) {
		// TODO Auto-generated method stub
		pr.saveAll(p);
		return "Succesfully Updated";
	}

	public String deleteInfo(int id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
		return "Deleted";
	}

	public String delete() {
		// TODO Auto-generated method stub
		pr.deleteAll();
		return "Deleted all";
	}

	public String addInfo(List<Product> p) {
		// TODO Auto-generated method stub
		pr.saveAll(p);
		return "Added";
	}

}
