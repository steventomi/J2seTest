
public class TestObjectEq {
	public static void main(String [] arg){
		Cat cat0 = new Cat(2,3,5);
		Cat cat1 = new Cat(12,34,56);
		Cat cat2 = new Cat(2,3,5);
		
		System.out.println(cat0 == cat1);
		System.out.println(cat0.equals(cat2));
	}

}

class Cat{
	int weight ,height, color;
	
	public Cat(int weight, int height, int color){
		this.weight = weight;
		this.height = height;
		this.color = color;
	}
	
	public boolean equals(Object ob){
		//instanceof 
		if (ob == null) 
			return false;
		else{
			if(ob instanceof Cat){
				Cat c = (Cat)ob;
				if(this.weight == c.weight && this.height == c.height && this.color ==c.color){
					return true;
				}
				return false;
			}
			
		}
		return false;
	}
}