package com.example.Login.Module.Service;

import com.example.Login.Module.Repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    private UserRepository userRepository;

    public CustomUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {

        return userRepository.findByUserName(userName)
                .orElseThrow(() ->
                        new UsernameNotFoundException("Username not found"));
    }
}
