/**
 * @编写人:赵张承; 
 * @时间 :下午12:37:33;
 * @日期 :2015年12月27日;
 * 更改原因:
 */ 
package com.blog.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



/**
*类描述：
*@author: blank
*@date： 日期：2015年12月27日 时间：下午12:37:33
*@version 1.0
*/
public class ViewAction extends ActionSupport{
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub.
		ActionContext context=ActionContext.getContext();
		Map para=context.getParameters();
		para.put("aID", getaID());
		return SUCCESS;
	}
	private int aID;

	public int getaID() {
		return aID;
	}

	public void setaID(int aID) {
		this.aID = aID;
	}

}
