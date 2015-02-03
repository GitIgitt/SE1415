package org.kramerlab.atmocalc;

import javax.servlet.ServletContext;

import org.kramerlab.atmocalc.objects.User;
import org.kramerlab.atmocalc.manager.AtmoCalcManager;

public class JIM

{
	/** Attributes */
	/**
     * 
     */
	public ThreadLocal<JIM> ref;
	/**
     * 
     */
	public User user;
	/**
     * 
     */
	public AtmoCalcManager manager;

	/**
	 * Operation getInstance
	 * 
	 * @param username
	 *            -
	 * @return JIM
	 */
	public JIM getInstance(String username) {
		return null;
	}

	/**
	 * Operation getUser
	 * 
	 * @return User
	 */
	public User getUser() {
		return null;
	}

	/**
	 * Operation init
	 * 
	 * @param ctx
	 *            -
	 */
	public void init(ServletContext ctx) {
		return;
	}

	/**
	 * Operation close
	 * 
	 */
	public void close() {
	}

	/**
	 * Operation getManager
	 * 
	 * @return AtmoCalcManager
	 */
	public AtmoCalcManager getManager() {
		return null;
	}

	/**
	 * Operation JIM
	 * 
	 * @return
	 */
	private JIM() {
	}
}
