package com.zensar.entity;


import java.lang.reflect.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class className = Class.forName("com.zensar.entity.Employee");
			Employee e = (Employee)className.newInstance();
			
			Method[] methods = className.getMethods();
			Constructor[] constructor = className.getConstructors();
			Field[] fields = className.getFields();
			Field[] declaredFields=className.getDeclaredFields();
			
			
			for(int i=0;i<methods.length;i++){
				
				System.out.println(methods[i]);
			}
			System.out.println("\n");
			
			for(int i=0;i<constructor.length;i++){
				
				System.out.println(constructor[i]);
			}
			System.out.println("\n");
			
			for(int i=0;i<fields.length;i++){
				
				System.out.println(fields[i]);
			}
			
			for(int i=0;i<declaredFields.length;i++){
				
				System.out.println(declaredFields[i]);
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
