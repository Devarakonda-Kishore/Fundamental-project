package Com.Fundamentalproject.service;

import java.util.ArrayList;

import Com.Fundamentalproject.entity.Fundamentalprojectuser;

public interface fundamentalprojectserviceInterface {

	

	Fundamentalprojectuser viewprofileservice(Fundamentalprojectuser fu);

	int deleteprofileservice(Fundamentalprojectuser fu);

	ArrayList<Fundamentalprojectuser> viewallprofileservice();

	ArrayList<Fundamentalprojectuser> searchprofileservice(Fundamentalprojectuser fu);

	int editProfileService(Fundamentalprojectuser fu);

	int signUp(Fundamentalprojectuser fu);

}
