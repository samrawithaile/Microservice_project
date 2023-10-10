package com.learning.microservice.limitservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	private int minmum;
	private int maxmum;
	public int getMinmum() {
		return minmum;
	}
	public void setMinmum(int minmum) {
		this.minmum = minmum;
	}
	public int getMaxmum() {
		return maxmum;
	}
	public void setMaxmum(int maxmum) {
		this.maxmum = maxmum;
	}
	
	
}
