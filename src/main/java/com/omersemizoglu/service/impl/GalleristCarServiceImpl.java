package com.omersemizoglu.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omersemizoglu.dto.DtoAddress;
import com.omersemizoglu.dto.DtoCar;
import com.omersemizoglu.dto.DtoGallerist;
import com.omersemizoglu.dto.DtoGalleristCar;
import com.omersemizoglu.dto.DtoGalleristCarIU;
import com.omersemizoglu.exception.BaseException;
import com.omersemizoglu.exception.ErrorMessage;
import com.omersemizoglu.exception.MessageType;
import com.omersemizoglu.model.Car;
import com.omersemizoglu.model.Gallerist;
import com.omersemizoglu.model.GalleristCar;
import com.omersemizoglu.repository.CarRepository;
import com.omersemizoglu.repository.GalleristCarRepository;
import com.omersemizoglu.repository.GalleristRepository;
import com.omersemizoglu.service.IGalleristCarService;

@Service
public class GalleristCarServiceImpl implements IGalleristCarService{
	
	@Autowired
	private GalleristCarRepository galleristCarRepository;
	
	@Autowired
	private GalleristRepository galleristRepository;

	@Autowired
	private CarRepository carRepository;
	
	private GalleristCar createGalleristCar(DtoGalleristCarIU dtoGalleristCarIU) {
		
		Optional<Gallerist> optGallerist = galleristRepository.findById(dtoGalleristCarIU.getGalleristId());
		if(optGallerist.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristCarIU.getGalleristId().toString()));
		}

		Optional<Car> optCar = carRepository.findById(dtoGalleristCarIU.getCarId());
		if(optCar.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristCarIU.getCarId().toString()));
		}
		
		
		GalleristCar galleristCar = new GalleristCar();
		galleristCar.setCreateTime(new Date());
		galleristCar.setGallerist(optGallerist.get());
		galleristCar.setCar(optCar.get());
		
		return galleristCar;
		
	}
	
	@Override
	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU) {
		DtoGalleristCar dtoGalleristCar = new DtoGalleristCar();
		DtoGallerist dtoGallerist = new DtoGallerist();
		DtoCar dtoCar = new DtoCar();
		
		DtoAddress dtoAddress = new DtoAddress();
		
		GalleristCar savedGalleristCar = galleristCarRepository.save(createGalleristCar(dtoGalleristCarIU));
		
		BeanUtils.copyProperties(savedGalleristCar, dtoGalleristCar);
		BeanUtils.copyProperties(savedGalleristCar.getGallerist(), dtoGallerist);
		BeanUtils.copyProperties(savedGalleristCar.getGallerist().getAddress(), dtoAddress);
		
		BeanUtils.copyProperties(savedGalleristCar.getCar(), dtoCar);
		
		
		dtoGallerist.setAddress(dtoAddress);
		dtoGalleristCar.setGallerist(dtoGallerist);
		dtoGalleristCar.setCar(dtoCar);
		
		return dtoGalleristCar;
	}

}
