package org.kramerlab.atmocalc.manager;

import java.net.URI;

import org.kramerlab.atmocalc.database.accessors.ManagerAccessor;
import org.kramerlab.atmocalc.objects.User;
import org.kramerlab.atmocalc.objects.Package;
import org.kramerlab.atmocalc.objects.Group;
import org.kramerlab.atmocalc.Permission;
import org.kramerlab.atmocalc.objects.AtmoCalcObject;

public class AtmoCalcManager

{
	/** Attributes */
	/**
     * 
     */
	public ManagerAccessor accessor;
	/**
     * 
     */
	private User caller;

	/**
	 * Operation AtmoCalcManager
	 * 
	 * @param user
	 *            -
	 * @return
	 */
	public AtmoCalcManager(User user) {
	}

	/**
	 * Operation getPackage
	 * 
	 * @param packageId
	 *            -
	 * @return Package
	 */
	public Package getPackage(URI packageId) {
		return null;
	}

	/**
	 * Operation newPackage
	 * 
	 * @param owner
	 *            -
	 * @return Package
	 */
	public Package newPackage(User owner) {
		return null;
	}

	/**
	 * Operation getUser
	 * 
	 * @param userId
	 *            -
	 * @return User
	 */
	public User getUser(URI userId) {
		return null;
	}

	/**
	 * Operation getUser
	 * 
	 * @param username
	 *            -
	 * @return User
	 */
	public User getUser(String username) {
		return null;
	}

	/**
	 * Operation newUser
	 * 
	 * @param username
	 *            -
	 * @param email
	 *            -
	 * @param password
	 *            -
	 * @return User
	 */
	public User newUser(String username, String email, String password) {
		return null;
	}

	/**
	 * Operation getGroup
	 * 
	 * @param groupId
	 *            -
	 * @return Group
	 */
	public Group getGroup(URI groupId) {
		return null;
	}

	/**
	 * Operation newGroup
	 * 
	 * @param owner
	 *            -
	 * @return Group
	 */
	public Group newGroup(User owner) {
		return null;
	}

	/**
	 * Operation getPermission
	 * 
	 * @param obj
	 *            -
	 * @return Permission
	 */
	private Permission getPermission(AtmoCalcObject obj) {
		return null;
	}
}
