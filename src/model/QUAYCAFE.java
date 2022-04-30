package model;
import java.io.Serializable;
import java.util.Date;

public class QUAYCAFE implements Serializable {

    private String DUONG, KHUPHO, PHUONG, QUAN, TINH_TP, GIATIEN;
    boolean TT_HD;
    private int MAQUAY;

    public void setDUONG(String DUONG) {
        this.DUONG = DUONG;
    }

    public String getDUONG() {
        return DUONG;
    }

    public void setGIATIEN(String GIATIEN) {
        this.GIATIEN = GIATIEN;
    }

    public String getGIATIEN() {
        return GIATIEN;
    }

    public void setKHUPHO(String KHUPHO) {
        this.KHUPHO = KHUPHO;
    }

    public String getKHUPHO() {
        return KHUPHO;
    }

    public void setMAQUAY(int MAQUAY) {
        this.MAQUAY = MAQUAY;
    }

    public int getMAQUAY() {
        return MAQUAY;
    }

    public void setPHUONG(String PHUONG) {
        this.PHUONG = PHUONG;
    }

    public String getPHUONG() {
        return PHUONG;
    }

    public void setQUAN(String QUAN) {
        this.QUAN = QUAN;
    }

    public String getQUAN() {
        return QUAN;
    }

    public void setTINH_TP(String TINH_TP) {
        this.TINH_TP = TINH_TP;
    }

    public String getTINH_TP() {
        return TINH_TP;
    }

    public void setTT_HD(boolean TT_HD) {
        this.TT_HD = TT_HD;
    }     
}

    
 
