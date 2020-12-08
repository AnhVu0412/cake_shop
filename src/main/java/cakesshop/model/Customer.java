package cakesshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class Customer {

	@Id
	@Column(name="customerID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerID;
	
	@Column(name="customerName")
	private String customerName;
	
	@Column(name="customerEmail")
	private String customerEmail;
	
	@Column(name ="customerPhone")
	private int customerPhone;
	
	@Column(name="customerAddress")
	private String customerAddress;
	
	@Column(name="customerAccount")
	private String customerAccount;
	
	@Column(name="customerPassword")
	private String customerPassword;

	public Customer(int customerID, String customerName, String customerEmail, int customerPhone,
			String customerAddress, String customerAccount, String customerPassword) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
		this.customerAccount = customerAccount;
		this.customerPassword = customerPassword;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(String customerAccount) {
		this.customerAccount = customerAccount;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

}
