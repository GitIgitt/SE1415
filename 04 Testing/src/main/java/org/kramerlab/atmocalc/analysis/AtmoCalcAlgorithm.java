package org.kramerlab.atmocalc.analysis;

import java.util.Map;
import java.util.Set;

import org.kramerlab.atmocalc.objects.Analysis;

public abstract class AtmoCalcAlgorithm

{
	/** Attributes */
	/**
     * 
     */
	public Set<Filter> filters;
	/**
     * 
     */
	private Map<String, String> parameter;
	/**
     * 
     */
	private Analysis analysis;

	/**
	 * Operation init
	 * 
	 * @param analysis
	 *            -
	 * @param parameter
	 *            -
	 * @param filters
	 *            -
	 */
	abstract public void init(Analysis analysis, Map<String, String> parameter,
			Set<Filter> filters);

	/**
	 * Operation analyze
	 * 
	 * @return Analysis
	 */
	abstract public Analysis analyze();

	/**
	 * Operation getParameterOptions
	 * 
	 * @return String
	 */
	abstract public String getParameterOptions();

	/**
	 * Operation getFilter
	 * 
	 * @return Set<Filter>
	 */
	public Set<Filter> getFilter() {
		return null;
	};

	/**
	 * Operation getAnalysis
	 * 
	 * @return Analysis
	 */
	public Analysis getAnalysis() {
		return null;
	};

	/**
	 * Operation getParameter
	 * 
	 * @return Map<String,String>
	 */
	public Map<String, String> getParameter() {
		return null;
	};

}
