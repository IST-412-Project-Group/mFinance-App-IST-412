/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns_Meyers;

import java.util.List;

import DesignPatterns_Meyers.PrototypePattern;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypePattern emps = new PrototypePattern();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		PrototypePattern empsNew = (PrototypePattern) emps.clone();
		PrototypePattern empsNew1 = (PrototypePattern) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

}