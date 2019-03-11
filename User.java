package pkg;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tlotl
 */
public class User {
    
    private String no;
    private String name;
    private String address;
    private String telephone;
    private String thing;
    
    
    public User(String no,String name,String address,String telephone,String thing)
    {
        this.no = no;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.thing = thing;
    }
    
    public String getNo()
    {
        return no;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getTelephone()
    {
        return telephone;
    
    }
    
     public String getThing()
    {
        return thing;
    
    }
}

