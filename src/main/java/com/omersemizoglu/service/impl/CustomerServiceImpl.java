package com.omersemizoglu.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omersemizoglu.dto.DtoAccount;
import com.omersemizoglu.dto.DtoAddress;
import com.omersemizoglu.dto.DtoCustomer;
import com.omersemizoglu.dto.DtoCustomerIU;
import com.omersemizoglu.exception.BaseException;
import com.omersemizoglu.exception.ErrorMessage;
import com.omersemizoglu.exception.MessageType;
import com.omersemizoglu.model.Account;
import com.omersemizoglu.model.Address;
import com.omersemizoglu.model.Customer;
import com.omersemizoglu.repository.AccountRepository;
import com.omersemizoglu.repository.AddressRepository;
import com.omersemizoglu.repository.CustomerRepository;
import com.omersemizoglu.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	private Customer createCustomer(DtoCustomerIU dtoCustomerIU) {
		Optional<Address> optAddress = addressRepository.findById(dtoCustomerIU.getAddressId());
		if(optAddress.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoCustomerIU.getAddressId().toString()));
		}
		
		Optional<Account> optAccount = accountRepository.findById(dtoCustomerIU.getAccountId());
		if(optAccount.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoCustomerIU.getAccountId().toString()));
		}
		
		
		Customer customer = new Customer();
		customer.setCreateTime(new Date());
		BeanUtils.copyProperties(dtoCustomerIU, customer);
		
		customer.setAddress(optAddress.get());
		customer.setAccount(optAccount.get());
		
		return customer;
	}
	
	@Override
	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU) {
		DtoCustomer dtoCustomer = new DtoCustomer();
		DtoAddress dtoAddress = new DtoAddress();
		DtoAccount dtoAccount = new DtoAccount();
		
		Customer savedCustomer = customerRepository.save(createCustomer(dtoCustomerIU));
		
		BeanUtils.copyProperties(savedCustomer, dtoCustomer);
		BeanUtils.copyProperties(savedCustomer.getAddress(), dtoAddress);
		BeanUtils.copyProperties(savedCustomer.getAccount(), dtoAccount);
		
		dtoCustomer.setAddress(dtoAddress);
		dtoCustomer.setAccount(dtoAccount);
		
		return dtoCustomer;
	}

	
}
