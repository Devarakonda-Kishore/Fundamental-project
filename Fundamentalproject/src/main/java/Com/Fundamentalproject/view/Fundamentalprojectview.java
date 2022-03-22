package Com.Fundamentalproject.view;

import java.util.Scanner;

import Com.Fundamentalproject.controller.Fundamentalprojectcontroller;
import Com.Fundamentalproject.controller.FundamentalprojectcontrollerInterrfce;

public class Fundamentalprojectview {
	static int ch;
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
	FundamentalprojectcontrollerInterrfce fc=new Fundamentalprojectcontroller();
		String s="y";
		int s1;

		while(s.equals("y"))
		{
		FundamentalprojectcontrollerInterrfce fp=new Fundamentalprojectcontroller();
		System.out.println("****************************");
		System.out.println("                            ");
		System.out.println("signin or signup to reach the website");
		System.out.println("                             ");
		System.out.println("****************************");
		System.out.println("press 1 to signUp");
		System.out.println("press 2 to signIn");
		System.out.println("enter your choice");
		ch = sc.nextInt();
	   switch(ch) {
		case 1: fc.signUp();
				break;
		case 2: s1 = fc.signIn();
				if(s1==1) {
					while(s.equals("y")) {
						
						System.out.println("                         ******Main Menu*******");
						System.out.println("                         press 1 to view  profile");
						System.out.println("                         press 2 to delete  profile");
						System.out.println("                         press 3 to viewall profile");
						System.out.println("                         press 4 to search profile");
						System.out.println("                         press 5 to edit timeline");
		
						
						System.out.println("enter your choice");
						
						ch = sc.nextInt();
						
		
		
		           switch(ch)
		           {
		              case 1:
		               {
			             fp.viewprofilecontroller();
			             break;
		               }
		              case 2:
		               {
			            fp.deleteprofilecontroller();
			            break;
		               }
		              case 3:
		               {
			            fp.viewallprofilecontroller();
			            break;
		               }
		              case 4:
		               {
			            fp.searchprofilecontroller();
			            break;
		               }
		              case 5:
		               {
			           fp.editprofilecontroller();
			           break;
		               }
		           }
	               System.out.println("do you want to continue y/n");
	               s=sc.next();
		           }
				}
	          else
	          {
		          System.out.println("Opps! enter correct password or if you are not registered.. please press 1 to sigh-up");
	          }
	          break;
	          }
  System.out.println("press y/n to continue");
  s=sc.next();
	         
	}
			

}
}

