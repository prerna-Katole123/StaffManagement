
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Staff;
import com.example.demo.Service.StaffService;

@RestController
public class StaffController {
	@Autowired
	StaffService ss;
	
	@PostMapping("add Staff")
	
	
	public String addStaff(@RequestBody Staff s) {
		ss.SaveStaff(s);
		return "staff added";
	}
	
	

}
