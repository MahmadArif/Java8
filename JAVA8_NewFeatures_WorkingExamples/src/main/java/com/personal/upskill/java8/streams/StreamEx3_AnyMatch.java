package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamEx3_AnyMatch {

	public static void main(String[] args) {
		List<Session> sessionList = Arrays.asList(new Session("JAVA 8", "session01"),
				  new Session("GIT", "session02"),
				  new Session("SpringBoot", "session03"));
		
		boolean containsWrdSq1 = sessionList.stream().anyMatch(session->session.getSessionName().contains("Spr"));
		
		System.out.println("The Session list contains 'Spr' = "+containsWrdSq1);
	}
}
