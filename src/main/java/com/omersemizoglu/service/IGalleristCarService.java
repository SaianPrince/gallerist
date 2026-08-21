package com.omersemizoglu.service;

import com.omersemizoglu.dto.DtoGalleristCar;
import com.omersemizoglu.dto.DtoGalleristCarIU;

public interface IGalleristCarService {

	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
