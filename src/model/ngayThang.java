package model;
import java.io.Serializable;
import java.util.Date;

public class ngayThang implements Serializable {
    private Date TUNGAY;
    private Date DENNGAY;

    public void setTUNGAY(Date TUNGAY) {
        this.TUNGAY = TUNGAY;
    }

    public Date getTUNGAY() {
        return TUNGAY;
    }

    public void setDENNGAY(Date DENNGAY) {
        this.DENNGAY = DENNGAY;
    }

    public Date getDENNGAY() {
        return DENNGAY;
    }
}
