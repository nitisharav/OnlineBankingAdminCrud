package admin;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.AdminInputs;
import xml.AdminRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class AddAdminInputTest {
	public static void main(String[] args) {
		
	
	 AdminInputs ai =new AdminInputs();
	 ai.setReferenceId(107);
	 ai.setApproval("YES");
	 ai.setAccount_no("11002626007");
	 ai.setAdmin_remarks("All Ok");
	ApplicationContext container = new ClassPathXmlApplicationContext("myspring.xml");
	
	AdminRepositoryImpl ari = (AdminRepositoryImpl) container.getBean("AdminRepo");
    ari.addAdminInputs(ai);
    
	List<AdminInputs> admininputs = ari.getAvailableAdminInputs();
	for (AdminInputs admin : admininputs) {
		System.out.println("Admin : "+admin);
		
	}
	System.out.println("AdminInputs added sucessfully");
}
}
