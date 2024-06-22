package com.example.demo.Controller;

import com.example.demo.Repository.DanhmucRepo;
import com.example.demo.Model.DanhmucEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/api")
public class DanhmucAPIController {
    @Autowired
    private DanhmucRepo danhmucRepo;

    /* ---------------- CREATE NEW DANH MUC ------------------------ */
    @PostMapping("/adddanhmuc")
    public String addDanhMuc(@ModelAttribute DanhmucEntity danhmucEntity) {
        if (danhmucRepo.existsByTenDanhMuc(danhmucEntity.getTenDanhMuc())) {
            return "admin/adddanhmuc";
        }
        DanhmucEntity a = new DanhmucEntity();
        a.setTenDanhMuc(danhmucEntity.getTenDanhMuc());
        a.setMoTaDanhMuc(danhmucEntity.getMoTaDanhMuc());
        a.setSoLuong(0);
        danhmucRepo.save(a);
        return "admin/danhmuc";
    }

    /* ---------------- DELETE DANH MUC ------------------------ */
    @PostMapping("/deletedanhmuc/{madanhmuc}")
    @Transactional
    public String deleteDanhMuc(@PathVariable("madanhmuc") Integer madanhmuc) {
        if (danhmucRepo.existsByMaDanhMuc(madanhmuc)) {
            DanhmucEntity a = danhmucRepo.findByMaDanhMuc(madanhmuc);
            if (a.getSoLuong() == 0) {
                danhmucRepo.deleteByMaDanhMuc(madanhmuc);
            }
        }
        return "admin/danhmuc";
    }

    /* ---------------- UPDATE DANH MUC ------------------------ */
    @PostMapping("/updatedanhmuc/{madanhmuc}")
    @Transactional
    public String updateDanhMuc(@PathVariable("madanhmuc") Integer madanhmuc, @ModelAttribute DanhmucEntity danhmucEntity) {

            DanhmucEntity existingDanhMuc = danhmucRepo.findByMaDanhMuc(madanhmuc);
            if (danhmucEntity.getTenDanhMuc() != null) {
                existingDanhMuc.setTenDanhMuc(danhmucEntity.getTenDanhMuc());
            }
            if (danhmucEntity.getMoTaDanhMuc() != null) {
                    existingDanhMuc.setMoTaDanhMuc(danhmucEntity.getMoTaDanhMuc());
            }
            danhmucRepo.save(existingDanhMuc);
            return "admin/danhmuc";
    }

}