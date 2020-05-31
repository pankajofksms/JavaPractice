package com.practice.pluralsightCourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M3MapExample {

	public static void main(String[] args) {
		M1Person p1 = new M1Person("FirstName1", "LastName1", 20);
		M1Person p2 = new M1Person("FirstName2", "LastName2", 21);
		M1Person p3 = new M1Person("FirstName3", "LastName3", 22);
		M1Person p4 = new M1Person("FirstName4", "LastName4", 23);
		M1Person p5 = new M1Person("FirstName5", "LastName5", 24);
		M1Person p6 = new M1Person("FirstName6", "LastName6", 25);

		M3City newYork = new M3City("New York");
		M3City shanghai = new M3City("Shanghai");
		M3City paris = new M3City("Paris");

		Map<M3City, List<M1Person>> map = new HashMap<M3City, List<M1Person>>();

		System.out.println("Values for Paris: " + map.getOrDefault(paris, Collections.EMPTY_LIST));

		map.putIfAbsent(paris, new ArrayList<>());
		map.get(paris).add(p1);

		map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p2);

		System.out.println("Values for Paris: " + map.get(paris));
		System.out.println("Values for New York: " + map.get(newYork));

		map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p3);
		System.out.println("Values for New York: " + map.get(newYork));

		// Merge example

		Map<M3City, List<M1Person>> map1 = new HashMap<M3City, List<M1Person>>();
		map1.computeIfAbsent(paris, city -> new ArrayList<>()).add(p1);
		map1.computeIfAbsent(paris, city -> new ArrayList<>()).add(p2);

		Map<M3City, List<M1Person>> map2 = new HashMap<M3City, List<M1Person>>();
		map2.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p3);
		map2.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p4);

		map2.forEach((city, people) -> map1.merge(city, people, (oldValue, newValue) -> {
			oldValue.addAll(newValue);
			return oldValue;
		}));
		System.out.println("Merge values for Map2");
		map2.forEach((key,value)-> System.out.println("Key: "+key+ " ,Value: "+ value));

		System.out.println("Merge values for Map1");
		map1.forEach((key,value)-> System.out.println("Key: "+key+ " ,Value: "+ value));
		
	}

	public void mergeTwoMaps() {
		Map<String, List<M1Person>> map1 = new HashMap<>();
		Map<String, List<M1Person>> map2 = new HashMap<>();

		map2.forEach((key, value) -> map1.merge(key, value, (existingPeople, newPeople) -> {
			existingPeople.addAll(newPeople);
			return existingPeople;
		}));
	}

}
