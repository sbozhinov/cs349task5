//@author Stan Bozhinov cs349 task5

public abstract class A_Component implements I_Identifiable, I_Visitable{
	private DescriptorComponent _descriptor;
	private A_Component _host;
	public A_Component(DescriptorComponent descriptor){
		_descriptor = descriptor;
	}
	
	public DescriptorComponent getDescriptor(){
		return _descriptor;
	}
	
	public String getID_(){
		return _descriptor.getID_();
		
	}
	
	public void setHost(A_Component host){
		_host = host;
	}
	
	public void visit_(Visitor visitor){
		visitor.append("<component>");
		_descriptor.visit_(visitor);
		visitor.append("</component>");
	}
	public A_Component getHost(){
		return _host;
	}
	
	public boolean hasHost(){
		if(_host ==null)
			return false;
		return true;
	}
	
}
