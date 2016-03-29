//@author Stan Bozhinov cs349 task5
public class ComponentStaticAirplane extends A_ComponentStatic{
	private ComponentStaticFuselage _fuselage;
	public ComponentStaticAirplane(DescriptorComponent descriptor,
			ComponentStaticFuselage fuselage){
		super(descriptor);
		_fuselage = fuselage;
	}

	public ComponentStaticFuselage getFuselage(){
		return _fuselage;
		
	}
	
	@Override
	public void visit_(Visitor visitor) {
	
	}
}
