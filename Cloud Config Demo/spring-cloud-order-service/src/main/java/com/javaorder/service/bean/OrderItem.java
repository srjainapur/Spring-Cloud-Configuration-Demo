package com.javaorder.service.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SC_ORDER_ITEM")
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", nullable=false, length=10, unique=true)
	private Integer id;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="QTY", length=5, nullable=false)
	private Integer quantity;
	
	@Column(name="PRICE")
	private Integer price;
	
	@Column(name="SKU")
	private String sku;
	
	@Column(name="VARIANT_TITLE")
	private String variantTitle;
	
	@Column(name="VENDOR")
	private String vendor;
	
	@Column(name="PRODUCT_ID")
	private String productId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="IS_TAXABLE")
	private Boolean taxable;
	
	@Column(name="IS_GIFT_CARD")
	private Boolean giftCard;
	
	@Column(name="FULFILLMENT_SERVICE")
	private String fulfillmentService;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getVariantTitle() {
		return variantTitle;
	}

	public void setVariantTitle(String variantTitle) {
		this.variantTitle = variantTitle;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getTaxable() {
		return taxable;
	}

	public void setTaxable(Boolean taxable) {
		this.taxable = taxable;
	}

	public Boolean getGiftCard() {
		return giftCard;
	}

	public void setGiftCard(Boolean giftCard) {
		this.giftCard = giftCard;
	}

	public String getFulfillmentService() {
		return fulfillmentService;
	}

	public void setFulfillmentService(String fulfillmentService) {
		this.fulfillmentService = fulfillmentService;
	}

}
