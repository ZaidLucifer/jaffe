package com.sunbeam.utility;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class CryptoUtility {
	
	 private static String convertToHex(byte[] data) { 
	        StringBuffer buf = new StringBuffer();
	        for (int i = 0; i < data.length; i++) { 
	            int halfbyte = (data[i] >>> 4) & 0x0F;
	            int two_halfs = 0;
	            do { 
	                if ((0 <= halfbyte) && (halfbyte <= 9)) 
	                    buf.append((char) ('0' + halfbyte));
	                else 
	                    buf.append((char) ('a' + (halfbyte - 10)));
	                halfbyte = data[i] & 0x0F;
	            } while(two_halfs++ < 1);
	        } 
	        System.out.println(buf.toString());
	        return buf.toString();
	    } 
	 	    
	    public static String Sha256(String text) 
	    throws NoSuchAlgorithmException, UnsupportedEncodingException  { 
	    
	    	MessageDigest digest = MessageDigest.getInstance("SHA-256");
	    	byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
	    	System.out.println(hash);
	    return convertToHex(hash);
	    } 
}
