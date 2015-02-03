package org.kramerlab.atmocalc.database.accessors;

import java.net.URI;
import java.util.List;

import org.kramerlab.atmocalc.Permission;
import org.kramerlab.atmocalc.objects.Dataset;

public class DatasetAccessor extends AtmoCalcAccessor {
	/**
	 * Operation DatasetAccessor
	 * 
	 * @param databaseId
	 *            -
	 * @param access
	 *            -
	 * @return
	 */
	public DatasetAccessor(URI databaseId, Permission access) {
	}

	/**
	 * Operation update
	 * 
	 * @param dataset
	 *            -
	 */
	public void update(Dataset dataset) {
	}

	/**
	 * Operation getRawData
	 * 
	 * @return String
	 */
	public String getRawData() {
		return "";
	}

	/**
	 * Operation getRowCount
	 * 
	 * @return int
	 */
	public int getRowCount() {
		return 0;
	}

	/**
	 * Operation getColCount
	 * 
	 * @return int
	 */
	public int getColCount() {
		return 0;
	}

	/**
	 * Operation getColumnNames
	 * 
	 * @return List<String>
	 */
	public List<String> getColumnNames() {
		return null;
	}
}
