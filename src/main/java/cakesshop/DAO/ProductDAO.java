package cakesshop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cakesshop.model.Product;

@Repository(value="ProductDAO")
@Component
@Transactional(rollbackFor = Exception.class)
public class ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public void save(final Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
	}
	public Product findById(final String id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Product.class, id);
	}
	public void update(final Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.update(product);
	}
	public void delete(final Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(product);
	}
	public List<Product> findAll(){
		Session session =sessionFactory.getCurrentSession();
		List<Product> list = session.createQuery("From Product",Product.class).getResultList();
		List<Product> listHP = new ArrayList<Product>() ;
		for (int i = list.size()-1; i < list.size();i++) {			
			listHP.add(list.get(i));
		}
		return listHP ;
	}
}
