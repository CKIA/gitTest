package test.com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

@SpringBootApplication
public class TomcatPort implements EmbeddedServletContainerCustomizer {

	public static void main(String[] args) {
		SpringApplication.run(TomcatPort.class);
	}
	@Override
	public void customize(ConfigurableEmbeddedServletContainer arg0) {
		arg0.setPort(8088);
	}

}
