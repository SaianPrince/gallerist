package com.omersemizoglu.service;

import com.omersemizoglu.dto.DtoCar;
import com.omersemizoglu.dto.DtoCarIU;

public interface ICarService {

	public DtoCar saveCar(DtoCarIU dtoCarIU);
}
