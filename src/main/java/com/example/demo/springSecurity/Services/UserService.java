package com.example.demo.springSecurity.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.springSecurity.Repos.UserRepo;
import com.example.demo.springSecurity.entities.AppUser;


@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser user = userRepo.findByUserName(username).orElseThrow(() ->  new UsernameNotFoundException("username not found"));
		return new CustomUserDetails(user);
	}
	
	public AppUser registerUser(AppUser user) {
	    user.setUserpassWord(passwordEncoder.encode(user.getUserpassWord()));
		return userRepo.save(user);
	}
	
	
}
