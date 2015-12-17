package com.blog.utils;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class Email {
	
	public static void sendMail(String receiver, String emailMsg) throws AddressException, MessagingException 
	{
		 final Properties props = new Properties();
	        /*
	         * 可用的属性： mail.store.protocol / mail.transport.protocol / mail.host /
	         * mail.user / mail.from
	         */
	        // 表示SMTP发送邮件，需要进行身份验证
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.host", "smtp.sina.com");
	        // 发件人的账号
	        props.put("mail.user", "dolby_xiaowen@sina.com");
	        // 访问SMTP服务时需要提供的密码
	        props.put("mail.password", "19940414xxw");

	        // 构建授权信息，用于进行SMTP进行身份验证
	        Authenticator authenticator = new Authenticator() {
	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                // 用户名、密码
	                String userName = props.getProperty("mail.user");
	                String password = props.getProperty("mail.password");
	                return new PasswordAuthentication(userName, password);
	            }
	        };
	        // 使用环境属性和授权信息，创建邮件会话
	        Session mailSession = Session.getInstance(props, authenticator);
	        // 创建邮件消息
	        MimeMessage message = new MimeMessage(mailSession);
	        // 设置发件人
	        InternetAddress form = new InternetAddress(
	                props.getProperty("mail.user"));
	        message.setFrom(form);
	        InternetAddress to = new InternetAddress(receiver);
	        message.setRecipient(RecipientType.TO, to);

	        // 设置邮件标题
	        message.setSubject("继续完成您的竹帛账号注册");

	        // 设置邮件的内容体
	        message.setContent(emailMsg, "text/html;charset=UTF-8");

	        // 发送邮件
	        Transport.send(message);
	        
				
	}
	public static void main(String[] args) throws AddressException, MessagingException {
		sendMail("942911726@qq.com","dafsfajdslkf");
		
	}
}
