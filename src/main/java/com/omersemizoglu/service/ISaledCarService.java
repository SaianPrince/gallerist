package com.omersemizoglu.service;

import com.omersemizoglu.dto.DtoSaledCar;
import com.omersemizoglu.dto.DtoSaledCarIU;

public interface ISaledCarService {

	public DtoSaledCar buyCar(DtoSaledCarIU dtoSaledCarIU);
}
