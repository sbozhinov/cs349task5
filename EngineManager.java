//@author Stan Bozhinov cs349 task5
import java.util.ArrayList;
import java.util.List;

public class EngineManager {
    private boolean canAddEngines = true;
	private ComponentStaticFuselage _host;
	private List<ComponentDynamicEngine> _enginesLeft = new ArrayList<ComponentDynamicEngine>();
	private List<ComponentDynamicEngine> _enginesRight = new ArrayList<ComponentDynamicEngine>();
	private List<ComponentDynamicEngine> _enginesManaged = new ArrayList<ComponentDynamicEngine>();
	
	public EngineManager(ComponentStaticFuselage host){
		_host = host;
		for(ComponentDynamicEngine eachEngine : _host.getWingLeft().getEngines())
			registerEngineLeft(eachEngine);
		for(ComponentDynamicEngine eachEngine : _host.getWingRight().getEngines())
			registerEngineRight(eachEngine);
	}

	public ComponentStaticFuselage getHost(){
		return _host;		
	}
	
	public void registerEngineLeft(ComponentDynamicEngine engine){
		if(canAddEngines){
		_enginesLeft.add(engine);
		_enginesManaged.addAll(_enginesLeft);
		}
	}
	
	public void registerEngineRight(ComponentDynamicEngine engine){
		if(canAddEngines){
		_enginesRight.add(engine);
		_enginesManaged.addAll(_enginesRight);
		}
	}
	
	public List<ComponentDynamicEngine> getEngines(){
		return _enginesManaged;		
	}
	
	public void commit() {
		if(_enginesRight.size() == _enginesLeft.size() ){
			canAddEngines = false;
		}
		else{
			throw new RuntimeException("Engines unbalanced");
		}
	}

	public void setPower(double power) {
		for(ComponentDynamicEngine eachEngine : _enginesManaged)
			eachEngine.setPower(power);
	}
		
}
