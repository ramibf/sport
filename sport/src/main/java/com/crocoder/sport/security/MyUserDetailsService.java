package com.crocoder.sport.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.crocoder.sport.models.Role;
import com.crocoder.sport.models.User;



@Service
public class MyUserDetailsService  implements UserDetailsService  {
	@Autowired
	private com.crocoder.sport.repositories.UserRepo userRepository;
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	
		User user = userRepository.findUserByEmail(username);
    	
		boolean accountNonExpired = true; 
		boolean credentialsNonExpired = true; 
		boolean accountNonLocked = true;
		
		UserDetails userDetails = new org.springframework.security.core.userdetails.User(
				username, 
				user.getPwd(), 
				true,
				accountNonExpired, 
				credentialsNonExpired, 
				accountNonLocked, 
				getAuthorities(user.getRoles()));
		
		return userDetails;
    }
	private Collection<? extends GrantedAuthority> getAuthorities(List<Role> roles) {
		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		for (Role role: roles) {
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getName());
			grantedAuthorities.add(grantedAuthority);
		}
		return grantedAuthorities;
	}

}
