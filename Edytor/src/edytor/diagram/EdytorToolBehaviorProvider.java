package edytor.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;

public class EdytorToolBehaviorProvider extends DefaultToolBehaviorProvider{
	public EdytorToolBehaviorProvider(IDiagramTypeProvider dtp) {
        super(dtp);
   }
	
/*    @Override
    public IPaletteCompartmentEntry[] getPalette() {
        List<IPaletteCompartmentEntry> ret = new ArrayList<IPaletteCompartmentEntry>();
     
        // add compartments from super class
        IPaletteCompartmentEntry[] superCompartments = super.getPalette();
            ret.add(superCompartments[0]);
     
        // add new compartment at the end of the existing compartments
        PaletteCompartmentEntry othersCompartmentEntry = new PaletteCompartmentEntry("Others", null);
        ret.add(othersCompartmentEntry);
        PaletteCompartmentEntry containerCompartmentEntry = new PaletteCompartmentEntry("Container", null);
        ret.add(containerCompartmentEntry);
        PaletteCompartmentEntry processCompartmentEntry = new PaletteCompartmentEntry("Process", null);
        ret.add(processCompartmentEntry);
        PaletteCompartmentEntry layerCompartmentEntry = new PaletteCompartmentEntry("Layer", null);
        ret.add(layerCompartmentEntry);
        PaletteCompartmentEntry architectureCompartmentEntry = new PaletteCompartmentEntry("Architecture", null);
        ret.add(architectureCompartmentEntry);

     
        // add all create-features
        IFeatureProvider featureProvider = getFeatureProvider();
        ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
        for (ICreateFeature cf : createFeatures) {
            ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(cf.getCreateName(),
                    cf.getCreateDescription(), cf.getCreateImageId(),
                       cf.getCreateLargeImageId(), cf);
            
            
        	if(((String)cf.getCreateImageId()).equals(EditorImageProvider.IMG_MINIDATA))
        		othersCompartmentEntry.addToolEntry(objectCreationToolEntry);
        	else if(((String)cf.getCreateImageId()).equals(EditorImageProvider.IMG_MINIINFRASTUCTURE))
        		othersCompartmentEntry.addToolEntry(objectCreationToolEntry);
        	else if(((String)cf.getCreateImageId()).equals(EditorImageProvider.IMG_MINIMETADATA))
        		othersCompartmentEntry.addToolEntry(objectCreationToolEntry);
        	else if(((String)cf.getCreateImageId()).equals(EditorImageProvider.IMG_MINICONTAINER))
        		containerCompartmentEntry.addToolEntry(objectCreationToolEntry);
        	else if(((String)cf.getCreateImageId()).equals(EditorImageProvider.IMG_MINIPROCESS))
        		processCompartmentEntry.addToolEntry(objectCreationToolEntry);
        	else if(((String)cf.getCreateImageId()).equals(EditorImageProvider.IMG_MINILAYER))
        		layerCompartmentEntry.addToolEntry(objectCreationToolEntry);
        	else if(((String)cf.getCreateImageId()).equals(EditorImageProvider.IMG_MINIARCHITECTURE))
        		architectureCompartmentEntry.addToolEntry(objectCreationToolEntry);
        	
        }
            
        return ret.toArray(new IPaletteCompartmentEntry[ret.size()]);
    } */
	
}
