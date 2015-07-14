/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guestbook;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;

@Named("user")
@SessionScoped
/**
 *
 * @author Vanesh
 */
public class NameBean implements Serializable{
     public String name="Гость";
     private  String password;
     
     public String getName(){return name;}
     public void   setName( String newvalue){newvalue=name;}
    
}
