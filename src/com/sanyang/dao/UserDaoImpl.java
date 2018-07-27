package com.sanyang.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.mapper.Usermapper;
import com.sanyang.vo.Userss;

@Repository("dao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private Usermapper usermapper;
	
	
	@Override
	public List<Userss> querysel() {
		List<Userss> querysel = usermapper.querysel();
		return querysel;
	}

	@Override
	public void queryins(Userss us) {
		usermapper.queryins(us);
		
	}

	@Override
	public Userss querynapwd(Userss us) {
		Userss querynapwd = usermapper.querynapwd(us);
		return querynapwd;
	}

}
