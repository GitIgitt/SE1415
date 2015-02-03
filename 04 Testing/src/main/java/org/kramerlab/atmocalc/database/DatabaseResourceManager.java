package org.kramerlab.atmocalc.database;

import javax.servlet.ServletContext;


public abstract class DatabaseResourceManager

{
    /**
     * Operation init
     *
     * @param ctx - 
     */
    abstract public void init ( ServletContext ctx );

    /**
     * Operation close
     *
     */
    abstract public void close (  );

    /**
     * Operation createQueryExecutor
     *
     * @return QueryExecutor
     */
    abstract public QueryExecutor createQueryExecutor (  );

}

