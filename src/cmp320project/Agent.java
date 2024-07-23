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
public class Agent {
int id,salary;
String name,Password;
BLOB Picture;

    Agent(int A_id, String A_name, String A_Password,int A_salary, BLOB A_Picture){
        id = A_id;
        name = A_name;
        Password = A_Password;
        salary = A_salary;
        Picture = A_Picture;
    }
}
