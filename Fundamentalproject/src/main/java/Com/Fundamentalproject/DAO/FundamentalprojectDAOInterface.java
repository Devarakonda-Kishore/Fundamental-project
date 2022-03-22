package Com.Fundamentalproject.DAO;

import java.util.ArrayList;

import Com.Fundamentalproject.entity.Fundamentalprojectuser;

public interface FundamentalprojectDAOInterface {

	

	Fundamentalprojectuser viewprofileDAO(Fundamentalprojectuser fu);

	int deleteprofileDAO(Fundamentalprojectuser fu);

	ArrayList<Fundamentalprojectuser> viewallprofileDAO();

	ArrayList<Fundamentalprojectuser> searchprofileDAO(Fundamentalprojectuser fu);

	int editprofileDAO(Fundamentalprojectuser fu);

	int signUp(Fundamentalprojectuser fu);



}
