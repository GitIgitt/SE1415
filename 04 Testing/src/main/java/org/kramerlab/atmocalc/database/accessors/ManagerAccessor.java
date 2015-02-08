package org.kramerlab.atmocalc.database.accessors;

import java.net.URI;

import org.kramerlab.atmocalc.Permission;
import org.kramerlab.atmocalc.objects.AtmoCalcObject;
import org.kramerlab.atmocalc.objects.Package;
import org.kramerlab.atmocalc.objects.Group;
import org.kramerlab.atmocalc.objects.User;

public class ManagerAccessor

{
	/**
	 * Operation ManagerAccessor
	 * 
	 * @return
	 */
	public ManagerAccessor() {
	}

	/**
	 * Operation getUserByName
	 * 
	 * @param username
	 *            -
	 * @return User
	 */
	public User getUserByName(String username) {
		return null;
	}

	/**
	 * Operation getUserById
	 * 
	 * @param userId
	 *            -
	 * @return User
	 */
	public User getUserById(URI userId) {
		return null;
	}

	/**
	 * Operation getPackage
	 * 
	 * @param packageId
	 *            -
	 * @return Package
	 */
	public org.kramerlab.atmocalc.objects.Package getPackage(URI packageId) {
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
	 * Operation getGroup
	 * 
	 * @param groupId
	 *            -
	 * @return Group
	 */
	public Group getGroup(Group groupId) {
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
	public Permission getPermission(AtmoCalcObject obj) {
		return null;
	}
}
