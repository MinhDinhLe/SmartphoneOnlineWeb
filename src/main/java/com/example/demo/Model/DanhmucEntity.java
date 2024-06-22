package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "danhmuc", schema = "new_schema", catalog = "")
public class DanhmucEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MaDanhMuc")
    private int maDanhMuc;
    @Basic
    @Column(name = "TenDanhMuc")
    private String tenDanhMuc;
    @Basic
    @Column(name = "MoTaDanhMuc")
    private String moTaDanhMuc;

    @Basic
    @Column(name = "SoLuong")
    private Integer soLuong;

    public int getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public String getMoTaDanhMuc() {
        return moTaDanhMuc;
    }

    public void setMoTaDanhMuc(String moTaDanhMuc) {
        this.moTaDanhMuc = moTaDanhMuc;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DanhmucEntity that = (DanhmucEntity) o;

        if (maDanhMuc != that.maDanhMuc) return false;
        if (tenDanhMuc != null ? !tenDanhMuc.equals(that.tenDanhMuc) : that.tenDanhMuc != null) return false;
        if (moTaDanhMuc != null ? !moTaDanhMuc.equals(that.moTaDanhMuc) : that.moTaDanhMuc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maDanhMuc;
        result = 31 * result + (tenDanhMuc != null ? tenDanhMuc.hashCode() : 0);
        result = 31 * result + (moTaDanhMuc != null ? moTaDanhMuc.hashCode() : 0);
        return result;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
}
