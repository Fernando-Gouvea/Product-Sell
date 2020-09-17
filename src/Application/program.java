package Application;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.UsedProduct;
import Entities.product;

public class program {

	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		
		List<product> list = new ArrayList<>();
		
		System.out.println("Enter the number of products:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("<<<Product Data>>>");
			System.out.println("Commun, used or imported (C/U/i)");
			char ch = sc.next().charAt(0);
			
			System.out.println("Name:");
			String name = sc.next();
			sc.nextLine();
			System.out.println("Price:");
			Double price = sc.nextDouble();
			if (ch == 'i') {

				System.out.println("Custon Fee:");
				Double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			}
			
			else if (ch == 'u') {
				     System.out.println("Manufature Date (DD/MM/AAAA)");
				     Date date = dateformat.parse(sc.next());
				     list.add(new UsedProduct(name, price, date));
				 }    
				     else {
				    	 list.add(new product(name, price));}
		}	
			
		for (product p : list) {
			
			System.out.print(p.priceTag());
		}
				
		sc.close();	
		
	}

}
