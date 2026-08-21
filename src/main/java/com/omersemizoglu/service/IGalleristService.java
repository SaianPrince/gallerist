package com.omersemizoglu.service;

import com.omersemizoglu.dto.DtoGallerist;
import com.omersemizoglu.dto.DtoGalleristIU;

public interface IGalleristService {

	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU);
}
