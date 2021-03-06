package edytor.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class EdytorDiagramTypeProvider extends AbstractDiagramTypeProvider {

	private IToolBehaviorProvider[] toolBehaviorProviders;
	public EdytorDiagramTypeProvider() {
		super();
		setFeatureProvider(new EdytorFeatureProvider(this));
	}
    @Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (toolBehaviorProviders == null) {
            toolBehaviorProviders = new IToolBehaviorProvider[] { new EdytorToolBehaviorProvider(this) };
        }
        return toolBehaviorProviders;
    }	
}
