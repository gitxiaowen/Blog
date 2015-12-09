package com.blog.utils;

import java.io.UnsupportedEncodingException;
/*******************************************
* 	创建标识：熊小文   2015.11.25
 * 
 * 	类描述：数据库操作的公共类
 * 
 * 	修改内容：
 * 	修改时间：
 * 	修改原因：
 *******************************************/

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Encrypt 
{
	/**
	 * 使用Base64加密字符串
	 * @param str
	 * @return 加密后的字符串
	 */
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
	  
	    /**
	     * 使用Base64解密字符串
	     * @param s
	     * @return 解密后的字符串
	     */
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
