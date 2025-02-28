package crudoperation;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.Transaction;

public interface InsertUserData {
	

	void insertdata(Session s, Transaction tx) throws ParseException;

}
