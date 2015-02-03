package org.kramerlab.atmocalc;

public enum Permission

{
	READ, WRITE, READWRITE, NONE;

	/**
	 * Operation isReadable
	 * 
	 * @return boolean
	 */
	public boolean isReadable() {
		return false;
	}

	/**
	 * Operation isWritable
	 * 
	 * @return boolean
	 */
	public boolean isWritable() {
		return false;
	}
}
