package com.raghavtapi.accounts.service;

import com.raghavtapi.accounts.dto.CustomerDetailsDto;
import org.springframework.web.bind.annotation.RequestParam;

public interface ICustomerService {

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on a given mobileNumber
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
