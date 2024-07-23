/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmp320project;

import oracle.sql.BLOB;

/**
 *
 * @author Yo200
 */



public class Admin {
int id;
String name,Password;
BLOB Picture;

    Admin(int A_id, String A_name, String A_Password, BLOB A_Picture){
        id = A_id;
        name = A_name;
        Password = A_Password;
        Picture = A_Picture;
    }
    Admin()
    {
        id = 0;
        name = "";
        Password = "";
        Picture = null;
    }
}
