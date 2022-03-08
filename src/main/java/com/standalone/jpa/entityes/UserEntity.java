package com.standalone.jpa.entityes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_details")
public class UserEntity {
	
	@Id
	Long userId ;
	String userName ;
	String userAddress ;
	double userAge ;
	Long userPhone ;
	

}
