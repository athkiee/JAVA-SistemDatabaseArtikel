/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author windows
 */
public class koneksi {


    Connection con;
    public koneksi(){
        String id, pass, driver, url;
        id="root";
        pass="";
        driver="com.mysql.cj.jdbc.Driver";
        url="jdbc:mysql://localhost:3306/tubes_pbo?userTimezone=true&serverTimezone=UTC";
        try{
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(url,id,pass);
            if(con==null){
                System.out.println("Koneksi Gagal");
            }
            else{
                System.out.println("Koneksi Berhasil");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[]args){
        koneksi k = new koneksi();
    }
}
