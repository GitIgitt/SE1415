package org.kramerlab.atmocalc.analysis;

import org.kramerlab.atmocalc.objects.Analysis;

public class DefaultFilter extends Filter {
	/**
	 * Operation satisfied
	 * 
	 * @param analysis
	 *            -
	 * @return boolean
	 */
	public boolean satisfied(Analysis analysis) {
		return true;
	}
}
