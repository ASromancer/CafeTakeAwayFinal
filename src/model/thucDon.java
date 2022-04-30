package model;
import java.io.Serializable;
import java.util.Date;

public class thucDon implements Serializable {

    private String TENDOUONG;
    private int GIATIEN;
    private int MATD;

    public void setMATD(int MATD) {
        this.MATD = MATD;
    }

    public int getMATD() {
        return MATD;
    }

    public void setTENDOUONG(String TENDOUONG) {
        this.TENDOUONG = TENDOUONG;
    }

    public String getTENDOUONG() {
        return TENDOUONG;
    }

    public void setGIATIEN(int GIATIEN) {
        this.GIATIEN = GIATIEN;
    }

    public int getGIATIEN() {
        return GIATIEN;
    }

    

    
    
}
