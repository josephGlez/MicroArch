package com.microarc.serviceA;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FooController {

	@Inject
	Environment environment;


	@RequestMapping(method = RequestMethod.GET, value = "/port")
    @ResponseBody
    public Foo getPort(HttpServletRequest req, HttpServletResponse res) {

			String port = environment.getProperty("server.port");
			
        return new Foo(Integer.valueOf(port));
    }
}
