package com.ruby.OnlineFoodApp.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Food {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer foodId;
	private String foodName;
	private Integer quantity;
	private Integer price;

	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Category category;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "cartId")
	private Cart cart;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(Integer foodId, String foodName, Integer quantity, Integer price, Category category, Cart cart) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.quantity = quantity;
		this.price = price;
		this.category = category;
		this.cart = cart;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" + foodName + ", quantity=" + quantity + ", price=" + price
				+ ", category=" + category + ", cart=" + cart + "]";
	}

}
