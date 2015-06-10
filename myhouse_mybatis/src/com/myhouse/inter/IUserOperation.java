package com.myhouse.inter;

import com.myhouse.entity.User;

public interface IUserOperation {
	public User selUserByName(String name);
	public boolean selUserIsTrue(String name);
	public int addUser(User us);
}
