package com.blog.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class IadminLogin extends MethodFilterInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4054251105728034671L;

	@Override
	protected String doIntercept(ActionInvocation invoker) throws Exception {
		Object loginAdmin=ActionContext.getContext().getSession().get("aName");
		if(loginAdmin==null)
		{
			return Action.LOGIN;
		}
		return invoker.invoke();
		
		
		
	}

}
