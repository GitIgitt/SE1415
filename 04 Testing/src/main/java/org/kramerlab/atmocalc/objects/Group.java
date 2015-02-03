package org.kramerlab.atmocalc.objects;

import java.util.Set;

import org.kramerlab.atmocalc.database.accessors.GroupAccessor;

public class Group extends AtmoCalcObject {
	/** Attributes */
	/**
     * 
     */
	private User owner;
	/**
     * 
     */
	private Set<User> member;
	/**
     * 
     */
	private GroupAccessor accessor;
	/**
     * 
     */
	private Set<Package> packages;

	/**
	 * Operation addMember
	 * 
	 * @param user
	 *            -
	 */
	public void addMember(User user) {
	}

	/**
	 * Operation removeMember
	 * 
	 * @param user
	 *            -
	 */
	public void removeMember(User user) {
	}

	/**
	 * Operation getPackages
	 * 
	 * @return Set<Package>
	 */
	public Set<Package> getPackages() {
		return null;
	}

	/**
	 * Operation isOwner
	 * 
	 * @param user
	 *            -
	 * @return boolean
	 */
	private boolean isOwner(User user) {
		return false;
	}
}
