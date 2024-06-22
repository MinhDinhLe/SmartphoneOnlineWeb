package com.example.demo.Repository;

import com.example.demo.Model.ThanhvienEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Repository
@Service
public interface ThanhvienRepo extends JpaRepository<ThanhvienEntity, Integer> {
    Boolean existsByTenDangNhap(String Tendangnhap);
    Boolean existsByMaKhachHang(Integer ma);
    Optional<ThanhvienEntity> findByTenDangNhap(String username);

}
