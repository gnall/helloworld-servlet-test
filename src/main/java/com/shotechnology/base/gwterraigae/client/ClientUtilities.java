package com.shotechnology.base.gwterraigae.client;

public class ClientUtilities 
{
	public native static void stringifyAndConsoleLog(String message) /*-{
	
		var message1 = JSON.stringify(message);
		
		console.log(message1);
		
	}-*/;
	
	public native static void consoleLog(String message) /*-{
		console.log(message);
	}-*/;

	public native static void consoleError(String message) /*-{
		console.error(message);
	}-*/;
}