package hibernateOrm;

import javax.persistence.*;

@Entity //ilk anotasyonumuz Entity. Bu anotasyon ile Hibernate'e bu classın orm için kullanılacağını belirtmiş oluyoruz.
@Table(name = "employees") // Table anotasyonu içerisinde ilişkilendireceğimiz tablonun ismini yazıyoruz
public class Employee {
	@Id // Altındaki değişkenin bir id olduğunu yani veriyi ayırt edici bir sütun olduğunu belirtiyoruz
	@Column(name="emp_no") // Sütunumuzun adını yazıyoruz
	private int emp_no;
	
	@Column(name="first_name") // Sütunumuzun adını yazıyoruz
	private String first_name;
	
	@Column(name="last_name") // Sütunumuzun adını yazıyoruz
	private String last_name;
	
	@Column(name = "gender") // Sütunumuzun adını yazıyoruz
	private String gender;
	
	
	//Constructor
	public Employee(int emp_no, String first_name, String last_name, String gender) {
		this.emp_no = emp_no;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
	}
	
	public Employee() {
		super();
	}
	
	
	//Getters-Setters
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
