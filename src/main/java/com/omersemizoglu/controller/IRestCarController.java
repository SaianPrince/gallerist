package com.omersemizoglu.controller;

import com.omersemizoglu.dto.DtoCar;
import com.omersemizoglu.dto.DtoCarIU;

public interface IRestCarController {

	public RootEntity<DtoCar> saveCar(DtoCarIU dtoCarIU);
}
