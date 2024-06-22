package com.example.demo.Controller;

import com.example.demo.Repository.DanhmucRepo;
import com.example.demo.Repository.SanphamRepo;
import com.example.demo.Model.DanhmucEntity;
import com.example.demo.Model.SanphamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    SanphamRepo sanphamRepo;
    @Autowired
    DanhmucRepo danhmucRepo;
    @RequestMapping("/productdetails/{masanpham}")
    public String showproductdetails(@PathVariable("masanpham") Integer masanpham, Model model) {
        SanphamEntity sanpham = sanphamRepo.findByMaSanPham(masanpham);
        DanhmucEntity danhmuc = danhmucRepo.findByMaDanhMuc(sanpham.getMaDanhMuc());
        if (sanpham == null) {
            // Xử lý nếu không tìm thấy sản phẩm với masanpham tương ứng
            return "redirect:/"; // Chuyển hướng đến trang chủ hoặc trang thông báo lỗi
        }
        String[] a = sanpham.getThongSoKyThuat().split(",");
        List<String> keyList = new ArrayList<>();
        List<String> valueList = new ArrayList<>();
        for (String line : a) {
            String[] parts = line.split(":", 2); // Split each line into key and value
            if (parts.length == 2) {
                String key = parts[0].trim();
                String value = parts[1].trim();
                keyList.add(key);
                valueList.add(value);
            }
        }
        model.addAttribute("keyList", keyList);
        model.addAttribute("valueList", valueList);

        model.addAttribute("danhmuc", danhmuc);
        model.addAttribute("sanpham", sanpham);
        return "product/productdetail";
    }
    @RequestMapping("/product")
    public String showproduct(SanphamEntity sanphamEntity,Model model) {


        List<SanphamEntity> sanphamlist=sanphamRepo.findAll();
        model.addAttribute("sanphamlist",sanphamlist);
        List<DanhmucEntity> danhmuclist=danhmucRepo.findAll();
        model.addAttribute("danhmuclist",danhmuclist);
        return "product/productUser";
    }
    @RequestMapping("/showtheodanhmuc/{madanhmuc}")
    public String showtheodanhmuc(@PathVariable("madanhmuc") Integer madanhmuc, Model model) {

        DanhmucEntity danhmuc = danhmucRepo.findByMaDanhMuc(madanhmuc);
        List<DanhmucEntity> danhmuclist=danhmucRepo.findAll();
        List<SanphamEntity> sanphamlist = sanphamRepo.findByMaDanhMuc(danhmuc.getMaDanhMuc());
        if (danhmuc == null) {
            // Xử lý nếu không tìm thấy sản phẩm với masanpham tương ứng
            return "redirect:/"; // Chuyển hướng đến trang chủ hoặc trang thông báo lỗi
        }
        model.addAttribute("danhmuc", danhmuc);
        model.addAttribute("sanphamlist", sanphamlist);

        model.addAttribute("danhmuclist",danhmuclist);
        return "product/productDanhMuc";
    }
}
