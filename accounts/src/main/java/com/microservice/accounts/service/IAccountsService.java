package com.microservice.accounts.service;

import com.microservice.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return - Account Details based on the given Number
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input mobile Number
     * @return boolean indicating if the delete of account is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
