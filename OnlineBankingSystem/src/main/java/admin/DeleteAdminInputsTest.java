package admin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.AdminInputs;
import xml.AdminRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class DeleteAdminInputsTest {
  public static void main(String[] args) {
	  ApplicationContext container = new ClassPathXmlApplicationContext("myspring.xml");
		
		AdminRepositoryImpl ari = (AdminRepositoryImpl) container.getBean("AdminRepo");
	    ari.deleteAdminInputs(107);
	    
		List<AdminInputs> admininputs = ari.getAvailableAdminInputs();
		for (AdminInputs admin : admininputs) {
			System.out.println("Admin : "+admin);
			
		}
		
		System.out.println("AdminInputs deleted sucessfully");
	}
}

