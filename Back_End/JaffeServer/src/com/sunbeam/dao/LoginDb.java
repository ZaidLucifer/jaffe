package com.sunbeam.dao;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.CryptoPrimitive;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sunbeam.pojo.Login;
import com.sunbeam.pojo.NGO;
import com.sunbeam.pojo.Police;
import com.sunbeam.pojo.Users;
import com.sunbeam.utility.CryptoUtility;
import com.sunbeam.utility.MailUtility;

@Repository
public class LoginDb
{
	@Autowired
	private SessionFactory factory;
	
	/*public Login checkLogin(String email,String password)
	{
		String hql = "select u from Login u where u.email= '"+email+"' and u.password='"+password+"' and u.status='y'";
		Session session = factory.getCurrentSession();
		Query q = session.createQuery(hql);
		Login login = (Login) q.getSingleResult();
		Login user = new Login();
		user.setName(login.getName());
		user.setApplication_id(login.getApplication_id());
		user.setEmail(user.getEmail());
		user.setStatus(login.getStatus());
		user.setVisa_service(login.getVisa_service());
		return user;
	}*/
	
	public Object authenticateUser(String email, String password){
		boolean result;
		Object userDetails = null;
		try {
		System.out.println("Email : " + email + " Password : " + CryptoUtility.Sha256(password));
		NativeQuery<Login> q = factory.getCurrentSession().getNamedNativeQuery("qry_StoProcLogin");

			q.setParameter("mailId",email);
			q.setParameter("password", CryptoUtility.Sha256(password));
			
			System.out.println("In here");
			List<Login> i = q.getResultList();
			if(i.size() > 0) {
				for (Login login : i) {
					userDetails = login;
					System.out.println("Logged in : " + login.getRole());
				}
				result = true;
			}
			else{
				System.out.println("False");
				result = false;
			}
		} catch (Exception e) {
			System.out.println("In Exception");
			result = false;
		}		
		return userDetails;
	}

	public boolean registerUser(Object user)
	{
		int output = 0;
		LinkedHashMap<String, String> i = (LinkedHashMap<String, String>) user;
		System.out.println(" "+ i.get("mailId") + " " + i.get("password") + " " + i.get("name") + " " + i.get("aadharNo")+" "+i.get("contactNo")+" "+i.get("address"));
		boolean result;
		NativeQuery<Object> q = factory.getCurrentSession().getNamedNativeQuery("qry_StoProcRegisterUser");
		
		try {
			q.setParameter("password", CryptoUtility.Sha256(i.get("password")));
			q.setParameter("mailId", i.get("mailId"));
			q.setParameter("aadharNo", i.get("aadharNo"));
			q.setParameter("contactNo", i.get("contactNo"));
			q.setParameter("address", i.get("address"));
			q.setParameter("output", i.get("output"));
			q.setParameter("name", i.get("name"));
			List<Object> list = q.getResultList();
			for (Object obj : list) {
				System.out.println("Registered in : " + obj.getClass().getSimpleName());
			}
			MailUtility.send("zszaidshaikh@gmail.com", "nisyiwtxhflfnpkg", i.get("mailId"));
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inside Exception");
			result = false;
		}		
		return result;
		/*DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date dob = new Date();
		try {
			dob = df.parse(i.get("dob"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date(dob.getTime());
		System.out.println("Date : " + dob + "SQL Date : " + sqlDate);*/
		/*NativeQuery<RegisterUsers> q = factory.getCurrentSession().getNamedNativeQuery("qry_StoProcRegisterUser");
		q.setParameter("name", i.get("name"));
		q.setParameter("mailId", i.get("mailId"));
		q.setParameter("password", i.get("password"));
		q.setParameter("aadharNo", i.get("aadharNo"));
		q.setParameter("contactNo", i.get("contactNo"));
		q.setParameter("address", i.get("address"));
		q.setParameter("dob", i.get("dob"));
		q.setParameter("output", output);
		List<RegisterUsers> j = q.getResultList();
		System.out.println("Output is "+output);
		System.out.println("List is" + j.getClass().getSimpleName());*/
	}
	
	public boolean registerNGO(Object ngo){
		LinkedHashMap<String, String> i = (LinkedHashMap<String, String>) ngo;
		System.out.println(" "+ i.get("mailId") + " " + i.get("password") + " " + i.get("name") + " " + i.get("certificateNo")+" "+i.get("contactNo")+" "+ i.get("pincode"));
		boolean result;
		NativeQuery<Object> q = factory.getCurrentSession().getNamedNativeQuery("qry_StoProcRegisterNGO");
		
		try {
			q.setParameter("password", CryptoUtility.Sha256(i.get("password")));
			q.setParameter("mailId", i.get("mailId"));
			q.setParameter("CertificateId", i.get("certificateNo"));
			q.setParameter("contactNo", i.get("contactNo"));
			q.setParameter("pincode", i.get("pincode"));
			q.setParameter("name", i.get("name"));
			List<Object> list = q.getResultList();
			for (Object obj : list) {
				System.out.println("Regsitered in : " + obj.toString());
			}
			MailUtility.send("zszaidshaikh@gmail.com", "nisyiwtxhflfnpkg", i.get("mailId"));
			result = true;
		} catch (Exception e) {
			result = true;
		}		
		return result;
	}
	
	public boolean registerPolice(Object police){
		LinkedHashMap<String, String> i = (LinkedHashMap<String, String>) police;
		System.out.println("DB : "+ i.get("mailId") + " " + i.get("password") + " " + i.get("name") + " " + i.get("contactNo")+" "+i.get("pincode"));
		boolean result;
		NativeQuery<Object> q = factory.getCurrentSession().getNamedNativeQuery("qry_StoProcRegisterPolice");
		
		try {
			q.setParameter("password", CryptoUtility.Sha256(i.get("password")));
			q.setParameter("mailId", i.get("mailId"));
			q.setParameter("contactNo", i.get("contactNo"));
			q.setParameter("pincode", i.get("pincode"));
			q.setParameter("name", i.get("name"));
			q.getResultList();
			MailUtility.send("zszaidshaikh@gmail.com", "nisyiwtxhflfnpkg", i.get("mailId"));
			result = true;
		} catch (Exception e) {
			result = true;
		}		
		return result;
	}

}
