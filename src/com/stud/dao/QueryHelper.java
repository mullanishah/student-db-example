package com.stud.dao;

/**
 * @author Shahrukh
 * @since 27-Mar-2022
 */
public class QueryHelper {
	
	public static String queryGetStudDetails = "SELECT * FROM STUDENT";
	public static String queryAddStudDetails = "INSERT INTO STUDENT (name, course, semester, address, bday, contact, emergency)"
							+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
	
	public static String queryRemoveStudDetails = "DELETE FROM student WHERE id = ? and name = ?";
	
	public static String insertionFailed = "Student record insertion was failed!";
	public static String insertionSucceed = "Student record was inserted successfully!";
	
	public static String deletionFailed = "Student record deletion was failed!";
	public static String deletionSucceed = "Student record was deleted successfully!";
}
