package com.city.car.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginCheckInteceptor  implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("��¼������������ٷ���������");

	}

	@Override
	public void init() {
		System.out.println("��¼�����������ʼ������������");

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("��¼������������ط���������");
		
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
