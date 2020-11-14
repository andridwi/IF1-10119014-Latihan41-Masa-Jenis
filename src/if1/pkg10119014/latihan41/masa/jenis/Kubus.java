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
class Kubus {
    private int sisi, massa;
    public int getSisi(){
        return this.sisi;
    }
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public int getMassa(){
        return this.massa;
    }
    public void setMassa(int massa){
        this.massa = massa;
    }
    public int hitungvolume(int parSisi){
        return parSisi * parSisi * parSisi;
        
    }
    public int hitungMassaJenis(int parMassa, int volume){
        return parMassa / volume;
    }
}
