package com.richardcsantana;

import com.richardcsantana.model.Dado;
import com.richardcsantana.repository.DadoRepository;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EnverSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnverSampleApplication.class, args);
	}

}
