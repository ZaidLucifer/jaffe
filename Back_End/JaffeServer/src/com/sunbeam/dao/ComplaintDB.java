package com.sunbeam.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunbeam.pojo.Complaints;
import com.sunbeam.utility.CryptoUtility;

@Repository
public class ComplaintDB {
	
	@Autowired
	private SessionFactory factory;
	
	public boolean registerComplaint(Object complaint){
		boolean result;
		LinkedHashMap<String, String> i = (LinkedHashMap<String, String>) complaint;
		System.out.println(i.get("address")+" "+Integer.parseInt(i.get("pincode"))+" "+i.get("complaintText")+" "+i.get("id"));
		NativeQuery<Object> q = factory.getCurrentSession().getNamedNativeQuery("qry_StoProcPostComplaints");
		try {
			q.setParameter("id", i.get("id"));
			q.setParameter("address", i.get("address"));
			q.setParameter("pincode", i.get("pincode"));
			q.setParameter("complaintText", i.get("complaintText"));
			List<Object> list = q.getResultList();
			if(list.size() > 0){
				System.out.println("In the true statement");
				for (Object obj : list) {
					System.out.println("Regsitered in : " + obj.toString());
				}
				result = true;
			}
			else{
				System.out.println("Inside False");
				result = false;
			}
		}
		catch (Exception e) {
			System.out.println("Inside Exception");
			result = false;
		}
				
		return result;
	}
	
	public ArrayList<Complaints> getComplaint(Object user){
		ArrayList<Complaints>  list = null;
		LinkedHashMap<String, String> i = (LinkedHashMap<String, String>) user;
		System.out.println(i.get("userId"));
		NativeQuery<Complaints> q = factory.getCurrentSession().getNamedNativeQuery("qry_StoProcGetComplaints");
		try {
			q.setParameter("userId", i.get("userId"));
			list = (ArrayList<Complaints>) q.getResultList();
			if(list.size() > 0){
				System.out.println("In the true statement");
				for (Object obj : list) {
					System.out.println("Regsitered in : " + obj.toString());
				}
			}
			else{
				System.out.println("Inside False");
			}
		}
		catch (Exception e) {
			System.out.println("Inside Exception");
		}
		return list;
	}

	public int updateStatus(Object user){
		boolean result = false;
		System.out.println("Complaint Id : "+user.toString());
		LinkedHashMap<String, String																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													> i = (LinkedHashMap<String, String>) user;
		System.out.println(i.get("complaintId"));
		NativeQuery<Object> q = factory.getCurrentSession().getNamedNativeQuery("qry_StoProcUpdateStatus");
		try {
			q.setParameter("id", Integer.parseInt(i.get("complaintId")));
			return q.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inside Exception");
			return 0;
		}
	}
	
	public boolean updateDepartment(Object user){
		boolean result = false;
		LinkedHashMap<String, String> i = (LinkedHashMap<String, String>) user;
		System.out.println(Integer.parseInt(i.get("complaintId")));
		int complaintId = Integer.parseInt(i.get("complaintId"));
		NativeQuery<Complaints> q = factory.getCurrentSession().getNamedNativeQuery("qry_StoProcUpdateDepartment");
		try {
			q.setParameter("id", complaintId);
			int output = q.executeUpdate();
			if(output > 0 )
				result = true;
		}
		catch (Exception e) {
			System.out.println("Inside Exception");
		}
		return result;
	}
	
}
