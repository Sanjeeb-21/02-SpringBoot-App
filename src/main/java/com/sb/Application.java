package com.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    private Map<String,Object> cache=new HashMap<String,Object>();
	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(Application.class, args);
		run.close();
	}
//HIS-200 related changes
   public void doProcess(){
//logic goes here
}
//HIS-301 changes
public void loadDataCache(){
    //logic
}


}
