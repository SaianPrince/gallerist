package com.omersemizoglu.service;

import com.omersemizoglu.dto.AuthRequest;
import com.omersemizoglu.dto.AuthResponse;
import com.omersemizoglu.dto.DtoUser;
import com.omersemizoglu.dto.RefreshTokenRequest;

public interface IAuthenticationService {

	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest input);
	
	public AuthResponse refreshToken(RefreshTokenRequest input);
}
