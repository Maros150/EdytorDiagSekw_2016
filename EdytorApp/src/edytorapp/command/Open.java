package edytorapp.command;


import java.io.File;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class Open implements IHandler {
	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
       
		
		String path = URI.createURI(Platform.getInstallLocation().getURL().getPath().toString()).path();
		FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
		   dialog.setFilterExtensions(new String [] {"*.diagram"});
		   dialog.setFilterPath(path);
		   dialog.open();
		
		
		String choosenDiagram = new String(dialog.getFilterPath() + File.separator + dialog.getFileName());	   
        URI fileURI = URI.createFileURI(choosenDiagram);
        URIEditorInput editorInput = new URIEditorInput(fileURI);
        
        try {
        	if(editorInput.exists())	
              page.openEditor(editorInput, "org.eclipse.graphiti.ui.editor.DiagramEditor");
              
        } catch (PartInitException e) {
        }
        
	return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}