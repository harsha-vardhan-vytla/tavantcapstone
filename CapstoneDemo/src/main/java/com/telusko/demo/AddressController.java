package com.telusko.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AddressController {

	@Autowired
	AddressRepo repo;
	
	@RequestMapping("/")
	public String home() {
		   return "home";
	}
	
	@RequestMapping("/addAddress")
	public String addAddress(Address address) {
		
		repo.save(address);
		return "home";
	}

	@RequestMapping("/getAddress")
	public ModelAndView getAddress(@RequestParam("eid") int id) {
		
		ModelAndView mv = new ModelAndView("search");
		
		Address address = repo.findById(id).orElse(null);
		
		System.out.println(address);
		
		mv.addObject(address);
		return mv;
	}

	@RequestMapping("/get2Address")
	public ModelAndView get2Address(@RequestParam String sadd) {
		
		ModelAndView mv = new ModelAndView("searchtwo");
		
		//Address address = repo.findById(id).orElse(null);
		List<Address> address = repo.findByTwo(sadd);
		
		System.out.println("hai all");
		System.out.println(address);
		
		//mv.addObject(address);
		return mv;
	}

//


}
