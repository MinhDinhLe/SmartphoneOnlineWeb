package com.example.demo.Controller;

import com.example.demo.Model.ThanhvienEntity;
import com.example.demo.Repository.ThanhvienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Controller
@RequestMapping("/api")
public class ThanhvienAPIController {
    @Autowired
   private ThanhvienRepo thanhvienRepo;
    @Autowired
    private AuthenticationManager authenticationManager;
    /* ---------------- CREATE NEW CUSTOMER ------------------------ */
    @PostMapping("/customer")
    public ResponseEntity<?> registerUser(@RequestBody ThanhvienEntity thanhvienEntity) {
        if (thanhvienRepo.existsByTenDangNhap(thanhvienEntity.getTenDangNhap())) {
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }
        ThanhvienEntity a = new ThanhvienEntity();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        a.setTenDangNhap(thanhvienEntity.getTenDangNhap());
        a.setMatKhau(passwordEncoder.encode(thanhvienEntity.getMatKhau()));
        a.setHoTen(thanhvienEntity.getHoTen());
        a.setEmail(thanhvienEntity.getEmail());
        a.setDiaChi(thanhvienEntity.getDiaChi());
        a.setDienThoai(thanhvienEntity.getDienThoai());
        a.setRole("USER");
        thanhvienRepo.save(a);
        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
    }

    /* -------------- SIGNIN CUSTOMER ------------------------ */
    /* -------------- SIGNIN CUSTOMER ------------------------ */
    @PostMapping("/sign2")
    public String signinCustomer(@ModelAttribute LoginRequest loginRequest) {
        UsernamePasswordAuthenticationToken authToken =
                new UsernamePasswordAuthenticationToken(loginRequest.getTenDangNhap(), loginRequest.getMatKhau());

        Authentication authentication = authenticationManager.authenticate(authToken);

        if (authentication.isAuthenticated()) {
            SecurityContextHolder.getContext().setAuthentication(authentication);
            return "redirect:/product";
        } else {
            // Xử lý đăng nhập không thành công
            return "login";
        }
    }
    @DeleteMapping("/customer/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("id") Integer id) {
        if (!thanhvienRepo.existsById(id)) {
            return new ResponseEntity<>("Customer not found", HttpStatus.NOT_FOUND);
        }

        thanhvienRepo.deleteById(id);
        return new ResponseEntity<>("Customer deleted successfully", HttpStatus.OK);
    }
    class LoginRequest {
        private String tenDangNhap;
        private String matKhau;

        public String getTenDangNhap() {
            return tenDangNhap;
        }

        public void setTenDangNhap(String tenDangNhap) {
            this.tenDangNhap = tenDangNhap;
        }

        public String getMatKhau() {
            return matKhau;
        }

        public void setMatKhau(String matKhau) {
            this.matKhau = matKhau;
        }
    }
}