package com.hibernate.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args ) throws Exception
   
    {
//    	StudentName sname = new StudentName();
//    	sname.setFname("Amulya");
//    	sname.setLname("Vempati");
//    	sname.setMname("Chandhana");
//        Student s1 = new Student();
//        s1.setsID(103);
//        s1.setsName(sname);
//        s1.setsMarks(92);
    	Laptop lap = new Laptop();
    	lap.setlID(101);
    	lap.setlName("Dell");
    	
    	Employee emp = new Employee();
    	emp.seteId(1);
    	emp.seteName("Amulya");
    	emp.seteSalary(900000);
    	emp.getLaptop().add(lap);
    	
    	
        
       // Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Employee.class);
        
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();  
        SessionFactory sf = con.buildSessionFactory(reg); 	
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
//        session.persist(s1);
//        s1 = (Student)session.get(Student.class,103);
        
        session.save(lap);
        session.save(emp);
        
        tx.commit();
//        System.out.println("Added student successfully");
//        System.out.println(s1);
    }
}
