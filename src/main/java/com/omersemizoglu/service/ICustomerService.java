package com.omersemizoglu.service;

import com.omersemizoglu.dto.DtoCustomer;
import com.omersemizoglu.dto.DtoCustomerIU;

public interface ICustomerService {

	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU);
}
