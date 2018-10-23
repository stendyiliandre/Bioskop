/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

/**
 *
 * @author Kevin Suwanda, Stendy Iliandre, William Johann
 */
public abstract class User implements Info {
    public String id;
    public String nama;
    public String tlp;
    public String ttl;
    public String email;
    public String password;
    public int tipe;   //(0 = ADMIN ; 1 = Member)
    
    public void login (){
        
    }
    
}
