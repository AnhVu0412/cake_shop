package cakesshop.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cakesshop.model.Customer;

@Repository(value="CustomerDAO") 
@Transactional
@Component
public class CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public void save(final Customer cus) {
		Session session = sessionFactory.getCurrentSession();
		session.save(cus);
	}
	public Customer findById(final String id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, id);
	}
	public void update(final Customer cus) {
		Session session = sessionFactory.getCurrentSession();
		session.update(cus);
	}
	public void delete(final Customer cus) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(cus);
	}
	public List<Customer> findAll(){
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("From customer",Customer.class).getResultList();
	}
}
