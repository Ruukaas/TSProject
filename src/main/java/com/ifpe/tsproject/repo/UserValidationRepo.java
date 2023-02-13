package com.ifpe.tsproject.repo;

import com.ifpe.tsproject.modelo.UserValidation;
import java.util.ArrayList;
import java.util.List;


public class UserValidationRepo {

	private List<UserValidation> user;

	public UserValidationRepo() {
		this.user = new ArrayList<>();
	}

	public void addUserValidation(UserValidation u) {

		this.user.add(u);
		
	}

}