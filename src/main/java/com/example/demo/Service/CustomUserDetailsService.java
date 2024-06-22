package com.example.demo.Service;

import com.example.demo.Config.CustomUserDetails;
import com.example.demo.Model.ThanhvienEntity;
import com.example.demo.Repository.ThanhvienRepo;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomUserDetailsService implements UserDetailsService {
 private final ThanhvienRepo thanhvienRepo;

    public CustomUserDetailsService(ThanhvienRepo thanhvienRepo) {
        this.thanhvienRepo = thanhvienRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<ThanhvienEntity> thanhvienEntityOptional=thanhvienRepo.findByTenDangNhap(username);
        return thanhvienEntityOptional.map(CustomUserDetails::new).orElseThrow(()->new UsernameNotFoundException("user not found: " + username));
    }

}
