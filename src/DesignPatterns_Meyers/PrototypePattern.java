/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns_Meyers;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Evan
 */


public class PrototypePattern implements Cloneable{

	private List<String> empList;
	
	public PrototypePattern(){
		empList = new ArrayList<String>();
	}
	
	public PrototypePattern(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Evan");
		empList.add("Stone");
		empList.add("Nick");
		empList.add("Spencer");
                empList.add("David");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new PrototypePattern(temp);
	}
	
 }

