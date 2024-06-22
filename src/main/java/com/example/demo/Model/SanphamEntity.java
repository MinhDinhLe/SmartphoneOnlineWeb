package com.example.demo.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "sanpham", schema = "new_schema", catalog = "")
public class SanphamEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MaSanPham")
    private int maSanPham;
    @Basic
    @Column(name = "TenSanPham")
    private String tenSanPham;
    @Basic
    @Column(name = "GiaSanPham")
    private BigDecimal giaSanPham;
    @Basic
    @Column(name = "HinhAnhSanPham")
    private String hinhAnhSanPham;
    @Basic
    @Column(name = "MoTaSanPham")
    private String moTaSanPham;

    @Basic
    @Column(name = "NgayTao")
    private Date ngayTao;
    @Basic
    @Column(name = "KichHoat")
    private Byte kichHoat;
    @Basic
    @Column(name = "MaDanhMuc")
    private Integer maDanhMuc;
    @Basic
    @Column(name = "MaNhaCungCap")
    private Integer maNhaCungCap;
    @Basic
    @Column(name = "SoLuongTon")
    private Integer soLuongTon;
    @Basic
    @Column(name = "LoaiModel")
    private String loaiModel;
    @Basic
    @Column(name = "ThongSoKyThuat")
    private String thongSoKyThuat;

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public BigDecimal getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(BigDecimal giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getHinhAnhSanPham() {
        return hinhAnhSanPham;
    }

    public void setHinhAnhSanPham(String hinhAnhSanPham) {
        this.hinhAnhSanPham = hinhAnhSanPham;
    }

    public String getMoTaSanPham() {
        return moTaSanPham;
    }

    public void setMoTaSanPham(String moTaSanPham) {
        this.moTaSanPham = moTaSanPham;
    }



    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Byte getKichHoat() {
        return kichHoat;
    }

    public void setKichHoat(Byte kichHoat) {
        this.kichHoat = kichHoat;
    }

    public Integer getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(Integer maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public Integer getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(Integer maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getLoaiModel() {
        return loaiModel;
    }

    public void setLoaiModel(String loaiModel) {
        this.loaiModel = loaiModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SanphamEntity that = (SanphamEntity) o;

        if (maSanPham != that.maSanPham) return false;
        if (tenSanPham != null ? !tenSanPham.equals(that.tenSanPham) : that.tenSanPham != null) return false;
        if (giaSanPham != null ? !giaSanPham.equals(that.giaSanPham) : that.giaSanPham != null) return false;
        if (hinhAnhSanPham != null ? !hinhAnhSanPham.equals(that.hinhAnhSanPham) : that.hinhAnhSanPham != null)
            return false;
        if (moTaSanPham != null ? !moTaSanPham.equals(that.moTaSanPham) : that.moTaSanPham != null) return false;
        if (ngayTao != null ? !ngayTao.equals(that.ngayTao) : that.ngayTao != null) return false;
        if (kichHoat != null ? !kichHoat.equals(that.kichHoat) : that.kichHoat != null) return false;
        if (maDanhMuc != null ? !maDanhMuc.equals(that.maDanhMuc) : that.maDanhMuc != null) return false;
        if (maNhaCungCap != null ? !maNhaCungCap.equals(that.maNhaCungCap) : that.maNhaCungCap != null) return false;
        if (soLuongTon != null ? !soLuongTon.equals(that.soLuongTon) : that.soLuongTon != null) return false;
        if (loaiModel != null ? !loaiModel.equals(that.loaiModel) : that.loaiModel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maSanPham;
        result = 31 * result + (tenSanPham != null ? tenSanPham.hashCode() : 0);
        result = 31 * result + (giaSanPham != null ? giaSanPham.hashCode() : 0);
        result = 31 * result + (hinhAnhSanPham != null ? hinhAnhSanPham.hashCode() : 0);
        result = 31 * result + (moTaSanPham != null ? moTaSanPham.hashCode() : 0);
        result = 31 * result + (ngayTao != null ? ngayTao.hashCode() : 0);
        result = 31 * result + (kichHoat != null ? kichHoat.hashCode() : 0);
        result = 31 * result + (maDanhMuc != null ? maDanhMuc.hashCode() : 0);
        result = 31 * result + (maNhaCungCap != null ? maNhaCungCap.hashCode() : 0);
        result = 31 * result + (soLuongTon != null ? soLuongTon.hashCode() : 0);
        result = 31 * result + (loaiModel != null ? loaiModel.hashCode() : 0);
        return result;
    }

    public String getThongSoKyThuat() {
        return thongSoKyThuat;
    }

    public void setThongSoKyThuat(String thongSoKyThuat) {
        this.thongSoKyThuat = thongSoKyThuat;
    }
}
