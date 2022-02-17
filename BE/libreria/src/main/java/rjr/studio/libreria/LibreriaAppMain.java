package rjr.studio.libreria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaAppMain {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaAppMain.class, args);
		
		System.out.println("Hello Libreria!!!");
	}

}
