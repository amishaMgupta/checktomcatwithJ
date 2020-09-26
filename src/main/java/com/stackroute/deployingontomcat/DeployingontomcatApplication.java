package com.stackroute.deployingontomcat;

import com.sun.nio.sctp.SctpSocketOption;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class DeployingontomcatApplication {

	public static void main(String[] args)
	{
		System.out.println("Hello Tomcat war");
		SpringApplication.run(DeployingontomcatApplication.class, args);
	}

}
