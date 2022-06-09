package com.zensar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zensar.beans.Student;


@ComponentScan("com.zensar.beans")
@PropertySource(value = "data.properties")
@Configuration
public class JavaConfiguration {
	
}
