package com.sanyang.mapper;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.sanyang.vo.Userss;
@RequestMapping
public interface Usermapper {

	
	public List<Userss> querysel() ;
	
	public void queryins(Userss us) ;
	
	public Userss querynapwd(Userss us ) ;
	
}
