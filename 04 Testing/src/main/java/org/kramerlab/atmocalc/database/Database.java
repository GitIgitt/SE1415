package org.kramerlab.atmocalc.database;

import javax.servlet.ServletContext;


public abstract class Database

{
    /** Attributes */
    /**
     * 
     */
    private static ThreadLocal<DatabaseResourceManager> databaseResourceManager;
    
    /**
     * Operation init
     *
     * @param ctx - 
     */
	public static void init(ServletContext ctx ){
    	return;
    }

    /**
     * Operation close
     *
     */
    public static void close (  ){
    	return;
    }

    /**
     * Operation createQueryExecutor
     *
     * @return QueryExecutor
     */
    public static QueryExecutor createQueryExecutor (  ){
    	return null;
    }

}

