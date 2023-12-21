/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoopkasir;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class SuperClass {
    public double DagingAyam;
    public double DagingSapi;
    public double BuahMangga;
    public double BuahApel;
    public double SnackRingan;
    
    public double AirMineral;
    public double CocaCola;
    public double KopiKenangan;
    public double Sprite;
    public double Kiranti;
    
    public double Makanan;
    public double Minuman;
    public double TotalMM;
    
    public double ALLTotalMM;
    public double GetAmount(){
        Makanan = DagingAyam + DagingSapi + BuahMangga + BuahApel + SnackRingan;
        Minuman = AirMineral + CocaCola + KopiKenangan + Sprite + Kiranti;
        TotalMM = Makanan + Minuman;
        ALLTotalMM = TotalMM;
        return ALLTotalMM;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Konfirmasi jika anda ingin keluar", "Aplikasi Kasir Supermarket",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    // =============Harga Barang =============
    public double hDagingAyam = 20.000;
    public double hDagingSapi = 35.000;
    public double hBuahMangga = 6.000;
    public double hBuahApel = 3.000;
    public double hSnackRingan = 2.000;
    
    public double hAirMineral = 2.500;
    public double hCocaCola = 4.000;
    public double hKopiKenangan = 9.000;
    public double hSprite = 4.000;
    public double hKiranti = 10.000;
    
    //===========pajek==================    
    public final double pajak = 0.5;
    
    public double hitungPajak(double hPajak){
        double hitungPajak = pajak + (hPajak / 100);
        return hitungPajak;
    }
}
