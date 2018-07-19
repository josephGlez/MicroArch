package com.mircroarc.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProxyDataPort {

	private int port;
	
	@JsonCreator
	public ProxyDataPort(@JsonProperty("port")int id) {
		this.port = id;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int id) {
		this.port = id;
	}
}
