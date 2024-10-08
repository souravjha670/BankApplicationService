package com.jha.practice.config;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HdfcBankConfig {
	 @Bean(name = "hdfcModelMapper")
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}


