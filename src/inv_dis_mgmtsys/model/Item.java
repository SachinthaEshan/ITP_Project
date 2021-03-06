package inv_dis_mgmtsys.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "item")
public class Item{
	
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

	@ManyToOne
    private Supplier supplier;
	
	@Column
	private double item_percentageProfit;

	@Transient
	private List<Item> itemList; 
	
	@Column
	private int item_supplier_ID;
	
	@Transient
	private String Supplier_Name;
	
	@Transient
	private int supplierID;
	
	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public int getItem_supplier_ID() {
		return item_supplier_ID;
	}

	public void setItem_supplier_ID(int item_supplier_ID) {
		this.item_supplier_ID = item_supplier_ID;
	}

	public String getSupplier_Name() {
		return Supplier_Name;
	}

	public void setSupplier_Name(String supplier_Name) {
		Supplier_Name = supplier_Name;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

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

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public double getItem_percentageProfit() {
		return item_percentageProfit;
	}

	public void setItem_percentageProfit(double item_percentageProfit) {
		this.item_percentageProfit = item_percentageProfit;
	}

	

}
