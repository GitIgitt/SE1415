package org.kramerlab.atmocalc.database.accessors;

import java.net.URI;
import java.util.Set;

import org.kramerlab.atmocalc.Permission;
import org.kramerlab.atmocalc.objects.Analysis;
import org.kramerlab.atmocalc.objects.Dataset;

public class PackageAccessor extends AtmoCalcAccessor {
	/**
	 * Operation PackageAccessor
	 * 
	 * @param databaseId
	 *            -
	 * @param access
	 *            -
	 * @return
	 */
	public PackageAccessor(URI databaseId, Permission access) {
	}

	/**
	 * Operation saveAnalysis
	 * 
	 * @param analysis
	 *            -
	 * @return Analysis
	 */
	public Analysis saveAnalysis(Analysis analysis) {
		return null;
	}

	/**
	 * Operation getAnalysis
	 * 
	 * @param databaseId
	 *            -
	 * @return Analysis
	 */
	public Analysis getAnalysis(URI databaseId) {
		return null;
	}

	/**
	 * Operation getAllAnalyses
	 * 
	 * @return
	 */
	public Set<Analysis> getAllAnalyses() {
		return null;
	}

	/**
	 * Operation deleteAllAnalyses
	 * 
	 */
	public void deleteAllAnalyses() {
	}

	/**
	 * Operation getDataset
	 * 
	 * @param databaseId
	 *            -
	 * @return Dataset
	 */
	public Dataset getDataset(URI databaseId) {
		return null;
	}

	/**
	 * Operation getAllDatasets
	 * 
	 * @return Set<Dataset>
	 */
	public Set<Dataset> getAllDatasets() {
		return null;
	}

	/**
	 * Operation deleteDataset
	 * 
	 * @param dataset
	 *            -
	 */
	public void deleteDataset(Dataset dataset) {
	}

	/**
	 * Operation deleteAllDatasets
	 * 
	 */
	public void deleteAllDatasets() {
	}

	/**
	 * Operation addAnalysis
	 * 
	 * @return analysis
	 * 
	 */
	public Analysis addAnalysis(Analysis analysis) {
		return null;
	}
}
