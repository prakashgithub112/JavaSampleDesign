import com.cg.Impl.Circle;
import com.cg.Impl.Rectangle;
import com.cg.Impl.Square;
import com.cg.inter.Shape;

//Example of Op-en and closed principle
public class AreaClient {

	public static void main(String[] args) {
		
		//Liskov principle
		Shape rec = new Rectangle();
		rec.calculateArea();
		
		//Liskov principle
		Shape squ = new Square();
		squ.calculateArea();
		
		//Liskov principle
		Shape cir = new Circle();
		cir.calculateArea();
		
	}

}
