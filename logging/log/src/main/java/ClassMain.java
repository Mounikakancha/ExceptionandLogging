import org.apache.logging.log4j.*;
import java.util.*;
import com.mycompany.log.*;
public class ClassMain {
    private static final Logger LOGGER=LogManager.getLogger(ClassMain.class);
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        LOGGER.info("enter values");
        String mat=s.nextLine();
        int total=s.nextInt();
        boolean auto=s.nextBoolean();
        LOGGER.info(Pricing.calPrice(mat, total, auto));
    }
    
}
