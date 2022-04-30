package model;
import java.io.Serializable;
import java.util.Date;

public class hoaDon implements Serializable {

    private String MAHD, MANV;
    private int MAQUAY;
    private Date NGAYTAO;// dd/mm/yyyy

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMAQUAY(int MAQUAY) {
        this.MAQUAY = MAQUAY;
    }

    public int getMAQUAY() {
        return MAQUAY;
    }

    public void setNGAYTAO(Date NGAYTAO) {
        this.NGAYTAO = NGAYTAO;
    }

    public Date getNGAYTAO() {
        return NGAYTAO;
    }
    
}
