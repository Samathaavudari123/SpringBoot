package com.createiq.hospital;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PurchaseOrder {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int order_id;
	@Column
	private String orderer;
	@Column
	private int product_id;
	@Column
	private int supplier_id;
	@Column
	private int quantity;
	@Column
	private Date date;
	@Column
	private String status;
	@Column
	private int sales_person_id;
	@Column
	private String product_name;
	public PurchaseOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PurchaseOrder(int order_id, String orderer, int product_id, int supplier_id, int quantity, Date date,
			String status, int sales_person_id, String product_name) {
		super();
		this.order_id = order_id;
		this.orderer = orderer;
		this.product_id = product_id;
		this.supplier_id = supplier_id;
		this.quantity = quantity;
		this.date = date;
		this.status = status;
		this.sales_person_id = sales_person_id;
		this.product_name = product_name;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrderer() {
		return orderer;
	}
	public void setOrderer(String orderer) {
		this.orderer = orderer;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getSales_person_id() {
		return sales_person_id;
	}
	public void setSales_person_id(int sales_person_id) {
		this.sales_person_id = sales_person_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	@Override
	public String toString() {
		return "PurchaseOrder [order_id=" + order_id + ", orderer=" + orderer + ", product_id=" + product_id
				+ ", supplier_id=" + supplier_id + ", quantity=" + quantity + ", date=" + date + ", status=" + status
				+ ", sales_person_id=" + sales_person_id + ", product_name=" + product_name + "]";
	}

	

}
