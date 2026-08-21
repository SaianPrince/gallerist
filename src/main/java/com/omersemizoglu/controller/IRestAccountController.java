package com.omersemizoglu.controller;

import com.omersemizoglu.dto.DtoAccount;
import com.omersemizoglu.dto.DtoAccountIU;

public interface IRestAccountController {

	public RootEntity<DtoAccount> saveAccount(DtoAccountIU dtoAccountIU);
}
