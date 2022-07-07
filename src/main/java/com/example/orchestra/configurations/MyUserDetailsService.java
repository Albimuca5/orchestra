package com.example.orchestra.configurations;
//
//import com.example.orchestra.repositories.UserRepository;
//import com.example.orchestra.entities.User;
//import com.example.orchestra.entities.UserPrincipal;
//import com.example.orchestra.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(userName);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found with username: " + userName);
//        }
//        return new UserPrincipal(user);
//    }
//}
