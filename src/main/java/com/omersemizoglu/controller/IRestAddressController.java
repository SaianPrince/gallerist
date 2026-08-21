package com.omersemizoglu.controller;

import com.omersemizoglu.dto.DtoAddress;
import com.omersemizoglu.dto.DtoAddressIU;

public interface IRestAddressController {

	public RootEntity<DtoAddress> saveAddress(DtoAddressIU dtoAddressIU);
}
