import java.util.Collections;
import java.util.ArrayList;

public class MinMaxCalculation {
    ArrayList< Float > numList;

    public MinMaxCalculation( ) {
      this.numList = new ArrayList< Float >();
    }
  
    public void returnInputValidation( ArrayList< Float > numberList ) {
        float maximumVal = Collections.max( numberList );
        System.out.println("Maximum is : " + maximumVal );

        float minimumVal = Collections.min( numberList );
        System.out.println("Minimum is : " + minimumVal );
    }
}