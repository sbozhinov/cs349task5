//@author Stan Bozhinov cs349 task5
public class DescriptorSpatial extends A_Descriptor{
	
	private DescriptorPositional _position;
	private DescriptorDimensional _dimensions;
	
	public DescriptorSpatial(DescriptorPositional position,
			DescriptorDimensional dimensions){
		_position = position;
		_dimensions = dimensions;
	}

	public DescriptorDimensional getDimensions(){
		return _dimensions;
		
	}
	
	public DescriptorPositional getPosition(){
		return _position;
		
	}
	
	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<descriptor-spatial>");
		_position.visit_(visitor);
		_dimensions.visit_(visitor);
		visitor.append("</descriptor-spatial>");
	}
	
}
