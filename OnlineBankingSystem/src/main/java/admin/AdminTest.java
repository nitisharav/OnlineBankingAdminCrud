package admin;




import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.AdminInputs;
import xml.AdminRepositoryImpl;

import java.util.ArrayList;
import java.util.List;


public class AdminTest { 
 @Test
	public void testcase1() {
   	
    	ApplicationContext container = new ClassPathXmlApplicationContext("myspring.xml");
    	
    	AdminRepositoryImpl ari = (AdminRepositoryImpl) container.getBean("AdminRepo");
  
    	List<AdminInputs> admininputs = ari.getAvailableAdminInputs();
    	for (AdminInputs admin : admininputs) {
    		System.out.println("Admin : "+admin);
    	}
    	
	}}

	

