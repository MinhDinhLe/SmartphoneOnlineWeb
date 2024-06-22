package com.example.demo.Controller;

import com.example.demo.Repository.DanhmucRepo;
import com.example.demo.Repository.SanphamRepo;
import com.example.demo.Model.DanhmucEntity;
import com.example.demo.Model.SanphamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value="/api",consumes = {"application/x-www-form-urlencoded;charset=UTF-8"})
public class SanphamAPIController {
    @Autowired
    private SanphamRepo sanphamRepo;
    @Autowired
    private DanhmucRepo danhmucRepo;

    /* ---------------- ADD SAN PHAM ------------------------ */
    @PostMapping(value = "/addsanpham", consumes = {"application/x-www-form-urlencoded;charset=UTF-8"})

    public String addsanpham(@ModelAttribute SanphamEntity sanphamEntity, RedirectAttributes redirectAttributes ) {
        // Kiểm tra xem sản phẩm có trùng tên hay không
        if (sanphamRepo.existsByTenSanPham(sanphamEntity.getTenSanPham())) {
            redirectAttributes.addAttribute("error", "Tên sản phẩm đã tồn tại");
            return "admin/product";
        }
        DanhmucEntity a = danhmucRepo.findByMaDanhMuc(sanphamEntity.getMaDanhMuc());
        Integer soLuong = a.getSoLuong();
        // Kiểm tra xem soLuong có null hay không
        if (soLuong == null) {
            soLuong = 0;
        }
        // Tăng số lượng danh mục lên 1
        a.setSoLuong(soLuong + sanphamEntity.getSoLuongTon());
        danhmucRepo.save(a);
        // Lưu sản phẩm vào cơ sở dữ liệu
        sanphamRepo.save(sanphamEntity);
        //return ResponseEntity.status(HttpStatus.FOUND).body("admin/index");
        return "admin/product";
    }

    /* ---------------- DELETE San Pham ------------------------ */
    @PostMapping("/deletesanpham/{masanpham}")
    @Transactional
    public String deleteSanPham(@PathVariable("masanpham") Integer masanpham) {
        if (sanphamRepo.existsByMaSanPham(masanpham)) {
            SanphamEntity a = sanphamRepo.findByMaSanPham(masanpham);
            sanphamRepo.deleteByMaSanPham(masanpham);
            DanhmucEntity b=danhmucRepo.findByMaDanhMuc(a.getMaDanhMuc());
            b.setSoLuong(b.getSoLuong()-1);
            danhmucRepo.save(b);
            return "admin/product";
        } else {
            return "admin/product";
        }
    }
    /* ---------------- update San Pham ------------------------ */
    @PostMapping("/updatesanpham/{masanpham}")
    @Transactional
    public String updateSanPham(@PathVariable("masanpham") Integer masanpham, @ModelAttribute SanphamEntity updatedSanpham) {
        SanphamEntity existingSanpham=sanphamRepo.findByMaSanPham(masanpham);
        if (updatedSanpham.getTenSanPham() != null) {
            existingSanpham.setTenSanPham(updatedSanpham.getTenSanPham());
        }
        if (updatedSanpham.getGiaSanPham() != null) {
            existingSanpham.setGiaSanPham(updatedSanpham.getGiaSanPham());
        }
        if (updatedSanpham.getHinhAnhSanPham() != null) {
            existingSanpham.setHinhAnhSanPham(updatedSanpham.getHinhAnhSanPham());
        }
        if (updatedSanpham.getMoTaSanPham() != null) {
            existingSanpham.setMoTaSanPham(updatedSanpham.getMoTaSanPham());
        }
        if (updatedSanpham.getThongSoKyThuat() != null) {
            existingSanpham.setThongSoKyThuat(updatedSanpham.getThongSoKyThuat());
        }
        if (updatedSanpham.getNgayTao() != null) {
            existingSanpham.setNgayTao(updatedSanpham.getNgayTao());
        }
        if (updatedSanpham.getMaDanhMuc() != null) {
            existingSanpham.setMaDanhMuc(updatedSanpham.getMaDanhMuc());
        }

            sanphamRepo.save(existingSanpham);
        return "admin/product";
        }
    }
