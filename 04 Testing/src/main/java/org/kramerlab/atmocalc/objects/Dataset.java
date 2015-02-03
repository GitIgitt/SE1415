package org.kramerlab.atmocalc.objects;

import java.util.List;

import org.kramerlab.atmocalc.database.accessors.DatasetAccessor;

public class Dataset extends AtmoCalcObject {
	/** Attributes */
	/**
     * 
     */
	public DatasetAccessor accessor;

	/**
	 * Operation getColumnNames
	 * 
	 * @return List<String>
	 */
	public List<String> getColumnNames() {
		return null;
	}

	/**
	 * Operation copy
	 * 
	 * @return Dataset
	 */
	public Dataset copy() {
		return null;
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
	 * Operation rowCount
	 * 
	 * @return int
	 */
	public int rowCount() {
		return 0;
	}

	/**
	 * Operation colCount
	 * 
	 * @return int
	 */
	public int colCount() {
		return 0;
	}

	/**
	 * Operation update
	 * 
	 * @param dataset
	 *            -
	 */
	public void update(Dataset dataset) {
	}
}
