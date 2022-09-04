package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)throws Exception { SpringApplication.run(DemoApplication.class, args);

/*
		UserInfo user = new UserInfo("Sultan" , 50);

		System.out.println("\n" + user.getName());

		Field[] userField=user.getClass().getDeclaredFields();

		System.out.println("\n__________________________________ \n");

		for (Field x : userField){
			System.out.println(x.getName());
			x.setAccessible(true);//this is the most important one this gives me the ability to change everything
			if (x.getName().equals("name")){
				x.set(user, "tara .. here is the new name of the user");
			}

		}
		System.out.println(user.getName());
		System.out.println("\n________________________________\n");


	 	Method[] userMethod = user.getClass().getDeclaredMethods();
		 for (Method z : userMethod){
			 z.setAccessible(true);
			 System.out.println(z.getName() );
			 if (z.getName().equals("mew")) System.out.println(z.invoke(user));

			 if (z.getName().equals("dog")) System.out.println(z.invoke(null)); // if I call a static methode -> set invoke parameter to null

		 }
		System.out.println("\n________________________________\n");

		HashMap<String , Integer > empId = new HashMap<>();
		 empId.put("Sultan" , 1);
		 empId.put("Sulan" , 2);
		 empId.put("Sul" , 3);
		System.out.println(empId);


*/

	}

}
/*

http://localhost:8080/swagger-ui/index.html by using swagger I can get a website there I can see what methode and what path I have.

implementation 'org.apache.aries.jpa:org.apache.aries.jpa.container:2.7.3'

runtimeOnly 'org.postgresql:postgresql'

spring:
  datasource:
    driver-class-name: org.h2.Driver
    url: jdbc:h2:mem:localhost;DB_CLOSE_ON_EXIT=FALSE
    username: admin

    url= jdbc:h2:mem:localhost;DB_CLOSE_ON_EXIT=FALSE

 */