package org.kramerlab.atmocalc.database.accessors;

import java.net.URI;
import java.util.Set;

import org.kramerlab.atmocalc.Permission;
import org.kramerlab.atmocalc.objects.User;
import org.kramerlab.atmocalc.objects.Package;

public class GroupAccessor extends AtmoCalcAccessor {
	/**
	 * Operation GroupAccessor
	 * 
	 * @param databaseId
	 *            -
	 * @param access
	 *            -
	 * @return
	 */
	public GroupAccessor(URI databaseId, Permission access) {
	}

	/**
	 * Operation getOwner
	 * 
	 * @return User
	 */
	public User getOwner() {
		return null;
	}

	/**
	 * Operation getMember
	 * 
	 * @return Set<User>
	 */
	public Set<User> getMember() {
		return null;
	}

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
		return;
	}

	/**
	 * Operation addPackage
	 * 
	 * @param package -
	 */
	public void addPackage(Package pack) {
		return;
	}

	/**
	 * Operation removePackage
	 * 
	 * @param package -
	 */
	public void removePackage(Package pack) {
		return;
	}
}
