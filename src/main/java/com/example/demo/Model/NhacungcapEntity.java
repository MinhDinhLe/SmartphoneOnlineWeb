package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "nhacungcap", schema = "new_schema", catalog = "")
public class NhacungcapEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MaNhaCungCap")
    private int maNhaCungCap;
    @Basic
    @Column(name = "TenNhaCungCap")
    private String tenNhaCungCap;
    @Basic
    @Column(name = "GhiChu")
    private String ghiChu;
    @Basic
    @Column(name = "KichHoat")
    private Byte kichHoat;

    public int getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(int maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Byte getKichHoat() {
        return kichHoat;
    }

    public void setKichHoat(Byte kichHoat) {
        this.kichHoat = kichHoat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NhacungcapEntity that = (NhacungcapEntity) o;

        if (maNhaCungCap != that.maNhaCungCap) return false;
        if (tenNhaCungCap != null ? !tenNhaCungCap.equals(that.tenNhaCungCap) : that.tenNhaCungCap != null)
            return false;
        if (ghiChu != null ? !ghiChu.equals(that.ghiChu) : that.ghiChu != null) return false;
        if (kichHoat != null ? !kichHoat.equals(that.kichHoat) : that.kichHoat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maNhaCungCap;
        result = 31 * result + (tenNhaCungCap != null ? tenNhaCungCap.hashCode() : 0);
        result = 31 * result + (ghiChu != null ? ghiChu.hashCode() : 0);
        result = 31 * result + (kichHoat != null ? kichHoat.hashCode() : 0);
        return result;
    }
}
