package org.kramerlab.atmocalc.database;

import java.util.List;

import org.kramerlab.atmocalc.objects.Dataset;

import com.hp.hpl.jena.query.QuerySolution;

public class JenaTDBQueryExecutor extends QueryExecutor
{
    /** Attributes */
    /**
     * See: https://jena.apache.org/documentation/tdb/java_api.html
     */
    private Dataset dataset;
    /**
     * Operation JenaTDBQueryExecutor
     *
     * @param dataset - 
     * @return 
     */
    public JenaTDBQueryExecutor ( Dataset dataset ){}
    
	@Override
	public List<QuerySolution> select(String query) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insert(String insertString) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(String deletionString) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public QuerySolution selectUnique(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}
}

