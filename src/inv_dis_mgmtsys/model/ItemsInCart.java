package inv_dis_mgmtsys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "item")
public class ItemsInCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int item_itemcode;
	
	@Column
	private String item_type;
	
	@Column
	private String item_name;
	
	@Column
	private double item_saleprice;
	
	@Column
	private double item_grossprice;
	
	@Transient
	private double item_amount;
	
	@Transient
	private int cart_ID;
	
	public int getItem_itemcode() {
		return item_itemcode;
	}
	public void setItem_itemcode(int item_itemcode) {
		this.item_itemcode = item_itemcode;
	}
	public String getItem_type() {
		return item_type;
	}
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public double getItem_saleprice() {
		return item_saleprice;
	}
	public void setItem_saleprice(double item_saleprice) {
		this.item_saleprice = item_saleprice;
	}
	public double getItem_grossprice() {
		return item_grossprice;
	}
	public void setItem_grossprice(double item_grossprice) {
		this.item_grossprice = item_grossprice;
	}
	@Transient
	public double getItem_amount() {
		return item_amount;
	}
	@Transient
	public void setItem_amount(double item_amount) {
		this.item_amount = item_amount;
	}
	
	@Transient
	public int getCart_ID() {
		return cart_ID;
	}
	@Transient
	public void setCart_ID(int cart_ID) {
		this.cart_ID = cart_ID;
	}
}
