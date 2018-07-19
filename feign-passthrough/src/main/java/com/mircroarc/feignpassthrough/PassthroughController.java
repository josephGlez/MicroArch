package com.mircroarc.feignpassthrough;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mircroarc.model.ProxyDataPort;

@Controller
public class PassthroughController {
	
	@Inject
	ServiceAProxy proxy;

	@RequestMapping(method = RequestMethod.GET, value = "/service-A-proxy")
    @ResponseBody
    public ProxyDataPort getFoos(HttpServletRequest req, HttpServletResponse res) {
		ProxyDataPort response = proxy.retrieveEmbeddedPort();   			
        return response;
    }

}
