package com.example.job_portal.usermanagement.service;

import java.util.List;

import com.example.job_portal.usermanagement.dto.UserDTO;
import com.example.job_portal.usermanagement.request.UserCreationRequest;
import com.example.job_portal.usermanagement.request.UserUpdateRequest;

public interface UserService {

    /**
     * create a new user
     *
     * @param request the data transfer object containing user details
     */
    UserDTO createUser(UserCreationRequest request);

    List<UserDTO> getUsers();

    UserDTO getUser(String id);

    UserDTO getMyInfo();

    void deleteUser(String userId);

    /**
     * update a new user
     *
     * @param request the data transfer object containing user details
     */
    UserDTO updateUser(String userId, UserUpdateRequest request);
}
