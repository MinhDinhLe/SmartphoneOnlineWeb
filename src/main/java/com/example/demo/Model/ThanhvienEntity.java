package com.example.demo.Model;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "thanhvien", schema = "new_schema", catalog = "")
public class ThanhvienEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MaKhachHang")
    private int maKhachHang;
    @Basic
    @Column(name = "TenDangNhap")
    private String tenDangNhap;
    @Basic
    @Column(name = "MatKhau")
    private String matKhau;
    @Basic
    @Column(name = "HoTen")
    private String hoTen;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "DiaChi")
    private String diaChi;
    @Basic
    @Column(name = "DienThoai")
    private String dienThoai;

    @Basic
    @Column(name = "Loai")
    private String loai;
    @Basic
    @Column(name = "Role")
    private String role;

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

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

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }



    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThanhvienEntity that = (ThanhvienEntity) o;

        if (maKhachHang != that.maKhachHang) return false;
        if (tenDangNhap != null ? !tenDangNhap.equals(that.tenDangNhap) : that.tenDangNhap != null) return false;
        if (matKhau != null ? !matKhau.equals(that.matKhau) : that.matKhau != null) return false;
        if (hoTen != null ? !hoTen.equals(that.hoTen) : that.hoTen != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (diaChi != null ? !diaChi.equals(that.diaChi) : that.diaChi != null) return false;
        if (dienThoai != null ? !dienThoai.equals(that.dienThoai) : that.dienThoai != null) return false;
        if (loai != null ? !loai.equals(that.loai) : that.loai != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maKhachHang;
        result = 31 * result + (tenDangNhap != null ? tenDangNhap.hashCode() : 0);
        result = 31 * result + (matKhau != null ? matKhau.hashCode() : 0);
        result = 31 * result + (hoTen != null ? hoTen.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        result = 31 * result + (dienThoai != null ? dienThoai.hashCode() : 0);
        result = 31 * result + (loai != null ? loai.hashCode() : 0);
        return result;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public Collection<String> getRoles() {
        return Arrays.asList(this.role.split(","));
    }
}
