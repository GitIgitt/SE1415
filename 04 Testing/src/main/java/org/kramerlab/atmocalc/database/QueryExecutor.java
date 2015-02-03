package org.kramerlab.atmocalc.database;

import java.util.List;

import com.hp.hpl.jena.query.QuerySolution;


public abstract class QueryExecutor

{
    /**
     * Operation select
     *
     * @param query - 
     * @return List<QuerySolution>
     */
    abstract public List<QuerySolution> select ( String query );

    /**
     * Operation insert
     *
     * @param insertString - 
     */
    abstract public void insert ( String insertString );

    /**
     * Operation delete
     *
     * @param deletionString - 
     */
    abstract public void delete ( String deletionString );

    /**
     * Operation selectUnique
     *
     * @param queryString - 
     * @return QuerySolution
     */
    abstract public QuerySolution selectUnique ( String queryString );

}

