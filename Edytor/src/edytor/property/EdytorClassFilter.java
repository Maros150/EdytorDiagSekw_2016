package edytor.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

public class EdytorClassFilter extends AbstractPropertySectionFilter{
	 @Override
	    protected boolean accept(PictogramElement pe) {
	        EObject eObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
	        if (eObject instanceof edytorModel.Class){
	        	return true;
	        }
	        return false;
	    }
}

