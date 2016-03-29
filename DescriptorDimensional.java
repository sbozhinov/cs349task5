//@author Stan Bozhinov cs349 task5
public class DescriptorDimensional extends A_Descriptor{
	
	private double _height;
	private double _width;
	private double _depth;
	
	public DescriptorDimensional(double height,
			double width,
			double depth){
		_height = height;
		_width = width;
		_depth = depth;
	}

	public double getDepth(){
		return _depth;
		
	}
	
	public double getHeight(){
		return _height;
		
	}
	
	public double getWidth(){
		return _width;
		
	}
	
	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<dimensions height=\""+getHeight()+"\" width=\""+getWidth()+"\" depth=\""+getDepth()+"\" />" );		
	}
	
}
