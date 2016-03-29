//@author Stan Bozhinov cs349 task5
public class ComponentDynamicEngine extends A_ComponentDynamic {

	private double _power;
	
	ComponentDynamicPropeller _propeller;
	public ComponentDynamicEngine(DescriptorComponent descriptor,
			ComponentDynamicPropeller propeller){
		super(descriptor);
		_propeller = propeller;
	}
	
	public ComponentDynamicPropeller getPropeller(){
		return _propeller;
	}

	public void setPower(double power){
		_power = power;
		System.out.println("engine "+super.getID_()+" power at "+getPower() );
	}
	
	public double getPower(){
		return _power;
		
	}
	
	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<engine power=\""+getPower()+"\">");
		super.visit_(visitor);
		_propeller.visit_(visitor);
		visitor.append("</engine>");
	}
	
}
