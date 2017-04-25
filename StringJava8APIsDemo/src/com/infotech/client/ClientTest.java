package com.infotech.client;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		String joinedStr = String.join("-", "Hello","India",null);
		System.out.println(joinedStr);
		
		List<String> names = new ArrayList<>();
		names.add("KK");
		names.add("PK");
		names.add("SK");
		names.add("MK");
		names.add("KK");
		String joinedString = String.join(",", names);
		System.out.println(joinedString);
	}
}
