package edytor.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class EdytorDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public EdytorDiagramTypeProvider() {
		super();
		setFeatureProvider(new EdytorFeatureProvider(this));
	}
}
