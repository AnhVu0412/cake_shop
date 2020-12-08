package cakesshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column(name="productID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productID;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productImage")
	private String productImage;
	
	@Column(name="productPrice")
	private float productPrice;
	
	@Column(name="productDetails")
	private String productDetails;
	
	@Column(name="productCategoryID")
	private int productCategoryID ;

	public Product(int productID, String productName, String productImage, float productPrice, String productDetails,
			int productCategoryID) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.productDetails = productDetails;
		this.productCategoryID = productCategoryID;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public int getProductCategoryID() {
		return productCategoryID;
	}

	public void setProductCategoryID(int productCategoryID) {
		this.productCategoryID = productCategoryID;
	}
	
}
