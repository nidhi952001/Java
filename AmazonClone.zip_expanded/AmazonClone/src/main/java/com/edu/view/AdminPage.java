package com.edu.view;

import java.sql.*;
import java.util.*;

import com.edu.repository.DatabaseConnection;
import com.edu.service.*;

public class AdminPage {
	static Connection conn=null;
	Statement st = null;
	ResultSet rs = null;
	 static {
		 DatabaseConnection dc = new DatabaseConnection();
	        try {
	            conn = dc.getDatabaseConnection();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	String userContinue = "";
	Scanner sc = new Scanner(System.in);
	
	public void adminMenu(String name, int id) throws SQLException {
		System.out.println("Hello "+ name +" welcome to Admin ");
		do {
			System.out.println("1. View all Customer\n2. View all Dealers\n3. View all Available Products");
			System.out.println("4. View all Ordered Products\n5. Logout\nEnter choice: ");
			int ch = sc.nextInt();
			
			AdminInterface aI = new AdminImp();
			
			switch(ch) {
			case 1: aI.viewAllCustomers(); 
					break;
					
			case 2: aI.viewAllDealers();
					break;
					
			case 3: aI.viewAllProducts();
					break;
			
			case 4: aI.viewOrderedProducts();
					break;
					
			case 5: System.out.println("Visit Again...");
					userContinue="no";
					break;
			}
			
			if(userContinue!="no") {
				System.out.println(" You want to perform other operation");
				userContinue = sc.next().toLowerCase();
			}
		}while(userContinue.equals("yes"));
	}
}
