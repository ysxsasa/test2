package com.sanyang.dao;

import java.util.List;



import com.sanyang.vo.Userss;

public interface UserDao {

	public List<Userss> querysel() ;
		
	public void queryins(Userss us) ;
		
	
	public Userss querynapwd(Userss us ) ;
		
	
	
}
