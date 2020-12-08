package admin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.AdminInputs;
import xml.AdminRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class UpdateAdminInputs {
	public static void main(String[] args) {

		
	/*	 AdminInputs ai =new AdminInputs();
		 ai.setReferenceId(107);
		 ai.setApproval("NO");
		 ai.setAccount_no("11002626008");
		 ai.setAdmin_remarks("Document Incorrect"); */
		ApplicationContext container = new ClassPathXmlApplicationContext("myspring.xml");
		
		AdminRepositoryImpl ari = (AdminRepositoryImpl) container.getBean("AdminRepo");
	    ari.updateAdminInputs(107, "NO", "11002626007", "Document Incorrect");
	    
		List<AdminInputs> admininputs = ari.getAvailableAdminInputs();
		for (AdminInputs admin : admininputs) {
			System.out.println("Admin : "+admin);
		}
		System.out.println("AdminInput Updated sucessfully");
	}

}
