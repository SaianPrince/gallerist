package com.omersemizoglu.controller;

import com.omersemizoglu.dto.AuthRequest;
import com.omersemizoglu.dto.AuthResponse;
import com.omersemizoglu.dto.DtoUser;
import com.omersemizoglu.dto.RefreshTokenRequest;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest input);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
