package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "chitietdondathang", schema = "new_schema", catalog = "")
public class ChitietdondathangEntity {
    @Basic
    @Column(name = "MaSanPham")
    private Integer maSanPham;
    @Basic
    @Column(name = "MaDonDatHang")
    private Integer maDonDatHang;
    @Basic
    @Column(name = "SoLuong")
    private Integer soLuong;
    @Basic
    @Column(name = "MoTaChiTiet")
    private String moTaChiTiet;
    @Basic
    @Column(name = "TrangThaiChiTiet")
    private String trangThaiChiTiet;
    @Basic
    @Column(name = "XoaChiTiet")
    private Byte xoaChiTiet;
    @Id
    private Long id;

    public Integer getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(Integer maSanPham) {
        this.maSanPham = maSanPham;
    }

    public Integer getMaDonDatHang() {
        return maDonDatHang;
    }

    public void setMaDonDatHang(Integer maDonDatHang) {
        this.maDonDatHang = maDonDatHang;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTaChiTiet() {
        return moTaChiTiet;
    }

    public void setMoTaChiTiet(String moTaChiTiet) {
        this.moTaChiTiet = moTaChiTiet;
    }

    public String getTrangThaiChiTiet() {
        return trangThaiChiTiet;
    }

    public void setTrangThaiChiTiet(String trangThaiChiTiet) {
        this.trangThaiChiTiet = trangThaiChiTiet;
    }

    public Byte getXoaChiTiet() {
        return xoaChiTiet;
    }

    public void setXoaChiTiet(Byte xoaChiTiet) {
        this.xoaChiTiet = xoaChiTiet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChitietdondathangEntity that = (ChitietdondathangEntity) o;

        if (maSanPham != null ? !maSanPham.equals(that.maSanPham) : that.maSanPham != null) return false;
        if (maDonDatHang != null ? !maDonDatHang.equals(that.maDonDatHang) : that.maDonDatHang != null) return false;
        if (soLuong != null ? !soLuong.equals(that.soLuong) : that.soLuong != null) return false;
        if (moTaChiTiet != null ? !moTaChiTiet.equals(that.moTaChiTiet) : that.moTaChiTiet != null) return false;
        if (trangThaiChiTiet != null ? !trangThaiChiTiet.equals(that.trangThaiChiTiet) : that.trangThaiChiTiet != null)
            return false;
        if (xoaChiTiet != null ? !xoaChiTiet.equals(that.xoaChiTiet) : that.xoaChiTiet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maSanPham != null ? maSanPham.hashCode() : 0;
        result = 31 * result + (maDonDatHang != null ? maDonDatHang.hashCode() : 0);
        result = 31 * result + (soLuong != null ? soLuong.hashCode() : 0);
        result = 31 * result + (moTaChiTiet != null ? moTaChiTiet.hashCode() : 0);
        result = 31 * result + (trangThaiChiTiet != null ? trangThaiChiTiet.hashCode() : 0);
        result = 31 * result + (xoaChiTiet != null ? xoaChiTiet.hashCode() : 0);
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
