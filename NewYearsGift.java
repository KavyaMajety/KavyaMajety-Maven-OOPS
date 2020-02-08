package epamHT.HomeTask2;

import java.util.Scanner;
import java.util.*;

public class NewYearsGift {

	public static void main(String[] args) {
		int quantity = 0, total_candies = 0;
        char n1;
        Sweets collect;
        Boolean n = true;
        float price, weight = 0,totalbox_wt = 0, total_weight = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Fill the New Year Gift Box!!");
        Map< String, Float> hm =  new HashMap< String, Float>();
        while(n) {
        	System.out.println("AVAILABLE Candies");
        	System.out.println("1. Dark Chocolate");
        	System.out.println("2. Milk Chocolate");
        	System.out.println("3. White Chocolate");
        	System.out.println("4. FiveStar");
        	System.out.println("5. Bournville");
        	System.out.println("6. Rasmalai");
        	System.out.println("7. Gulab Jamun");
        	System.out.println("Choose an option 1-7");
        	try {
        	
        		switch(sc.next().charAt(0))
        		{
        		case '1':
        			System.out.println("please enter the quantity");
        			quantity = sc.nextInt();
        			System.out.println("please enter the weight in grams");
        			weight = sc.nextInt();
        			System.out.println("Enter price");
        			price = sc.nextInt();
        			collect = new DarkChocolate(quantity, weight, price);
        			total_weight = collect.calculateWeight(weight, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			System.out.println("The total weight of Darkchocolate is:" +total_weight+ "grams");
        			System.out.println("The total weight of gift box is:" +totalbox_wt+ "grams");
        			total_candies += quantity;
        			hm.put("Dark Chocolate", price);
        			System.out.println("Do you want any other item (y/n)");
        			n1 = sc.next().charAt(0);
        			if(n1 == 'y'|| n1 == 'Y') { 
        	    	  n = true;
        	          break;
        	        }
        			else
        		    	{
        				n = false;
        				System.out.println("Total weight of gift box is:" +totalbox_wt+ "grams");
        				System.out.println("Total number of candies in the giftbox is:" +total_candies);
        				break;
        		    	}
        		case '2':
        			System.out.println("please enter the quantity");
        			quantity = sc.nextInt();
        			System.out.println("please enter the weight in grams");
        			weight = sc.nextInt();
        			System.out.println("Enter price");
        			price = sc.nextInt();
        			collect = new MilkChocolate(quantity, weight, price);
        			total_weight = collect.calculateWeight(weight, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			total_candies += quantity;
        			hm.put("Milk Chocolate", price);
        			System.out.println("The total weight of Milkchocolate is:" +total_weight+ "grams");
        			System.out.println("The total weight of gift box is:" +totalbox_wt+ "grams");
        			System.out.println("Do you want any other item (y/n)");
        			n1 = sc.next().charAt(0);
        			if(n1 == 'y'|| n1 == 'Y')
        	        	{ 
        				n = true;
        				break; 
        	        	}
        			else {
        				n = false;
        				System.out.println("The total gift box weight is:" +totalbox_wt+ "grams");
        				System.out.println("The total number of candies in the giftbox is:" +total_candies);
        				break;
        	        }
        		case '3':
        			System.out.println("Please enter the quantity");
        			quantity = sc.nextInt();
        			System.out.println("Please enter the weight in grams");
        			weight = sc.nextInt();
        			System.out.println("Please enter the price");
        			price = sc.nextInt();
        			collect = new WhiteChocolate(quantity, weight, price);
        			total_weight = collect.calculateWeight(weight, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			total_candies += quantity;
        			hm.put("White Chocolate", price);

        			System.out.println("total weight of whitechocolate is:" +total_weight+ "grams");
        			System.out.println("Total weight of gift box is:" +totalbox_wt+ "grams");
        			System.out.println("do you want any other item (y/n)");
        			n1 = sc.next().charAt(0);
        			if(n1 == 'y'|| n1 == 'Y')	{
        				n = true;
        				break;
        			}
        			else {
        				n = false;
        				System.out.println("Total weight of gift box is:" +totalbox_wt+ "grams");
        				System.out.println("Total number of candies in the giftbox is:" +total_candies);
        				break;
        			}
        		case '4':
        			System.out.println("please enter the quantity");
        			quantity = sc.nextInt();
        			System.out.println("please enter the weight in grams");
        			weight = sc.nextInt();
        			System.out.println("Enter price");
        			price = sc.nextInt();
        			collect = new FiveStar(quantity, weight, price);
        			total_weight = collect.calculateWeight(weight, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			total_candies = total_candies + quantity;
        			hm.put("Five Star", price);

        			System.out.println("The total weight of Candies is:" +total_weight+ "grams");
        			System.out.println("The total weight of gift box is:" +totalbox_wt+ "grams");
        			System.out.println("Do you want any other item (y/n)");
        			n1 = sc.next().charAt(0);
        			if(n1 == 'y'|| n1 == 'Y') {
        				n = true;
        				break;
        				}
        			else { 
        				n = false;
        				System.out.println("Total weight of gift box is:" +totalbox_wt+ "grams");
        				System.out.println("Total number of candies in the giftbox is:" +total_candies);
        				break;
        			}
        	   case '5':
        		   System.out.println("Please enter the quantity");
        		   quantity = sc.nextInt();
        		   System.out.println("Please enter the weight in grams");
        		   weight = sc.nextInt();
        		   System.out.println("Enter price");
        		   price = sc.nextInt();
        		   collect = new Bournville(quantity, weight, price);
        		   total_weight = collect.calculateWeight(weight, quantity);
        		   totalbox_wt = totalbox_wt + total_weight;
        		   total_candies += quantity;
        		   hm.put("Bournville", price);

        		   System.out.println("The total weight of Gulabjamun is:" +total_weight+ "grams");
        		   System.out.println("The total weight of gift box is:" +totalbox_wt+ "grams");
        		   System.out.println("Do you want any other item (y/n)");
        		   n1 = sc.next().charAt(0);
        		   if(n1 == 'y'|| n1 == 'Y') {
        			   n = true;
        			   break;
        			   }
        		   else {
        			   n = false;
        			   System.out.println("The total weight of gift box is:" +totalbox_wt+ "grams");
        			   System.out.println("The total number of candies in the giftbox is:" +total_candies);
        			   break;
        		   }
        	   case '6':
        		   System.out.println("Please enter the quantity");
        		   quantity = sc.nextInt();
        		   System.out.println("Please enter the weight in grams");
        		   weight = sc.nextInt();
        		   System.out.println("Please enter the price");
        		   price = sc.nextInt();
        		   collect = new Rasmalai(quantity, weight, price);
        		   total_weight = collect.calculateWeight(weight, quantity);
        		   totalbox_wt = totalbox_wt + total_weight;
        		   total_candies += quantity;
        		   hm.put("Rasmalai", price);

        		   System.out.println("The total weight of Rasmalai is:" +total_weight+ "grams");
        		   System.out.println("The total weight of gift box is:" +totalbox_wt+ "grams");
        		   System.out.println("Do you want to add any other item (y/n)");
        		   n1 = sc.next().charAt(0);
        		   if(n1 == 'y'|| n1 == 'Y') {
        			   n = true;
        			   break;
        		   }
        		   else {
        			   n = false;
        			   System.out.println("Total weight of gift box is:" +totalbox_wt+ "grams");
        			   System.out.println("Total number of candies in the giftbox is:" +total_candies);
        			   break;
        		   	}
        	   case '7':
        		   System.out.println("Please enter the quantity");
        		   quantity = sc.nextInt();
        		   System.out.println("Please enter the weight in grams");
        		   weight = sc.nextInt();
        		   System.out.println("Please enter the price");
        		   price = sc.nextInt();
        		   collect = new GulabJamun(quantity, weight, price);
        		   total_weight = collect.calculateWeight(weight, quantity);
        		   totalbox_wt = totalbox_wt + total_weight;
        		   total_candies += quantity;
        		   hm.put("Gulab Jamun", price);

        		   System.out.println("The total weight of Gulab Jamun is:" +total_weight+ "grams");
        		   System.out.println("The total weight of gift box is:" +totalbox_wt+ "grams");
        		   System.out.println("Do you want to add any other item (y/n)");
        		   n1 = sc.next().charAt(0);
        		   if(n1 == 'y'|| n1 == 'Y') {
        			   n = true;
        			   break;
        		   }
        		   else {
        			   n = false;
        			   System.out.println("Total weight of gift box is:" +totalbox_wt+ "grams");
        			   System.out.println("Total number of candies in the giftbox is:" +total_candies);
        			   break;
        		   	}
        }}
        catch(Exception e)
        {
        	System.out.println("please select from 1-6 options");
            
        
        
    }}
        System.out.println("The following candies are present in the Gift Box!!");
        Set< Map.Entry< String, Float> > st = hm.entrySet(); 
        for (Map.Entry< String, Float> me: st) 
        { 
            System.out.print("Name of Chocolate: " +me.getKey()+", "); 
            System.out.println(" Price: " +me.getValue()); 
        }
        sc.close();
	}
}
