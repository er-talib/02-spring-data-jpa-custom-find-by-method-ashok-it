package com.custom.finder.method.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.custom.finder.method.jpa.entityes.UserEntity;

@Repository
public interface UserDAO extends CrudRepository<UserEntity, Long> {

//1	    public List<UserEntity> findTop3ByUserAge(double age);
//2 	public List<UserEntity> findByUserNameStartingWith(String name);
//3	    public List<UserEntity> findByUserAddressEndingWith(String address);
//4	    public List<UserEntity> findByUserAgeBetween(double startAge , double endAge);
//5	    public List<UserEntity> findByUserNameOrUserPhoneAndUserId(String name , long number , long id);
//5	    public List<UserEntity> findByUserNameAndUserPhoneAndUserId(String name , long number , long id);
//5	     public List<UserEntity> findByUserNameAndUserIdOrUserPhone(String name , long number , long id);
//6	     public List<UserEntity> findAllByOrderByUserName();
//6         public List<UserEntity> findAllByOrderByUserNameDesc();
	
	@Query("select userName from UserEntity")
	public List<String> UserName(); // no restriction of method name we can chose any name of method
    

	       


	
	
	
}
