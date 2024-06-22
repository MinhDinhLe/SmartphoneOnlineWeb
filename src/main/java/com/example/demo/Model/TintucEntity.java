package com.example.demo.Model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "tintuc", schema = "new_schema", catalog = "")
public class TintucEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MaTinTuc")
    private int maTinTuc;
    @Basic
    @Column(name = "TieuDe")
    private String tieuDe;
    @Basic
    @Column(name = "NoiDungNgan")
    private String noiDungNgan;
    @Basic
    @Column(name = "NoiDung")
    private String noiDung;
    @Basic
    @Column(name = "NoiDungHTML")
    private String noiDungHtml;
    @Basic
    @Column(name = "HinhAnh")
    private String hinhAnh;
    @Basic
    @Column(name = "NgayTao")
    private Date ngayTao;
    @Basic
    @Column(name = "KichHoat")
    private Byte kichHoat;

    public int getMaTinTuc() {
        return maTinTuc;
    }

    public void setMaTinTuc(int maTinTuc) {
        this.maTinTuc = maTinTuc;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDungNgan() {
        return noiDungNgan;
    }

    public void setNoiDungNgan(String noiDungNgan) {
        this.noiDungNgan = noiDungNgan;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getNoiDungHtml() {
        return noiDungHtml;
    }

    public void setNoiDungHtml(String noiDungHtml) {
        this.noiDungHtml = noiDungHtml;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TintucEntity that = (TintucEntity) o;

        if (maTinTuc != that.maTinTuc) return false;
        if (tieuDe != null ? !tieuDe.equals(that.tieuDe) : that.tieuDe != null) return false;
        if (noiDungNgan != null ? !noiDungNgan.equals(that.noiDungNgan) : that.noiDungNgan != null) return false;
        if (noiDung != null ? !noiDung.equals(that.noiDung) : that.noiDung != null) return false;
        if (noiDungHtml != null ? !noiDungHtml.equals(that.noiDungHtml) : that.noiDungHtml != null) return false;
        if (hinhAnh != null ? !hinhAnh.equals(that.hinhAnh) : that.hinhAnh != null) return false;
        if (ngayTao != null ? !ngayTao.equals(that.ngayTao) : that.ngayTao != null) return false;
        if (kichHoat != null ? !kichHoat.equals(that.kichHoat) : that.kichHoat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maTinTuc;
        result = 31 * result + (tieuDe != null ? tieuDe.hashCode() : 0);
        result = 31 * result + (noiDungNgan != null ? noiDungNgan.hashCode() : 0);
        result = 31 * result + (noiDung != null ? noiDung.hashCode() : 0);
        result = 31 * result + (noiDungHtml != null ? noiDungHtml.hashCode() : 0);
        result = 31 * result + (hinhAnh != null ? hinhAnh.hashCode() : 0);
        result = 31 * result + (ngayTao != null ? ngayTao.hashCode() : 0);
        result = 31 * result + (kichHoat != null ? kichHoat.hashCode() : 0);
        return result;
    }
}
