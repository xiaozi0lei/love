package com.guoleishenbo.love;

import com.guoleishenbo.love.conf.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class LoveApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveApplication.class, args);
	}

}
