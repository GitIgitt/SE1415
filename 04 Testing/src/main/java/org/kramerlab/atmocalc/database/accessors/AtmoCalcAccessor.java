package org.kramerlab.atmocalc.database.accessors;

import java.net.URI;

import org.kramerlab.atmocalc.Permission;

public abstract class AtmoCalcAccessor

{
	/** Attributes */
	/**
     * 
     */
	public URI databaseId;
	/**
     * 
     */
	public Permission access;

	/**
	 * Operation getName
	 * 
	 * @return String
	 */
	public String getName() {
		return null;
	}

	/**
	 * Operation setName
	 * 
	 * @param newName
	 *            -
	 */
	public void setName(String newName) {
		return;
	}

	/**
	 * Operation delete
	 * 
	 */
	public void delete() {
		return;
	}

}
