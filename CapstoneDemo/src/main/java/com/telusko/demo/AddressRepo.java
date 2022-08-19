package com.telusko.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface AddressRepo extends CrudRepository<Address,Integer>{

	@Query("from Address where add like %?1%")
	List<Address> findByTwo(String s);
	
	
}
