package com.mircroarc.feignpassthrough;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.mircroarc.model.ProxyDataPort;

@FeignClient("service-A")
public interface ServiceAProxy {

	  @GetMapping("/port")
	  public ProxyDataPort retrieveEmbeddedPort();

}
