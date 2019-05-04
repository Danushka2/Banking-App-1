package com.bank.service;

import java.io.*;
import java.util.*;
import java.util.Date;
import javax.servlet.*;
import java.text.*;
import java.sql.*;
import com.bank.dao.*;
import com.bank.model.*;


public class CreateCustomerAcc implements iCreateAccount{

    private String userID="ccc3456";
    private String name;
    private String initials;
    private String nic;
    private String address;
    private String city;
    private int pcode;
    private String bday;
    private String gender;
    private int contact;
    private String Cemail;
    private String password;
    private String createDateNtime = "2019-05-09 00.00.00";
    private int accNo;

    public void setName(String Name){
        name = Name;
    };

    public void setInitials(String Initials){
        initials = Initials;
    };
    
    public void setNIC(String NIC){
        nic = NIC;
    };
    
    public void setAddress(String Address){
        address = Address;
    };
    
    public void setCity(String City){
        city = City;
    };
    
    public void setBday(String Bday){
        bday = Bday;
    };
    
    public void setGender(String Gender){
        gender = Gender;
    };
    
    public void setContact(int Contact){
        contact = Contact;
    };
    
    public void setPcode(int Pcode){
        pcode = Pcode;
    };
    
    public void setEmail(String Email){
        Cemail = Email;
    };
    
    public void setPassword(String Password){
        password = Password;
    };
    
    public void setCreateDate(){
        Date dNow = new Date();
        SimpleDateFormat ft =  new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss");
        String createDateNtime = ft.format(dNow);
    };
    
    public void createUserID(){
        Random rand = new Random();
		int random = rand.nextInt((999999 - 100000) + 1) + 100000;
        String userID = "C"+random;
    };

    public void createAccNo(){
    	Random rand = new Random();
        int randomACC = rand.nextInt((999999999 - 100000000) + 1) + 100000000;
        int accNo = randomACC;
    };
    
    public void updateDB(){

    	try {
    	
        dbConnection con = new dbConnection();
        Connection conn = con.toConnect();
        

        Statement st = conn.createStatement();
			
        String sql = "INSERT INTO customer(custID,fullName,initials,NIC,address,city,postalCode,Birthday,gender,tpNO,email,password,createDate,accountNumber) VALUES ('"+userID+"', '"+name+"', '"+initials+"', '"+nic+"', '"+address+"','"+city+"', '"+pcode+"','"+bday+"', '"+gender+"', '"+contact+"', '"+Cemail+"', '"+password+"', '"+createDateNtime+"', '"+accNo+"')";
					
        st.executeUpdate(sql);

    	}catch(Exception e) {
    		
    	}

        
    };
    
    public String updateCheck(){

    	try {
    	
        dbConnection con = new dbConnection();
        Connection conn = con.toConnect();
        

        Statement st = conn.createStatement();
			
        String sql = "INSERT INTO customer(custID,fullName,initials,NIC,address,city,postalCode,gender,tpNO,email,password,accountNumber,Birthday,createDate) VALUES ('"+userID+"', '"+name+"', '"+initials+"', '"+nic+"', '"+address+"','"+city+"', '"+pcode+"', '"+gender+"', '"+contact+"', '"+Cemail+"', '"+password+"', '"+accNo+"', '"+bday+"', '"+createDateNtime+"')";
					
        st.executeUpdate(sql);
        System.out.println("Update s ");

    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	
		return "update s ";

        
    };
    
    public String print() {
//    	System.out.println(userID);
//    	System.out.println(name);
//    	System.out.println(initials);
    	String test = userID+" "+name+" " + initials+" "+nic+" ";
    	return (test);
    }

}
