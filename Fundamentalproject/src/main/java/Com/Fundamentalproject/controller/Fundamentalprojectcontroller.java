package Com.Fundamentalproject.controller;

import java.util.ArrayList;
import java.util.Scanner;

import Com.Fundamentalproject.entity.Fundamentalprojectuser;
import Com.Fundamentalproject.entity.Viewprofileuser;
import Com.Fundamentalproject.service.Fundamentalprojectservice;
import Com.Fundamentalproject.service.fundamentalprojectserviceInterface;

public class Fundamentalprojectcontroller implements FundamentalprojectcontrollerInterrfce {
	

	

	public void viewprofilecontroller() {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter your email");
		String email=sc.next();
		
		Fundamentalprojectuser fu=new Fundamentalprojectuser();
		fu.setEmail(email);
		fundamentalprojectserviceInterface fs=new Fundamentalprojectservice();
		Fundamentalprojectuser i=fs.viewprofileservice(fu);
		
		if(i!=null) {
			System.out.println("Your name is "+i.getName());
			System.out.println("Your password is "+i.getPassword());
			System.out.println("Your email is "+i.getEmail());
			System.out.println("Your address is "+i.getAddress());
		}
		
	}

	public void deleteprofilecontroller() 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter your delete email");
		String email=sc.next();
		
		Fundamentalprojectuser fu=new Fundamentalprojectuser();
		fu.setEmail(email);
		
		fundamentalprojectserviceInterface fs=new Fundamentalprojectservice();
		int i=fs.deleteprofileservice(fu);
		
		if(i>0)
		{
			System.out.println("your email is deleted");
		}
		else
		{
			System.out.println("your email could not be deleted");
		}
		
		
	}

	public void viewallprofilecontroller() {
		fundamentalprojectserviceInterface fs=new Fundamentalprojectservice();
		ArrayList<Fundamentalprojectuser> ll=fs.viewallprofileservice();
		
		System.out.println(ll.size()+  "record found in the database");
		for(Fundamentalprojectuser k:ll)
		{
			System.out.println("******************");
			System.out.println("name is "   +k.getName());
			System.out.println("password is "  +k.getPassword());
			System.out.println("email is "  +k.getEmail());
			System.out.println("address is "   +k.getAddress());
			
		}
		
	}

	public void searchprofilecontroller() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		Fundamentalprojectuser fu=new Fundamentalprojectuser();
		fu.setName(name);
		
		fundamentalprojectserviceInterface fs=new Fundamentalprojectservice();
		ArrayList<Fundamentalprojectuser> ll=fs.searchprofileservice(fu);
		for(Fundamentalprojectuser k:ll)
		{
			System.out.println("******************");
			System.out.println("name is "   +k.getName());
			System.out.println("password is "  +k.getPassword());
			System.out.println("email is "  +k.getEmail());
			System.out.println("address is "   +k.getAddress());		
		
	    }

}
	public void editprofilecontroller() {
		System.out.println("Your Older Data");
		viewprofilecontroller();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter new Name: ");
		String name = sc.next();
		
		System.out.println("Enter new Password: ");
		String password = sc.next();
		
		System.out.println("Enter new Email: ");
		String email = sc.next();
		
		System.out.println("Enter new Address: ");
		String address = sc.next();
		
		
		Fundamentalprojectuser fu = new Fundamentalprojectuser();
		fundamentalprojectserviceInterface fs=new Fundamentalprojectservice();
		//Fundamentalprojectuser i=fs.editprofileservice(fu);
		fu.setName(name);
		fu.setPassword(password);
		fu.setEmail(email);
		fu.setAddress(address);
		
		int i = fs.editProfileService(fu);
		
		if(i>0) {
			System.out.println("Your Profile is edited "+name);
		}
		
		else {
			System.out.println("Sorry..... Your Profile is not edited");
		}
		
		
		
		
	}

	public int signUp() {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter address");
		String address = sc.next();
		
		
		fundamentalprojectserviceInterface fs=new Fundamentalprojectservice();
		
		
		Fundamentalprojectuser fu=new  Fundamentalprojectuser();
		
		
		fu.setName(name);
		fu.setPassword(password);
		fu.setEmail(email);
		fu.setAddress(address);
		
		
		i = fs.signUp(fu);
		
		if(i>0) {
			System.out.println("Profile Created");
		}
		else {
			System.out.println("oops! something went wrong");
		}
		return i;
	}

	
		
	public int signIn() {
		Scanner sc=new Scanner(System.in);
		int v = 2;
		System.out.println("Enter email");
		String email1= sc.next();
		
		System.out.println("Enter password");
		String password1 = sc.next();
		
		Fundamentalprojectuser fu=new Fundamentalprojectuser();
		
		fu.setEmail(email1);
		fu.setPassword(password1);
		Fundamentalprojectservice fs=new Fundamentalprojectservice();
		
		Fundamentalprojectuser s1=fs.validation(fu);
		if(s1!=null) {
		if((s1.getPassword().equals(fu.getPassword())) && (s1.getEmail().equals(fu.getEmail()))) {
			v=1;
		
		}
		}
		else {
			System.out.println("record not found for email "+email1);
		}
		return v;
	}
	}

