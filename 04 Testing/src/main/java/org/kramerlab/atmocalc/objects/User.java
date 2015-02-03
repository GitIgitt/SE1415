package org.kramerlab.atmocalc.objects;

import java.util.Set;

import org.kramerlab.atmocalc.database.accessors.UserAccessor;

public class User extends AtmoCalcObject {
	/** Attributes */
	/**
     * 
     */
	public String username;
	/**
     * 
     */
	public String email;
	/**
     * 
     */
	public UserAccessor accessor;
	/**
     * 
     */
	private Set<Package> packages;

	/**
	 * Operation getMail
	 * 
	 * @return String
	 */
	public String getMail() {
		return "";
	}

	/**
	 * Operation setMail
	 * 
	 * @param newMail
	 *            -
	 */
	public void setMail(String newMail) {
	}

	/**
	 * Operation getDefaultPackage
	 * 
	 * @return Package
	 */
	public Package getDefaultPackage() {
		return null;
	}

	/**
	 * Operation setDefaultPackage
	 * 
	 * @param package -
	 */
	public void setDefaultPackage(Package pack) {
	}

	/**
	 * Operation getPackages
	 * 
	 * @return Set<Package>
	 */
	public Set<Package> getPackages() {
		return null;
	}
}
