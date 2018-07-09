package com.city.car.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.city.car.service.IIPService;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@Controller("IPCheckInterceptor")
public class IPCheckInterceptor extends AbstractInterceptor {

	private IIPService ips=null;
	@Autowired
	public void setIps(IIPService ips) {
		this.ips = ips;
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		String ip=request.getRemoteAddr();
		
		if(ips.checkIPExist(ip)){
			return "error";
		}
		else{
			return ai.invoke();
			
		}
		
		
	}

}
