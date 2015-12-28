/**
 * @编写人:赵张承; 
 * @时间 :下午3:06:34;
 * @日期 :2015年12月26日;
 * 更改原因:
 */ 
package com.blog.action;

import com.opensymphony.xwork2.ActionSupport;

/**
*类描述：
*@author: blank
*@date： 日期：2015年12月26日 时间：下午3:06:34
*@version 1.0
*/
public class SearchAction extends ActionSupport {
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	
	private String tagName;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(getTagName());
		return SUCCESS;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
