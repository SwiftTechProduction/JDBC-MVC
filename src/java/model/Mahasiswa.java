/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lukas
 */
public class Mahasiswa 
{

    private String nim;
    private String nama;
    private String fakultas;
    private String jurusan;

    public Mahasiswa(String a, String b, String c, String d) 
    {
        this.nim = a;
        this.nama = b;
        this.fakultas = c;
        this.jurusan = d;
    }

    public Mahasiswa(String string, String string0, String string1) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Mahasiswa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNim() 
    {
        return nim;
    }

    public void setNim(String nim) 
    {
        this.nim = nim;
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getFakultas() 
    {
        return fakultas;
    }

    public void setFakultas(String fakultas) 
    {
        this.fakultas = fakultas;
    }

    public String getJurusan() 
    {
        return jurusan;
    }

    public void setJurusan(String jurusan) 
    {
        this.jurusan = jurusan;
    }
    
    
}
