package inv_dis_mgmtsys.model;

import java.text.DateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "supplier_finance")
public class Supplier_Finance implements Finance{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int supplier_finance_id;
		
	
	public int getSupplier_finance_id() {
		return supplier_finance_id;
	}

	public void setSupplier_finance_id(int supplier_finance_id) {
		this.supplier_finance_id = supplier_finance_id;
	}

	@Column
	private int supplier_orderID;
	
	@Column
	private double amount;
	

	@Column
	private String paymentState;
		
	@Column
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date payment_date;
	
	
	@Transient
	private double totalAmount;
	
	@Transient
	private Supplier supplier;
	
	@Transient
	private Item item;
	
	@Transient
	private String paymentDateInString;
	

	public String getPaymentDateInString() {
		return this.paymentDateInString = DateFormat.getDateInstance().format(this.payment_date);
	}

	public void setPaymentDateInString(String paymentDateInString) {
		this.paymentDateInString = paymentDateInString;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getSupplier_orderID() {
		return supplier_orderID;
	}

	public void setSupplier_orderID(int supplier_orderID) {
		this.supplier_orderID = supplier_orderID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentState() {
		return paymentState;
	}

	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}



	
}
