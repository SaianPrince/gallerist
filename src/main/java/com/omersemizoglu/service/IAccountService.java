package com.omersemizoglu.service;

import com.omersemizoglu.dto.DtoAccount;
import com.omersemizoglu.dto.DtoAccountIU;

public interface IAccountService {

	public DtoAccount saveAccount(DtoAccountIU dtoAccountIU);
}
