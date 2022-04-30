package model;
import java.io.Serializable;
import java.util.Date;

public class nguyenLieu implements Serializable {

    private String MANL, TENNGUYENLIEU, DVT;

    public void setMANL(String MANL) {
        this.MANL = MANL;
    }

    public String getMANL() {
        return MANL;
    }

    public void setTENNGUYENLIEU(String TENNGUYENLIEU) {
        this.TENNGUYENLIEU = TENNGUYENLIEU;
    }

    public String getTENNGUYENLIEU() {
        return TENNGUYENLIEU;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public String getDVT() {
        return DVT;
    }
}
