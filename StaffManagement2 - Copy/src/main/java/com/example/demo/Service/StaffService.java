package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Staff;
import com.example.demo.Repo.StaffRepo;

@Service


public class StaffService {
	@Autowired
	StaffRepo sr;
	public void SaveStaff(Staff s)
	{
		sr.save(s);
		
	}

}
