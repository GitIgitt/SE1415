package org.kramerlab.atmocalc.database;

import javax.servlet.ServletContext;

public abstract class JenaTDBResourceManager extends DatabaseResourceManager {
	/**
	 * Operation init
	 * 
	 * @param ctx
	 *            -
	 */
	public void init(ServletContext ctx) {
		return;
	}

	/**
	 * Operation close
	 * 
	 */
	public void close() {
		return;
	}

	/**
	 * Operation createQueryExecutor
	 * 
	 * @return QueryExecutor
	 */
	public QueryExecutor createQueryExecutor() {
		return null;
	}

}
