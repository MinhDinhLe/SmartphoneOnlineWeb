package com.example.demo.Controller;

import com.example.demo.Repository.DanhmucRepo;
import com.example.demo.Repository.SanphamRepo;
import com.example.demo.Model.DanhmucEntity;
import com.example.demo.Model.SanphamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class AdminController {
    @Autowired
    private DanhmucRepo danhMucRepository;
    @Autowired
    private SanphamRepo sanphamRepo;

    @RequestMapping("/admin/add")
    public String addProduct(DanhmucEntity danhmucEntity, Model model) {
        List<DanhmucEntity> danhMucList = danhMucRepository.findAll();
        model.addAttribute("danhMucList", danhMucList);
        return "admin/index";
    }
    @RequestMapping("/admin/showproduct")
    public  String showProduct(SanphamEntity sanphamEntity, Model model) {
        List<SanphamEntity> sanphamList = sanphamRepo.findAll();
        model.addAttribute("sanphamList",sanphamList);
        return "admin/product";
    }
    @RequestMapping("/admin/showdetail/{masanpham}")
    public String show(@PathVariable("masanpham") Integer masanpham,Model model) {
        SanphamEntity sanphamEntity=sanphamRepo.findByMaSanPham(masanpham);
        model.addAttribute("sanphamEntity",sanphamEntity);
        List<DanhmucEntity> danhMucList = danhMucRepository.findAll();
        model.addAttribute("danhMucList", danhMucList);
        return  "admin/editproduct";
    }
    @RequestMapping("/admin/showdanhmuc")
    public  String showDanhmuc(DanhmucEntity danhmucEntity, Model model) {
        List<DanhmucEntity> danhmucList = danhMucRepository.findAll();
        model.addAttribute("danhmucList",danhmucList);
        return "admin/danhmuc";
    }
    @RequestMapping("/admin/adddanhmuc")
    public String adddanhmuc(DanhmucEntity danhmucEntity, Model model) {
        List<DanhmucEntity> danhMucList = danhMucRepository.findAll();
        model.addAttribute("danhMucList", danhMucList);
        return "admin/adddanhmuc";
    }
    @RequestMapping("/admin/editdanhmuc/{madanhmuc}")
    public String showdanhmuc(@PathVariable("madanhmuc") Integer madanhmuc,Model model) {
        DanhmucEntity danhmucEntity=danhMucRepository.findByMaDanhMuc(madanhmuc);
        model.addAttribute("danhmucEntity",danhmucEntity);
        return  "admin/editdanhmuc";
    }
    @RequestMapping("/test")
    public String test() {
        return  "product/productdetail";
    }
}
