package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	@Autowired
	ProductDao pd;

	public String sending(Product p) {
		// TODO Auto-generated method stub
		return pd.sending(p);
	}

	public Product show(int id) {
		
		return pd.show(id);
		
	}

	public String bulk(List<Product> p) {
		// TODO Auto-generated method stub
		return pd.bulk(p);
	}

	public String deleteInfo(int id) {
		// TODO Auto-generated method stub
		return pd.deleteInfo(id);
	}

	public String delete() {
		// TODO Auto-generated method stub
		return pd.delete();
	}

	public String addInfo(List<Product> p) {
		// TODO Auto-generated method stub
		return pd.addInfo(p);
	}
	

}
