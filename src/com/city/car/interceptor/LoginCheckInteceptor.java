package com.city.car.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginCheckInteceptor  implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("µÇÂ¼¼ì²éÀ¹½ØÆ÷Ïú»Ù·½·¨¡£¡£¡£");

	}

	@Override
	public void init() {
		System.out.println("µÇÂ¼¼ì²éÀ¹½ØÆ÷³õÊ¼»¯·½·¨¡£¡£¡£");

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("µÇÂ¼¼ì²éÀ¹½ØÆ÷À¹½Ø·½·¨¡£¡£¡£");
		
		ActionContext ac=ActionContext.getContext();
		Map<String,Object> session=ac.getSession();
		if(session.get("dm")==null){
			return "login";
		}
		else{
			String result=ai.invoke();
			return result;
		}
		
	}

}
