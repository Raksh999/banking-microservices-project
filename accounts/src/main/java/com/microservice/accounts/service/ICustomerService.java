package com.microservice.accounts.service;

import com.microservice.accounts.dto.CustomerDetailsDto;

public interface ICustomerService {
    /**
     *
     * @param mobileNumber - input Mobile Number
     * @return - Customer Details based on mobile number
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
