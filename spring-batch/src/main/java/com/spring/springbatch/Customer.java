package com.spring.springbatch;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
	 @Id
	  private int id;
	  private String first_name;
	  private String last_name;
	  private String email;
	  private String gender;

}
