package org.kramerlab.atmocalc.interfaces;

import java.net.URI;

import org.kramerlab.atmocalc.JIM;
import org.kramerlab.atmocalc.objects.User;
import org.kramerlab.atmocalc.objects.Package;
import org.kramerlab.atmocalc.objects.Group;

public class AtmoCalcInterface

{
    /** Attributes */
    /**
     * 
     */
    protected JIM jim;
    /**
     * Operation AtmoCalcInterface
     *
     * @param username - 
     * @return 
     */
    public AtmoCalcInterface ( String username ){}
    /**
     * Operation getUserByName
     *
     * @param username - 
     * @return User
     */
    public User getUserByName ( String username ){return null;}
    /**
     * Operation getUserById
     * 	
     *
     * @param userId - 
     * @return User
     */
	public User getUserById(URI userId ){return null;}
    /**
     * Operation getPackage
     *
     * @param packageId - 
     * @return Package
     */
    public Package getPackage ( URI packageId ){return null;}
    /**
     * Operation getGroup
     *
     * @param groupId - 
     * @return Group
     */
    public Group getGroup ( URI groupId ){return null;}
}

