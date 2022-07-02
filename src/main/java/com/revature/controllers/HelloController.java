//Test project to work with jenkins pipeline

package com.revature.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private Environment env;

	//localhost:8080/hello
	@GetMapping("/hello")
	public String sayHello() throws UnknownHostException {
		return String.format("Hello from %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty("local.server.port"));
	}

	//localhost:8080/morning
	@GetMapping("/morning")
	public String sayMorning() throws UnknownHostException {
		return String.format("Morning from %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty("local.server.port"));
	}

	//localhost:8080/afternoon
	@GetMapping("/afternoon")
	public String sayAfternoon() throws UnknownHostException {
		return String.format("Afternoon from %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty("local.server.port"));
	}

	//localhost:8080/evening
	@GetMapping("/evening")
	public String sayEvening() throws UnknownHostException {
		return String.format("Evening from %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty("local.server.port"));
	}

	//localhost:8080/goodnight
	@GetMapping("/goodnight")
	public String goodNight() throws UnknownHostException {
		return String.format("Good night from %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty("local.server.port"));
	}

	//localhost:8080/bye
	@GetMapping("/bye")
	public String sayBye() throws UnknownHostException {
		return String.format("Bye from %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty("local.server.port"));
	}

	//localhost:8080/thanks
	@GetMapping("/thanks")
	public String sayThanks() throws UnknownHostException {
		return String.format("Thanks from %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty("local.server.port"));
	}

	//localhost:8080/docker
	@GetMapping("/docker")
	public String sayDocker() throws UnknownHostException {
		return String.format("Docker now part of it from %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty("local.server.port"));
	}

	//localhost:8080/dockersuccess
	@GetMapping("/dockersuccess")
	public String sayDockerSuccess() throws UnknownHostException {
		return String.format("Docker successfully now part of it from %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty("local.server.port"));
	}

	//localhost:8080/yamer
	@GetMapping("/yamer")
	public String sayYamer() throws UnknownHostException {
		return String.format("Yamer part of it from %s:%s", InetAddress.getLocalHost().getHostAddress(), env.getProperty("local.server.port"));
	}
}
