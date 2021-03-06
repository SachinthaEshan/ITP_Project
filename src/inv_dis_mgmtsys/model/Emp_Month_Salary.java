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
@Table(name = "emp_month_salary")
public class Emp_Month_Salary {
				
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_month_sal_ID;
	
	@Column
	private int emp_month_sal_month;
	
	@Column
	private int emp_month_sal_empID;
	
	
	
	public int getEmp_month_sal_empID() {
		return emp_month_sal_empID;
	}

	public void setEmp_month_sal_empID(int emp_month_sal_empID) {
		this.emp_month_sal_empID = emp_month_sal_empID;
	}

	public int getEmp_month_sal_ID() {
		return emp_month_sal_ID;
	}

	public void setEmp_month_sal_ID(int emp_month_sal_ID) {
		this.emp_month_sal_ID = emp_month_sal_ID;
	}

	public int getEmp_month_sal_month() {
		return emp_month_sal_month;
	}

	public void setEmp_month_sal_month(int emp_month_sal_month) {
		this.emp_month_sal_month = emp_month_sal_month;
	}

	public int getEmp_month_sal_year() {
		return emp_month_sal_year;
	}

	public void setEmp_month_sal_year(int emp_month_sal_year) {
		this.emp_month_sal_year = emp_month_sal_year;
	}

	public double getEmp_month_sal_amount() {
		return emp_month_sal_amount;
	}

	public void setEmp_month_sal_amount(double emp_month_sal_amount) {
		this.emp_month_sal_amount = emp_month_sal_amount;
	}

	public String getEmp_month_sal_status() {
		return emp_month_sal_status;
	}

	public void setEmp_month_sal_status(String emp_month_sal_status) {
		this.emp_month_sal_status = emp_month_sal_status;
	}

	public Date getEmp_month_sal_date() {
		return emp_month_sal_date;
	}

	public void setEmp_month_sal_date(Date emp_month_sal_date) {
		this.emp_month_sal_date = emp_month_sal_date;
	}

	@Column
	private int emp_month_sal_year;
	
	@Column
	private double emp_month_sal_amount;
	
	@Column
	private String emp_month_sal_status;
	
	@Column
	private String emp_month_sal_category;
	
	public String getEmp_month_sal_category() {
		return emp_month_sal_category;
	}

	public void setEmp_month_sal_category(String emp_month_sal_category) {
		this.emp_month_sal_category = emp_month_sal_category;
	}

	@Column
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date emp_month_sal_date;
	
	@Transient
	private String emp_month_sal_dateInString;
		
	public String getEmp_month_sal_dateInString() {
		return DateFormat.getDateInstance().format(this.emp_month_sal_date);
	}

	public void setEmp_month_sal_dateInString(String emp_month_sal_dateInString) {
		this.emp_month_sal_dateInString = emp_month_sal_dateInString;
	}

	

}
