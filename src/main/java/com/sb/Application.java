package com.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
  private static final String REST_URL="https://www.equifax.com/getScores"
	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(Application.class, args);
		run.close();
	}
//HIS-200 related changes
   public void doProcess(){
//logic goes here
}

}
