package HibernatePractical2_Annotation.HibernatePractical2_Annotation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernatePractical2_Annotation.HibernatePractical2_Annotation.Model.Sales;
import HibernatePractical2_Annotation.HibernatePractical2_Annotation.Model.Sales;

public class App 
{
    public static void main( String[] args )
    {
        /*Sales s1=new Sales();
        s1.setSid(203);
        s1.setSname("Mess_Application");
        s1.setSdept("Developer");
        s1.setScoll("30500");*/
        
        
        //step1
        Configuration con=new Configuration();
        con.configure("/HibernatePractical2_Annotation/HibernatePractical2_Annotation/Configuration/hibernate.cfg.xml");
        
        //step2
        SessionFactory sf=con.buildSessionFactory();
        
        //step3
        Session sk=sf.openSession();
        
        //step4
        //sk.save(s1);
        /*List<Sales> l1=sk.createQuery("From Sales").list();
        System.out.println(l1);*/
        
        /*Sales s=sk.get(Sales.class, 202);  //fetch record by id
    	System.out.println(s);*/
        
    	/*Sales s=sk.get(Sales.class,203); //delete record by id
    	sk.delete(s);*/
    	
    	Sales s=sk.get(Sales.class, 202);  //update record with id
    	s.setScoll("40000");  	  
    	sk.update(s);

        //step5
        sk.beginTransaction().commit();
        //System.out.println("Record Saved");
    }
    
}
