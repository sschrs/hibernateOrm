package hibernateOrm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml") //En başta oluşturduğumuz Configuration dosyası
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession(); //SessionFactory ile session oluşturuyoruz.
		
		//List<Employee> employees = session.createQuery("from Employee").getResultList(); --> Tüm verileri çekmek
		
		//List<Employee> employees = session.createQuery("from Employee e where e.gender = 'M'").getResultList(); --> Koşullu Sorgu
		
		/*
		 	INSERT İŞLEMİ
		 	Employee employee = new Employee(); // Employee sınıfından bir nesne oluşturuyoruz
			employee.setFirst_name("Süleyman"); // Set metodları ile bilgileri giriyoruz
			employee.setLast_name("Özarslan");
			employee.setGender("M"); 
			session.save(employee); // Save ile insert ediyoruz
		 */
		
		/*
		 	UPDATE İŞLEMİ
		 	int guncellemek_istedigimiz_verinin_idsi = 0;
			// Güncellemek istediğimiz veriyi Idsi ile alıyoruz
			Employee e = session.get(Employee.class,guncellemek_istedigimiz_verinin_idsi); 
			e.setFirst_name("Ahmet"); // İstediğimiz değişiklikleri yapıyoruz
			session.save(e); // Update ediyoruz
		 */
		
		try {
			session.beginTransaction();
			int silmek_istedigimiz_verinin_idsi = 0;
			Employee e = session.get(Employee.class,silmek_istedigimiz_verinin_idsi);
			session.delete(e);
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
		
		

	}
    
}
