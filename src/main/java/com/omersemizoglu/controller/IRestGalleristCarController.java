package com.omersemizoglu.controller;

import com.omersemizoglu.dto.DtoGalleristCar;
import com.omersemizoglu.dto.DtoGalleristCarIU;

public interface IRestGalleristCarController {

	public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
