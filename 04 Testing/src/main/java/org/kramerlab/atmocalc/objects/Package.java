package org.kramerlab.atmocalc.objects;

import java.net.URI;
import java.util.Set;

import org.kramerlab.atmocalc.database.accessors.PackageAccessor;
import org.kramerlab.atmocalc.Permission;

public class Package extends AtmoCalcObject {
	/** Attributes */
	/**
     * 
     */
	private PackageAccessor accessor;
	/**
     * 
     */
	private Set<Dataset> datasets;
	/**
     * 
     */
	private Set<Analysis> analyses;
	/**
     * 
     */
	private Set<User> reader;
	/**
     * 
     */
	private Set<User> writer;

	/**
	 * Operation Package
	 * 
	 * @param databaseId
	 *            -
	 * @param access
	 *            -
	 * @return
	 */
	public Package(URI databaseId, Permission access) {
	}

	/**
	 * Operation getDataset
	 * 
	 * @param datasetId
	 *            -
	 * @return Dataset
	 */
	public Dataset getDataset(URI datasetId) {
		return null;
	}

	/**
	 * Operation getAnalysis
	 * 
	 * @param analysisId
	 *            -
	 * @return Analysis
	 */
	public Analysis getAnalysis(URI analysisId) {
		return null;
	}

	/**
	 * Operation isReader
	 * 
	 * @param user
	 *            -
	 * @return boolean
	 */
	public boolean isReader(User user) {
		return false;
	}

	/**
	 * Operation isWriter
	 * 
	 * @param user
	 *            -
	 * @return boolean
	 */
	public boolean isWriter(User user) {
		return false;
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
	 * Operation deleteAnalysis
	 * 
	 * @param analysis
	 *            -
	 */
	public void deleteAnalysis(Analysis analysis) {
		return;
	}

	/**
	 * Operation addAnalysis
	 * 
	 * @param analysis
	 *            -
	 */
	public Analysis addAnalysis(Analysis analysis) {
		return null;
	}
}
