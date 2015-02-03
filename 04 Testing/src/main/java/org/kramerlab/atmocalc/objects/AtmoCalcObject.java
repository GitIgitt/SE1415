package org.kramerlab.atmocalc.objects;

import java.net.URI;

import org.kramerlab.atmocalc.Permission;

public abstract class AtmoCalcObject

{
    /** Attributes */
    /**
     * 
     */
    public URI databaseId;
    /**
     * 
     */
    public Permission access;
    /**
     * Operation getUri
     *
     * @return URI
     */
    public URI getUri (  ){
    	return null;
    }

    /**
     * Operation getName
     *
     * @return String
     */
    public String getName (  ){return null;}

    /**
     * Operation setName
     *
     * @param newName - 
     */
    public void setName ( String newName ){
    	return;
    }

    /**
     * Operation equals
     *
     * @param other - 
     * @return boolean
     */
    public boolean equals ( Object other ){
    	return false;
    }

    /**
     * Operation hashCode
     *
     * @return int
     */
    public int hashCode (  ){
    	return super.hashCode();
    }

    /**
     * Operation setUri
     *
     * @param databaseId - 
     */
    public void setUri ( URI databaseId ){
    	return;
    }

}

