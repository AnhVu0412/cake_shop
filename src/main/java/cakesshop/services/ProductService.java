package cakesshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cakesshop.DAO.ProductDAO;
import cakesshop.model.Product;

@Service(value="ProductService")
@Transactional
public class ProductService {
	@Autowired
	private ProductDAO productDAO;
	
	public List<Product> findALL(){
		return productDAO.findAll();
	}
	
	public Product findById(String id){
		return productDAO.findById(id);
	}
	
	public void save(Product product) {
		 productDAO.save(product);
	}
	
	public void delete(Product product) {
		productDAO.delete(product);
	}

}
