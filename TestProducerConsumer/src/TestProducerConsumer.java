
public class TestProducerConsumer {
	public static void main(String [] arg){
		
	}
}

class Bread{
	
}

class SyncStack{
	int index = 0;
	Bread [] arrbread = new Bread[6];
	
	public void push(Bread b){
		arrbread[index] = b;
		index++;
	}
	
	public Bread pop(){
		index--;
		return arrbread[index];
	}
	
}