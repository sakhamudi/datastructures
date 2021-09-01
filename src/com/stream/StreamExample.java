package com.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(1, "praveen",37);
		Employee e2 = new Employee(2, "kittu",33);
		Employee e3 = new Employee(3, "gouthem",30);
		Employee e4 = new Employee(4, "hari",40);
		
	    List<Employee> list = new ArrayList<>();
	    
	    list.add(e1);
	    list.add(e2);
	    list.add(e3);
	    list.add(e4);
	    
//		List<Employee> result = list.stream().filter(e -> e.getAge() > 35)
//				.collect(Collectors.toList());	
	    
		
//		result.stream().forEach(System.out::println);
	    
	    List<Employee> result = list.stream().sorted().collect(Collectors.toList());
	    
	    result.stream().forEach(System.out::println);
		
	}

}
