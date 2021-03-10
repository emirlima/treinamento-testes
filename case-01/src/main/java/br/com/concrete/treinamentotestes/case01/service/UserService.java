package br.com.concrete.treinamentotestes.case01.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse saveNewUser(UserRequest userRequest) {



        if (userRequest.getEmail().trim() == "") {

            throw new IllegalArgumentException();
        }


    }

    private 
}
