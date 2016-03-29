//@author Stan Bozhinov cs349 task5
public class DescriptorPositional extends A_Descriptor{

	private double _x;
	private double _y;
	private double _z;
	
	public DescriptorPositional(double x,
			double y,
			double z){
		_x = x;
		_y= y;
		_z = z;
	}

	public double getX(){
		return _x;
		
	}
	
	public double getY(){
		return _y;
		
	}
	
	public double getZ(){
		return _z;
		
	}
	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<position x=\""+getX()+"\" y=\""+getY()+"\" z=\""+getZ()+"\" />" );		
	}
}
