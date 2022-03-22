package Com.Fundamentalproject.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Com.Fundamentalproject.entity.Fundamentalprojectuser;

public class FundamentalprojectDAO implements FundamentalprojectDAOInterface {

	//private static final String DriveManager = null;

	
	public Fundamentalprojectuser viewprofileDAO(Fundamentalprojectuser fu) {
		Fundamentalprojectuser Z2=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","kishore");
			PreparedStatement pe=con.prepareStatement("select * from fundamentalproject where email=?");
			pe.setString(1,fu.getEmail());
			
			ResultSet res=pe.executeQuery();
			
			if(res.next())
			{
				String n=res.getString(1);
				String e=res.getString(2);
				String p=res.getString(3);
				String a=res.getString(4);
				
				
				Z2=new Fundamentalprojectuser();
				Z2.setName(n);
				Z2.setPassword(e);
				Z2.setEmail(p);
				Z2.setAddress(a);
				
				
				
				
				
			}
			}
		catch(Exception e) {
			e.printStackTrace();
		
	}
		return Z2;	


	}

	public int deleteprofileDAO(Fundamentalprojectuser fu) {
		int i=0;
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","kishore");
		PreparedStatement pe=con.prepareStatement("delete from fundamentalproject where email=?");
		pe.setString(1,fu.getEmail());
		i=pe.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}

	public ArrayList<Fundamentalprojectuser> viewallprofileDAO() {
		Fundamentalprojectuser Z2=null;
		ArrayList<Fundamentalprojectuser> ll=new ArrayList<Fundamentalprojectuser>();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","kishore");
			PreparedStatement pe=con.prepareStatement("select * from fundamentalproject");
			
			
			ResultSet res=pe.executeQuery();
			
			if(res.next())
			{
				String n=res.getString(1);
				String e=res.getString(2);
				String p=res.getString(3);
				String a=res.getString(4);
				
				
				Z2=new Fundamentalprojectuser();
				Z2.setName(n);
				Z2.setPassword(e);
				Z2.setEmail(p);
				Z2.setAddress(a);
				
				
				ll.add(Z2);
				
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
		return ll;	


	
	}

	public ArrayList<Fundamentalprojectuser> searchprofileDAO(Fundamentalprojectuser fu) {
		
	Fundamentalprojectuser Z2=null;
	ArrayList<Fundamentalprojectuser> ll=new ArrayList<Fundamentalprojectuser>();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","kishore");
			PreparedStatement pe=con.prepareStatement("select * from fundamentalproject where name=?");
			pe.setString(1,fu.getName());
			
			ResultSet res=pe.executeQuery();
			
			while(res.next())
			{
				String n=res.getString(1);
				String e=res.getString(2);
				String p=res.getString(3);
				String a=res.getString(4);
				
				
				Z2=new Fundamentalprojectuser();
				Z2.setName(n);
				Z2.setPassword(e);
				Z2.setEmail(p);
				Z2.setAddress(a);
				
				ll.add(Z2);
			}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
	}

	public int editprofileDAO(Fundamentalprojectuser fu) {
    int i = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","kishore");
			PreparedStatement pe =con.prepareStatement("update Fundamentalproject set name=?, password=?, address=? where email=?");
			pe.setString(1, fu.getName());
			pe.setString(2, fu.getPassword());
			pe.setString(4, fu.getEmail());
			pe.setString(3, fu.getAddress());
			
			i = pe.executeUpdate();
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	
	}

	public int signUp(Fundamentalprojectuser fu){
		PreparedStatement pe=null;
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","kishore");
			pe=con.prepareStatement("insert into fundamentalproject values(?,?,?,?)");
			
			pe.setString(1, fu.getName());
			pe.setString(2, fu.getPassword());
			pe.setString(3, fu.getEmail());
			pe.setString(4, fu.getAddress());
			
			
			i=pe.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(pe!=null) {
					try {
						pe.close();}
				catch (SQLException e) {
					e.printStackTrace();}
				}
			}
		return i;
	}

	public Fundamentalprojectuser validation(Fundamentalprojectuser fu) {
		Fundamentalprojectuser data = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","kishore");
			PreparedStatement ps = con.prepareStatement("select * from fundamentalproject where email=? and password=?");
			
			ps.setString(1, fu.getEmail());
			ps.setString(2, fu.getPassword());
			
			ResultSet s1 =ps.executeQuery();
			if(s1.next()){
				
				String e=s1.getString(3);
				String p=s1.getString(2);
				
				
				
				data=new Fundamentalprojectuser();
				
				data.setPassword(p);
				data.setEmail(e);
				
			}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	
	}

}
