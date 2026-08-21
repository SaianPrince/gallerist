package com.omersemizoglu.controller;

import com.omersemizoglu.dto.DtoSaledCar;
import com.omersemizoglu.dto.DtoSaledCarIU;

public interface IRestSaledCarController {

	public RootEntity<DtoSaledCar> buyCar(DtoSaledCarIU dtoSaledCarIU);
}
