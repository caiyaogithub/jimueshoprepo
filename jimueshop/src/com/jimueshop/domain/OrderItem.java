package com.jimueshop.domain;
/**
 * 
 * @description 对应数据库TAB_ORDER_ITEM表，存储订单详细信息
 *
 * @author hello world
 *
 * @modifyTime 2015年9月28日
 */
public class OrderItem {
	private Integer id ;
	private Order order ;
	private Product product ;
	private String productName ;
	private double price ;
	private int productNum ;
	private String flag ;
	private User user ;
	
	
	public OrderItem() {
	}
	public OrderItem(Order order, Product product, String productName,
			double price, int productNum, String flag , User user) {
		super();
		this.order = order;
		this.product = product;
		this.productName = productName;
		this.price = price;
		this.productNum = productNum;
		this.flag = flag ;
		this.user = user;
	}


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
}
