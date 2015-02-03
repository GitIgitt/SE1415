package org.kramerlab.atmocalc.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.subject.Subject;
import org.kramerlab.atmocalc.interfaces.AtmoCalcInterface;

public abstract class AtmoCalcServlet

{
    /**
     * Operation getInterface
     *
     * @param username - 
     * @return AtmoCalcInterface
     */
    public AtmoCalcInterface getInterface ( String username ){
    	return null;
    }

    /**
     * Operation writeHTMLResponse
     *
     * @param response - 
     * @param content - 
     */
    public void writeHTMLResponse ( HttpServletResponse response, String content ){
    	return;
    }

    /**
     * Operation writeJSONResponse
     *
     * @param response - 
     * @param jsonData - 
     */
    public void writeJSONResponse ( HttpServletResponse response, String jsonData ){
    	return;
    }

    /**
     * Operation login
     *
     * @param request - 
     * @param response - 
     * @return Subject
     */
	private Subject login ( HttpServletRequest request, HttpServletResponse response ){
    	return null;
    }

    /**
     * Operation logout
     *
     * @param request - 
     * @param response - 
     */
    private void logout ( HttpServletRequest request, HttpServletResponse response ){
    	return;
    }

    /**
     * Operation doGet
     *
     * @param request - 
     * @param response - 
     */
    protected void doGet ( HttpServletRequest request, HttpServletResponse response ){
    	
    }

    /**
     * Operation doPost
     *
     * @param request - 
     * @param response - 
     */
    protected void doPost ( HttpServletRequest request, HttpServletResponse response ){
    	
    }

    /**
     * Operation doPut
     *
     * @param request - 
     * @param response - 
     */
    protected void doPut ( HttpServletRequest request, HttpServletResponse response ){
    	
    }

    /**
     * Operation doDelete
     *
     * @param request - 
     * @param response - 
     */
    protected void doDelete ( HttpServletRequest request, HttpServletResponse response ){
    	
    }

    /**
     * Operation doAtmoCalcGet
     *
     * @param request - 
     * @param response - 
     */
    abstract protected void doAtmoCalcGet ( HttpServletRequest request, HttpServletResponse response );

    /**
     * Operation doAtmoCalcPost
     *
     * @param request - 
     * @param response - 
     */
    abstract protected void doAtmoCalcPost ( HttpServletRequest request, HttpServletResponse response );

    /**
     * Operation doAtmoCalcPut
     *
     * @param request - 
     * @param response - 
     */
    abstract protected void doAtmoCalcPut ( HttpServletRequest request, HttpServletResponse response );

    /**
     * Operation doAtmoCalcDelete
     *
     * @param request - 
     * @param response - 
     */
    abstract protected void doAtmoCalcDelete ( HttpServletRequest request, HttpServletResponse response );

}

