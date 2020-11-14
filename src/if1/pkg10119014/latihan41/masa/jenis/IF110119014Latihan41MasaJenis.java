/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan41.masa.jenis;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * kelas: IF-1
 * NIM  : 10119014
 */
public class IF110119014Latihan41MasaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Kubus kubus = new kubus ();
    
    kubus.setSisi(5);
    kubus.setMasa(250);
    int sisi = kubus.getSisi();
    int massa = kubus.getMassa();
    int volume = kubus.hitungVolume(sisi);
    
    System.out.println("=====Massa Jenis Kubus=====");
    System.out.println("Sisi : " + sisi);
    System.out.println("Massa : " + massa);
    System.out.println();
    System.out.println("=====Hasil Perhitungan=====");
    System.out.println("Volume : " + volume);
    System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(massa,volume);}
    
}
