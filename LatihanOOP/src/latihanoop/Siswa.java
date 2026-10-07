/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanoop;

/**
 *
 * @author Lenovo
 */
class Siswa {
    public class Main {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();   // object pertama
        Siswa siswa2 = new Siswa();   // object kedua
        Siswa siswa3 = new Siswa(); 
 
        System.out.println(siswa2);
        System.out.println(siswa1);   // cetak alamat object
        System.out.println(siswa1 == siswa3); // false: dua object berbeda
}
    }
}