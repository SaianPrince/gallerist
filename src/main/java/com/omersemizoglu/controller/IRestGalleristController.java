package com.omersemizoglu.controller;

import com.omersemizoglu.dto.DtoGallerist;
import com.omersemizoglu.dto.DtoGalleristIU;

public interface IRestGalleristController {

	public RootEntity<DtoGallerist> saveGallerist(DtoGalleristIU dtoGalleristIU);
}
