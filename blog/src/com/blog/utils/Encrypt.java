package com.blog.utils;

import java.io.UnsupportedEncodingException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Encrypt 
{
	 public static String Encode(String str) {  
	        byte[] b = null;  
	        String s = null;  
	        try {  
	            b = str.getBytes("utf-8");  
	        } catch (UnsupportedEncodingException e) {  
	            e.printStackTrace();  
	        }  
	        if (b != null) {  
	            s = new BASE64Encoder().encode(b);  
	        }  
	        return s;  
	    }  
	  
	    // 解密  
	    public static String Decode(String s) 
	    {  
	        byte[] b = null;  
	        String result = null;  
	        if (s != null) 
	        {  
	            BASE64Decoder decoder = new BASE64Decoder();  
	            try 
	            {  
	                b = decoder.decodeBuffer(s);  
	                result = new String(b, "utf-8");  
	            } 
	            catch (Exception e) 
	            {  
	                e.printStackTrace();  
	            }  
	        }  
	        return result;  
	    }
	    public static void main(String[] args) 
	    {
//	    	测试加密
	    	String src="blog";
	    	System.out.println(Encode(src));
//	    	测试解密
	    	String res="YmxvZw==";
	    	System.out.println(Decode(res));
		}
}
