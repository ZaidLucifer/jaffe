package com.sunbeam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.dao.ComplaintDB;
import com.sunbeam.pojo.Complaints;

@Service
public class ComplaintService {
	
	@Autowired
	private ComplaintDB complain;
	
	@Transactional
	public boolean registerComplaint(Object complaint){
		this.complain.registerComplaint(complaint);
		return true;
	}
	
	@Transactional
	public ArrayList<Complaints> getComplaint(Object user){
		
		return this.complain.getComplaint(user);
	}
	
	@Transactional
	public int updateStatus(Object user){
		
		return this.complain.updateStatus(user);
	}
	
	@Transactional
	public boolean updateDepartment(Object user){
		
		return this.complain.updateDepartment(user);
	}
}
