package com.omersemizoglu.controller;

import com.omersemizoglu.dto.DtoCustomer;
import com.omersemizoglu.dto.DtoCustomerIU;

public interface IRestCustomerController {

	public RootEntity<DtoCustomer> saveCustomer(DtoCustomerIU dtoCustomerIU);
}
