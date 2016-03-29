//@author Stan Bozhinov cs349 task5
public class DescriptorComponent extends A_Descriptor implements I_Identifiable{

	private DescriptorSpatial _descriptorSpatial;
	private String _id;
	public DescriptorComponent(String id,
			DescriptorSpatial descriptor){
		_descriptorSpatial = descriptor;
		_id = id;
	}

	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<descriptor id=\""+getID_()+"\">");
		_descriptorSpatial.visit_(visitor);
		visitor.append("</descriptor>");
	}

	public DescriptorSpatial getDescriptorSpatial(){
		return _descriptorSpatial;
		
	}

	public String getID_() {	
		return _id;
	}


}
