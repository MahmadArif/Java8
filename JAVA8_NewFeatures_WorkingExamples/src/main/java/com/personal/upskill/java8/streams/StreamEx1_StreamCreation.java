package com.personal.upskill.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1_StreamCreation {

	public static void main(String[] args) {
		String []name = {"BIJO","JOSHI","KARTHIK","ARUN"};
		
		/**STREAM CREATION 1:  STREAM Creation with Arrays */
		Stream<String> nameStream = Arrays.stream(name);
		nameStream.forEach(System.out::println);
		System.out.println("**********************************");
		/**STREAM CREATION 2:  STREAM Creation with Stream.of() */
		Stream<Session> sessionStream = Stream.of(new Session("JAVA 8", "session01"),
				  new Session("GIT", "session02"),
				  new Session("SpringBoot", "session03"));
		sessionStream.forEach(System.out::println);
		
		System.out.println("**********************************");
		
		/**STREAM CREATION 3:  STREAM Creation with List */
		List<Session> sessionList = Arrays.asList(new Session("JAVA 8", "session01"),
												  new Session("GIT", "session02"),
												  new Session("SpringBoot", "session03"));
		sessionList.stream().forEach(System.out::println);
		
		
	}
}


class Session{
	private String sessionName;
	private String sessionId;
	
	
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Session(String sessionName, String sessionId) {
		super();
		this.sessionName = sessionName;
		this.sessionId = sessionId;
	}
	public String getSessionName() {
		return sessionName;
	}
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	@Override
	public String toString() {
		return "Session [sessionName=" + sessionName + ", sessionId=" + sessionId + "]";
	}
	
	
	
}