package com.jha.practice.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BankOfBarodaConfig {
	 @Bean
	 @Primary
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
