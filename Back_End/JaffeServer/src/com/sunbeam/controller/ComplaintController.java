package com.sunbeam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.pojo.Complaints;
import com.sunbeam.service.ComplaintService;

@CrossOrigin
@RestController
@RequestMapping("complaint")
public class ComplaintController {
	
	@Autowired
	private ComplaintService service;
	
	@PostMapping("/registerComplaint")
	public boolean registerComplaint(@RequestBody Object complaint){
		System.out.println(complaint.toString());
		this.service.registerComplaint(complaint);
		return true;
	}
	
	@PostMapping("/getComplaints")
	public ArrayList<Complaints> getComplaint(@RequestBody Object user){
		ArrayList<Complaints> obj = this.service.getComplaint(user);
		System.out.println(obj.getClass().getSimpleName());
		for (Object complaints : obj) {
			System.out.println(complaints.getClass().getSimpleName());
		}
		return obj;
	}
	
	@PostMapping("/updateStatus")
	public boolean updateStatus(@RequestBody Object user){
		int result = this.service.updateStatus(user);
		if(result > 0)
			return true;
		return false;
	}
	
	@PostMapping("/updateDepartment")
	public boolean updateDepartment(@RequestBody Object user){
		return this.service.updateDepartment(user);
	}
}
