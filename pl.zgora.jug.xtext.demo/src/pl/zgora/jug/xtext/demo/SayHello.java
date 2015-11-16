package pl.zgora.jug.xtext.demo;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class SayHello implements IWorkflowComponent {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public void invoke(IWorkflowContext ctx) {
		System.out.println(getMessage());
	}

	@Override
	public void postInvoke() {
	}

	@Override
	public void preInvoke() {
	}

}
