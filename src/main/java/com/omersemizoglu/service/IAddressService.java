package com.omersemizoglu.service;

import com.omersemizoglu.dto.DtoAddress;
import com.omersemizoglu.dto.DtoAddressIU;

public interface IAddressService {

	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU);
}
