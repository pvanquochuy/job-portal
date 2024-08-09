package com.example.job_portal.usermanagement.service;

import java.text.ParseException;

import com.example.job_portal.usermanagement.dto.AuthenticationDTO;
import com.example.job_portal.usermanagement.dto.IntrospectDTO;
import com.example.job_portal.usermanagement.request.AuthenticationRequest;
import com.example.job_portal.usermanagement.request.IntrospectRequest;
import com.example.job_portal.usermanagement.request.LogoutRequest;
import com.example.job_portal.usermanagement.request.RefreshRequest;
import com.nimbusds.jose.JOSEException;

public interface AuthenticationService {
    AuthenticationDTO authenticate(AuthenticationRequest request);

    IntrospectDTO introspect(IntrospectRequest request) throws JOSEException, ParseException;

    AuthenticationDTO refreshToken(RefreshRequest request) throws ParseException, JOSEException;

    void logout(LogoutRequest request) throws ParseException, JOSEException;
}
