package com.blog.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
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
	
	public static String getMessage(String link)
	{
		 StringBuilder msg=new StringBuilder();
		 msg.append("<!DOCTYPE>");
		 msg.append("<html>");
		 msg.append("<head>");
		 msg.append("<title>邮件</title>");
		 msg.append("<style type=\"text/css\">");
		 msg.append("a{text-decoration: none !important;}");
		 msg.append(".contact-admin:hover{");
		 msg.append(" text-decoration:underline;}");
		 msg.append(".e{color:#02b875;    border: 1px solid rgba(0,0,0,0.15);	border-color: #02b875;}"); 
		 msg.append(" .e:hover{	color:#00ef73;	border: 1px solid rgba(0,0,0,0.15);	border-color: #00ef73;}"); 
		 msg.append(".email{ width: 600px; height:500px;  padding-top:50px;    margin: auto;    position: fixed;    overflow: auto;    text-align: center;    top: 0;    left: 0;    bottom: 0;    right: 0;    display: block;    z-index: 900;    background-color: rgba(255,255,255,0.97);    width: 100%;    border: 0;    background: #f0f0f0;    opacity: 60%;}    p.e1{margin:80px 80px;font-family:STxingkai;font-size:80px;color:#02b875;}    p.e2{font-size:10px;color:rgba(0,0,0,0.5);}</style>"); 
		 msg.append("  </head>    <body>      <div class=\"email\">    <p class=\"e1\">竹博网</p>    <p>欢迎您注册使用竹博网！请点击下方按钮来创建您的账户。</p>    <p>本链接将在15分钟后失效，且仅能使用一次。</p>");
		 msg.append("<a href=\"");
		 msg.append(link);
		 msg.append("\" style=\"margin: 20px 20px;");
		 msg.append(" display:block;    margin:auto;	padding-top: 9px;	border-radius: 999em;	cursor: pointer;	height: 25px;	width: 120px;	vertical-align: middle;color:#02b875;\" class=\"e\">创建账户</a>");		
		 msg.append("<p class=\"e2\">若按钮不可用 ，请点击此链接进入浏览器<a href=\"");
		 msg.append(link);
		 msg.append("\" >");
		 msg.append(link);
		 msg.append("</a></p>");
		 msg.append("<p class=\"e2\">如果您没有提出此项请求，请联系<a class=\"contact-admin\" style=\"color:rgba(0,0,0,0.5);\" href=\"mailto:gitxiaowen@gmail.com\">竹博网管理员</a></p>    </div>     </body></html>");
		 return msg.toString();
	}
	
	
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
		sendMail("942911726@qq.com",getMessage("http://localhost/blog/callbackActionk?token=123"));
	}
}
