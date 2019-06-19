package com.pj.springdatademo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThreadPoolExecutorSpringBootApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ThreadPoolExecutorSpringBootApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
}
