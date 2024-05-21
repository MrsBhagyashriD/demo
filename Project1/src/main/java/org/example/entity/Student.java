package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.sql.SQLOutput;

@Data
public class Student {

    private int id;
    private  String name;
    private  String contact;
    private Address address;
    
//    public void init() {
//    	System.out.println("initiliaze method");
//    }
//    
//    public void destory() {
//    	System.out.println("destory method");
//    }


    public Student(String name, String contact) {
        this.name = name;
        this.contact = contact;
        System.out.println("initializing doubble argument constructor");
    }

    public Student(String name) {
        System.out.println("initializing single argument constructor");
        this.name = name;
    }


    public Student(){
        System.out.println("default argument costructor ");
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}

    
}
