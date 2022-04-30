/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import java.util.ArrayList;
import model.hoaDon;
import model.NhanVien;
import model.CTHD;
import model.nguyenLieu;
import model.thucDon;
import model.CTTD;
import model.QUAYCAFE;
import model.TaiKhoan;
/**
 *
 * @author nguye
 */
public class DAO {
    private Connection conn;
    public DAO()
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=CafeTakeAway;" + "username=sa;password=123");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean addhoaDon(hoaDon hd)
    {
        String sql = "INSERT INTO HOA_DON(MA_HD, NGAY_TAO, MA_NV, MA_QUAY)" 
                + "VALUES(?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hd.getMAHD());
            ps.setDate(2, new Date(hd.getNGAYTAO().getTime()));
            ps.setString(3, hd.getMANV());
            ps.setInt(4, hd.getMAQUAY());
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean addCTHD(CTHD cthd)
    {
        String sql = "INSERT INTO CT_HD(MA_HD, MA_TD, SO_LUONG_LY)" 
                + "VALUES(?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cthd.getMAHD());
            ps.setInt(2, cthd.getMATD());
            ps.setInt(3, cthd.getSOLUONG_LY());
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }     
        return false;
    }
      
    public ArrayList<nguyenLieu> getListNL(){
        ArrayList<nguyenLieu> list = new ArrayList<>();
        String sql = "SELECT * FROM NGUYEN_LIEU";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                nguyenLieu nl = new nguyenLieu();
                nl.setMANL(rs.getString("MA_NL"));
                nl.setTENNGUYENLIEU(rs.getString("TEN_NGUYEN_LIEU"));
                nl.setDVT(rs.getString("DVT")); 
                list.add(nl);
            }
        }catch(Exception e){
            e.printStackTrace();
        }   
        return list;
    }
    
    public ArrayList<hoaDon> getListHD(String TUNGAY, String DENNGAY){
        ArrayList<hoaDon> list = new ArrayList<>();
        String sql = "SET DATEFORMAT dmy\n" +
"SELECT * FROM HOA_DON\n" +
"WHERE NGAY_TAO BETWEEN '" + TUNGAY + "'AND '"+ DENNGAY + "'";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                hoaDon hd = new hoaDon();
                hd.setMAHD(rs.getString("MA_HD"));
                hd.setNGAYTAO(rs.getDate("NGAY_TAO"));
                hd.setMANV(rs.getString("MA_NV"));
                hd.setMAQUAY(rs.getInt("MA_QUAY"));
                
                list.add(hd);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return list;
    }
    
    public ArrayList<thucDon> getListTD(){
        ArrayList<thucDon> list = new ArrayList<>();
        String sql = "SELECT * FROM THUC_DON";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                thucDon td = new thucDon();
                td.setMATD(rs.getInt("MA_TD"));
                td.setTENDOUONG(rs.getString("TEN_DO_UONG"));
                td.setGIATIEN(rs.getInt("GIA_TIEN"));      
                list.add(td);
            }
        }catch(Exception e){
            e.printStackTrace();
        }       
        return list;
    }
    
    
    
    public ArrayList<QUAYCAFE> getListQUAYCAFE(){
        ArrayList<QUAYCAFE> list = new ArrayList<>();
        String sql = "SELECT MA_QUAY FROM QUAY_CAFE";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                QUAYCAFE quaycafe = new QUAYCAFE();
                quaycafe.setMAQUAY(rs.getInt("MA_QUAY")); 
                list.add(quaycafe);
            }
        }catch(Exception e){
            e.printStackTrace();
        }   
        return list;
    }
    
    public ArrayList<CTTD> findListTD(String TENDOUONG){
    ArrayList<CTTD> list = new ArrayList<>();
        String sql = "SELECT TEN_DO_UONG, CT_TD.MA_NL, SO_LUONG_CAN, TEN_NGUYEN_LIEU, DVT  FROM CT_TD, NGUYEN_LIEU, THUC_DON\n"
                + "WHERE CT_TD.MA_NL = NGUYEN_LIEU.MA_NL\n"
                + "AND CT_TD.MA_TD = THUC_DON.MA_TD\n"
                + "AND TEN_DO_UONG = N'" + TENDOUONG + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CTTD cttd = new CTTD();
                cttd.setTENDOUONG(rs.getString("TEN_DO_UONG"));
                cttd.setMANL(rs.getString("MA_NL"));
                cttd.setSOLUONG_CAN(rs.getFloat("SO_LUONG_CAN"));
                cttd.setTENNGUYENLIEU(rs.getString("TEN_NGUYEN_LIEU"));
                cttd.setDVT(rs.getString("DVT"));  
                list.add(cttd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        
        }
        return list;
    }
    
        public thucDon findListTDwith(String TENDOUONG){
        thucDon tddk = new thucDon();
        String sql = "SELECT * FROM THUC_DON\n" +
"WHERE TEN_DO_UONG = N'" + TENDOUONG + "'";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                
                tddk.setMATD(rs.getInt("MA_TD"));
                tddk.setTENDOUONG(rs.getString("TEN_DO_UONG"));
                tddk.setGIATIEN(rs.getInt("GIA_TIEN"));      
            }
        }catch(Exception e){
            e.printStackTrace();
        }       
        return tddk;
    }
        
    public NhanVien getNhanVien(){
        NhanVien nv = new NhanVien();
        String sql = "SELECT * FROM NHAN_VIEN WHERE MA_NV = 100";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                nv.setMA_NV(rs.getInt("MA_NV"));
                nv.setHO(rs.getString("HO"));
                nv.setTEN(rs.getString("TEN"));      
                nv.setDIA_CHI(rs.getString("DIA_CHI"));    
                nv.setSDT(rs.getString("SDT"));    
                nv.setTT_NGHI(rs.getString("TT_NGHI"));
                nv.setTEN_TK(rs.getString("TEN_TK"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }       
        return nv;
    }
    
    public boolean updateNHAN_VIEN(NhanVien nv)
    {
        String sql;
        sql = "UPDATE NHAN_VIEN \n" +
                "SET HO = N'" + nv.getHO() + "', TEN = N'" + nv.getTEN() + "', DIA_CHI = N'" + nv.getDIA_CHI() +"', SDT = '" + nv.getSDT() + "'";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }     
        return false;
    }   
    
    public boolean updateMATKHAUNV(NhanVien nv, TaiKhoan tk)
    {
        String sql;
        sql = "UPDATE TAI_KHOAN \n" +
                "SET MAT_KHAU = '" + tk.getMAT_KHAU() + "' WHERE TEN_TK = '" + nv.getTEN_TK() + "'";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        }catch(Exception e)
        {
            e.printStackTrace();
        }     
        return false;
    }  

    public TaiKhoan getTaiKhoan(NhanVien nv){
        TaiKhoan tk = new TaiKhoan();
        String sql = "SELECT * FROM TAI_KHOAN WHERE TEN_TK = '" + nv.getTEN_TK() + "'";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                tk.setTEN_TK(rs.getString("TEN_TK"));
                tk.setMAT_KHAU(rs.getString("MAT_KHAU"));
                tk.setCHUC_VU(rs.getString("CHUC_VU"));      
            }
        }catch(Exception e){
            e.printStackTrace();
        }       
        return tk;
    }

    
    public static void main(String[] args){
        new DAO();
    }
}
    

