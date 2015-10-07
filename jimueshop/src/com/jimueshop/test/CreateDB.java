package com.jimueshop.test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CreateDB {
	public static void main(String[] args) throws ParseException {
		Configuration config = new Configuration().configure() ;
		SchemaExport export = new SchemaExport(config) ;
		export.create( true, true ) ;
	}
}
