/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
     Connection conectar=null;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/bd_ferreteria"+
                    "?userTimezone=true&serverTimezone=UTC","root","");
            
            System.out.println("Conexion exitosa");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
    
    public void Desconectar(){
        conectar=null;
        if(conectar==null){
            System.out.println("Conexion terminada...");
        }
    }
}
