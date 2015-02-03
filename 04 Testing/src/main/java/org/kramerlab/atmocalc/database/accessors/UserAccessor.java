package org.kramerlab.atmocalc.database.accessors;

import java.net.URI;
import java.util.Set;

import org.kramerlab.atmocalc.Permission;
import org.kramerlab.atmocalc.objects.Package;

public class UserAccessor extends AtmoCalcAccessor {
	/**
	 * Operation UserAccessor
	 * 
	 * @param databaseId
	 *            -
	 * @param access
	 *            -
	 * @return
	 */
	public UserAccessor(URI databaseId, Permission access) {
	}

	/**
	 * Operation getMail
	 * 
	 * @return String
	 */
	public String getMail() {
		return null;
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
	public org.kramerlab.atmocalc.objects.Package getDefaultPackage() {
		return null;
	}

	/**
	 * Operation setDefaultPackage
	 * 
	 * @param package -
	 */
	public void setDefaultPackage(org.kramerlab.atmocalc.objects.Package pack) {
	}

	/**
	 * Operation getAllPackages
	 * 
	 * @return Set<Package>
	 */
	public Set<Package> getAllPackages() {
		return null;
	}
}
