package br.com.medicare.integrado;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicareIntegradoApplication {
	public static void main(String[] args) {
		Dotenv.load();
		SpringApplication.run(MedicareIntegradoApplication.class, args);
	}

}
