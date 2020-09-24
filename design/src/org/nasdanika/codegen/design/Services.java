package org.nasdanika.codegen.design;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sirius.CommonServices;

/**
 * The services class used by VSM.
 */
public class Services extends CommonServices {
	    
    public boolean isCodegenResource(EObject self) {
    	return isResourceExtension(self, "codegen");
    }	

}
