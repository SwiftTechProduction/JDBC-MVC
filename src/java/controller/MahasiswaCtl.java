/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import util.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Mahasiswa;

/**
 *
 * @author Lukas
 */
public class MahasiswaCtl 
{

    private Connection conn;
    private ResultSet result;
    private PreparedStatement ps;

    public MahasiswaCtl() 
    {
        try 
        {
            conn = Conn.getConnection();
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
    }

    public List<Mahasiswa> getAllMahasiswa() 
    {
        List<Mahasiswa> mahasiswa = new ArrayList();
        Mahasiswa mhs;

        try 
        {
            ps = conn.prepareStatement("SELECT * FROM data_mhs");
            result = ps.executeQuery();

            while (result.next()) 
            {
                mhs = new Mahasiswa(
                        result.getString("nim"),
                        result.getString("nama"),
                        result.getString("fakultas"),
                        result.getString("jurusan"));

                mahasiswa.add(mhs);
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }

        return mahasiswa;
    }
    
    public void insertMahasiswa(Mahasiswa mahasiswa) 
    {
        try 
        {
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT into data_mhs(nim, nama, fakultas, jurusan) values (?, ?, ?, ? )");
            // Parameters start with 1
            preparedStatement.setString(1, mahasiswa.getNim());
            preparedStatement.setString(2, mahasiswa.getNama());
            preparedStatement.setString(3, mahasiswa.getFakultas());
            preparedStatement.setString(4, mahasiswa.getJurusan());
            preparedStatement.executeUpdate();

        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void deleteMahasiswa(String nim) 
    {
        try 
        {
            PreparedStatement preparedStatement = conn
                    .prepareStatement("DELETE from data_mhs where nim = ?");
            // Parameters start with 1
            preparedStatement.setString(1, nim);
            preparedStatement.executeUpdate();

        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void updateMahasiswa(Mahasiswa mahasiswa) 
    {
        try 
        {
            PreparedStatement preparedStatement = conn
                    .prepareStatement("UPDATE data_mhs set nama = ?, fakultas = ?, jurusan = ?" +
                            "where nim = ?");
            // Parameters start with 1
            preparedStatement.setString(1, mahasiswa.getNama());
            preparedStatement.setString(2, mahasiswa.getFakultas());
            //preparedStatement.setDate(3, new java.sql.Date(user.getDob().getTime()));
            preparedStatement.setString(3, mahasiswa.getJurusan());
            preparedStatement.setString(4, mahasiswa.getNim());
            preparedStatement.executeUpdate();

        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public Mahasiswa getMahasiswaByNim(String nim) 
    {
        Mahasiswa mahasiswa = new Mahasiswa();
        try 
        {
            PreparedStatement preparedStatement = conn.
                    prepareStatement("SELECT * FROM data_mhs where nim = ?");
            preparedStatement.setString(1, nim);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) 
            {
                mahasiswa.setNim(rs.getString("nim"));
                mahasiswa.setNama(rs.getString("nama"));
                mahasiswa.setFakultas(rs.getString("fakultas"));
                //user.setDob(rs.getDate("dob"));
                mahasiswa.setJurusan(rs.getString("jurusan"));
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }

        return mahasiswa;
    }

    public void insertMahasiswa(String nim) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
