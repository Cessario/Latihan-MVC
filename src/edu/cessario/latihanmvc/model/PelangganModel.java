/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cessario.latihanmvc.model;

import edu.cessario.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *Nama: Cessario Sheva Lakita Purwa Adidjaya
 *Nim: 10117063
 *Kelas: IF-2
 */
public class PelangganModel {
    private String nama;
    private String email;
    private String noTelp;
    
    private PelangganListener PelangganListener;

    public PelangganListener getPelangganListener() {
        return PelangganListener;
    }

    public void setPelangganListener(PelangganListener PelangganListener) {
        this.PelangganListener = PelangganListener;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnchange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnchange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnchange();
    }
    
    protected void fireOnchange(){
        if(PelangganListener != null){
            PelangganListener.onChange(this);
        }
    }
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
        
    }
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhsail Dismpan");
        resetForm();
    }
    
    
}
