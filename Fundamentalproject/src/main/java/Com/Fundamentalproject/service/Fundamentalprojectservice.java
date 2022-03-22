package Com.Fundamentalproject.service;

import java.util.ArrayList;

import Com.Fundamentalproject.DAO.FundamentalprojectDAO;
import Com.Fundamentalproject.DAO.FundamentalprojectDAOInterface;
import Com.Fundamentalproject.entity.Fundamentalprojectuser;

public class Fundamentalprojectservice implements fundamentalprojectserviceInterface {

	
	public Fundamentalprojectuser viewprofileservice(Fundamentalprojectuser fu) {
		
		FundamentalprojectDAOInterface fd=new FundamentalprojectDAO();
		Fundamentalprojectuser i=fd.viewprofileDAO(fu);
		
		return i;
	}

	public int deleteprofileservice(Fundamentalprojectuser fu)
	{
		FundamentalprojectDAOInterface fd=new FundamentalprojectDAO();
		int i=fd.deleteprofileDAO(fu);
		return i;
	}

	public ArrayList<Fundamentalprojectuser> viewallprofileservice() {
		FundamentalprojectDAOInterface fd=new FundamentalprojectDAO();
		ArrayList<Fundamentalprojectuser> g=fd.viewallprofileDAO();
		
		return g;
	}

	public ArrayList<Fundamentalprojectuser> searchprofileservice(Fundamentalprojectuser fu) {
		FundamentalprojectDAOInterface fd=new FundamentalprojectDAO();
		ArrayList<Fundamentalprojectuser> g=fd.searchprofileDAO(fu);
		return g;
	}

	public int editProfileService(Fundamentalprojectuser fu) {
		FundamentalprojectDAOInterface fd=new FundamentalprojectDAO();
		int i=fd.editprofileDAO(fu);
		return i;
	}

	public int signUp(Fundamentalprojectuser fu) {
		FundamentalprojectDAOInterface fd=new FundamentalprojectDAO();
		int i = fd.signUp(fu);
		return i;
	}

	public Fundamentalprojectuser validation(Fundamentalprojectuser fu) {
	   FundamentalprojectDAO fd= new FundamentalprojectDAO();
		Fundamentalprojectuser k=fd.validation(fu);
		return k;
	}

}
