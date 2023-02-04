package com.example.Location.Utility;

public interface EmailService {
	public default void sendSimpleMessage(String to, String subject, String text) {
		
	}
}
