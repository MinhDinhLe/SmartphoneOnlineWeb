package com.example.demo.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "dondathang", schema = "new_schema", catalog = "")
public class DondathangEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MaDonDatHang")
    private int maDonDatHang;
    @Basic
    @Column(name = "MaKhachHang")
    private Integer maKhachHang;
    @Basic
    @Column(name = "EmailNguoiNhan")
    private String emailNguoiNhan;
    @Basic
    @Column(name = "DienThoaiNguoiNhan")
    private String dienThoaiNguoiNhan;
    @Basic
    @Column(name = "TenNguoiNhan")
    private String tenNguoiNhan;
    @Basic
    @Column(name = "MoTaDonDatHang")
    private String moTaDonDatHang;
    @Basic
    @Column(name = "NgayTao")
    private Date ngayTao;
    @Basic
    @Column(name = "TrangThai")
    private String trangThai;
    @Basic
    @Column(name = "KichHoat")
    private Byte kichHoat;
    @Basic
    @Column(name = "TongTien")
    private BigDecimal tongTien;

    public int getMaDonDatHang() {
        return maDonDatHang;
    }

    public void setMaDonDatHang(int maDonDatHang) {
        this.maDonDatHang = maDonDatHang;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getEmailNguoiNhan() {
        return emailNguoiNhan;
    }

    public void setEmailNguoiNhan(String emailNguoiNhan) {
        this.emailNguoiNhan = emailNguoiNhan;
    }

    public String getDienThoaiNguoiNhan() {
        return dienThoaiNguoiNhan;
    }

    public void setDienThoaiNguoiNhan(String dienThoaiNguoiNhan) {
        this.dienThoaiNguoiNhan = dienThoaiNguoiNhan;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getMoTaDonDatHang() {
        return moTaDonDatHang;
    }

    public void setMoTaDonDatHang(String moTaDonDatHang) {
        this.moTaDonDatHang = moTaDonDatHang;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Byte getKichHoat() {
        return kichHoat;
    }

    public void setKichHoat(Byte kichHoat) {
        this.kichHoat = kichHoat;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DondathangEntity that = (DondathangEntity) o;

        if (maDonDatHang != that.maDonDatHang) return false;
        if (maKhachHang != null ? !maKhachHang.equals(that.maKhachHang) : that.maKhachHang != null) return false;
        if (emailNguoiNhan != null ? !emailNguoiNhan.equals(that.emailNguoiNhan) : that.emailNguoiNhan != null)
            return false;
        if (dienThoaiNguoiNhan != null ? !dienThoaiNguoiNhan.equals(that.dienThoaiNguoiNhan) : that.dienThoaiNguoiNhan != null)
            return false;
        if (tenNguoiNhan != null ? !tenNguoiNhan.equals(that.tenNguoiNhan) : that.tenNguoiNhan != null) return false;
        if (moTaDonDatHang != null ? !moTaDonDatHang.equals(that.moTaDonDatHang) : that.moTaDonDatHang != null)
            return false;
        if (ngayTao != null ? !ngayTao.equals(that.ngayTao) : that.ngayTao != null) return false;
        if (trangThai != null ? !trangThai.equals(that.trangThai) : that.trangThai != null) return false;
        if (kichHoat != null ? !kichHoat.equals(that.kichHoat) : that.kichHoat != null) return false;
        if (tongTien != null ? !tongTien.equals(that.tongTien) : that.tongTien != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maDonDatHang;
        result = 31 * result + (maKhachHang != null ? maKhachHang.hashCode() : 0);
        result = 31 * result + (emailNguoiNhan != null ? emailNguoiNhan.hashCode() : 0);
        result = 31 * result + (dienThoaiNguoiNhan != null ? dienThoaiNguoiNhan.hashCode() : 0);
        result = 31 * result + (tenNguoiNhan != null ? tenNguoiNhan.hashCode() : 0);
        result = 31 * result + (moTaDonDatHang != null ? moTaDonDatHang.hashCode() : 0);
        result = 31 * result + (ngayTao != null ? ngayTao.hashCode() : 0);
        result = 31 * result + (trangThai != null ? trangThai.hashCode() : 0);
        result = 31 * result + (kichHoat != null ? kichHoat.hashCode() : 0);
        result = 31 * result + (tongTien != null ? tongTien.hashCode() : 0);
        return result;
    }
}
