package com.example.configuration;

import com.example.beans.HisBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AllConfiguration {

    @Bean
    public HisBean hisBean() {
        return new HisBean();
    }

    @Bean
    public Customer customer(Address address) {
        return new Customer(address);
    }

    @Bean
    public Address address(Customer customer) {
        return new Address(customer);
    }
}
