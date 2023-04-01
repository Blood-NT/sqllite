package com.example.sqllite;





public class SanPham  {

    private String Ma, Ten, Soluong;

    public SanPham() { }

    public SanPham(String Ma, String Ten, String Soluong) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Soluong = Soluong;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getSoluong() {
        return Soluong;
    }

    public void setSoluong(String Soluong) {
        this.Soluong = Soluong;
    }
}

