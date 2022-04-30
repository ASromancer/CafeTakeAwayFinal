/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
/**
 *
 * @author nguye
 */
public class CTHD implements Serializable{
    private String MAHD;
    private int MATD, SOLUONG_LY;
    private float GIATIEN;

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMATD(int MATD) {
        this.MATD = MATD;
    }

    public int getMATD() {
        return MATD;
    }

    public void setSOLUONG_LY(int SOLUONG_LY) {
        this.SOLUONG_LY = SOLUONG_LY;
    }

    public int getSOLUONG_LY() {
        return SOLUONG_LY;
    }

    public void setGIATIEN(float GIATIEN) {
        this.GIATIEN = GIATIEN;     
    }

    public float getGIATIEN() {
        return GIATIEN;
    }
    
    
    
    
}



