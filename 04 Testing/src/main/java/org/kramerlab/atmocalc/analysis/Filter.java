package org.kramerlab.atmocalc.analysis;

import org.kramerlab.atmocalc.objects.Analysis;

public abstract class Filter

{
    /**
     * Operation satisfied
     *
     * @param analysis - 
     * @return boolean
     */
    abstract public boolean satisfied ( Analysis analysis );

}

