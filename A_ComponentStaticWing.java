//@author Stan Bozhinov cs349 task5
import java.util.ArrayList;
import java.util.List;
public abstract class A_ComponentStaticWing extends A_ComponentStatic{

	private List<ComponentDynamicEngine> _engines = new ArrayList<ComponentDynamicEngine>();
	private List<ComponentDynamicAileron> _ailerons = new ArrayList<ComponentDynamicAileron>();
	private ComponentDynamicFlap _flap;
	private ComponentDynamicGearMain _gear;
	
	public A_ComponentStaticWing(DescriptorComponent descriptor,
			List<ComponentDynamicEngine> engines,
			List<ComponentDynamicAileron> ailerons,
			ComponentDynamicFlap flap,
			ComponentDynamicGearMain gear){
		super(descriptor);
		_engines = engines;
		_ailerons = ailerons;
		_flap = flap;
		_gear = gear;
	}
	
	public List<ComponentDynamicAileron> getAilerons(){
		return _ailerons;
		
	}
	
	public List<ComponentDynamicEngine> getEngines(){
		return _engines;
		
	}
	
	public ComponentDynamicFlap getFlap(){
		return _flap;
		
	}
	public void visit_(Visitor visitor){
	visitor.append("<wing>");
	super.visit_(visitor);
	for(ComponentDynamicEngine eachEngine : _engines)
		eachEngine.visit_(visitor);
	for(ComponentDynamicAileron eachAileron : _ailerons)
		eachAileron.visit_(visitor);
	_flap.visit_(visitor);
	_gear.visit_(visitor);
	visitor.append("</wing>");
	}
	
	public ComponentDynamicGearMain getGear(){
		return _gear;
		
	}
	
}
