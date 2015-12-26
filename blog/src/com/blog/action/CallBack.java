/**
 * @编写人:赵张承; 
 * @时间 :上午11:05:35;
 * @日期 :2015年12月26日;
 * 更改原因:
 */ 
package com.blog.action;


import java.util.Map;

import com.blog.utils.Encrypt;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
*类描述：邮件回执操作
*@author: 熊小文
*@date： 日期：2015年12月26日 时间：上午11:05:35
*@version 1.0
*/
public class CallBack extends ActionSupport {

	private String callback;
	
	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// 收到回执邮件，登录并启动会话
		 ActionContext actionContext = ActionContext.getContext();
		 Map session = actionContext.getSession();
		 session.put("user", Encrypt.Decode(callback));
		return SUCCESS;
	}
}
