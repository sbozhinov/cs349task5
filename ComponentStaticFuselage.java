//@author Stan Bozhinov cs349 task5
public class ComponentStaticFuselage extends A_ComponentStatic{
	private ComponentStaticWingLeft _wingLeft;
	private ComponentStaticWingRight _wingRight;
	private ComponentStaticStabilizerHorizontal _stabilizerLeft;
	private ComponentStaticStabilizerHorizontal _stabilizerRight;
	private ComponentStaticStabilizerVertical _stabilizerVertical;
	private ComponentDynamicGearNose _gear;
	private EngineManager _engineManager;
	public ComponentStaticFuselage(DescriptorComponent descriptor,
			ComponentStaticWingLeft wingLeft,
			ComponentStaticWingRight wingRight,
			ComponentStaticStabilizerHorizontal stabilizerLeft,
			ComponentStaticStabilizerHorizontal stabilizerRight,
			ComponentStaticStabilizerVertical stabilizerVertical,
			ComponentDynamicGearNose gear){
		
		super(descriptor);
		_wingLeft = wingLeft;
		_wingRight = wingRight;
		_stabilizerLeft = stabilizerLeft;
		_stabilizerRight = stabilizerRight;
		_stabilizerVertical = stabilizerVertical;
		_gear = gear;

	}

	public ComponentDynamicGearNose getGear(){
		return _gear;
		
	}
	
	public ComponentStaticStabilizerHorizontal getStabilizerLeft(){
		return _stabilizerLeft;
		
	}
	
	public ComponentStaticStabilizerHorizontal getStabilizerRight(){
		return _stabilizerRight;
		
	}
	
	public ComponentStaticStabilizerVertical getStabilizerVertical(){
		return _stabilizerVertical;
		
	}
	
	public ComponentStaticWingLeft getWingLeft(){
		return _wingLeft;		
	}
	
	public ComponentStaticWingRight getWingRight(){
		return _wingRight;
		
	}
	
	public void visit_(Visitor visitor) {
		visitor.append("<fuselage>");
		super.visit_(visitor);
		_wingLeft.visit_(visitor);
		_wingRight.visit_(visitor);
		_stabilizerLeft.visit_(visitor);
		_stabilizerRight.visit_(visitor);
		_stabilizerVertical.visit_(visitor);
		_gear.visit_(visitor);
		visitor.append("</fuselage>");
		
	}

	public EngineManager getEngineManager() {	
		_engineManager = new EngineManager(this);
		return _engineManager;
	}
	
}
