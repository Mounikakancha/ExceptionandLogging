import org.apache.logging.log4j.*;
import java.util.*;
import com.mycompany.log.*;
public class SimpleCompound {

    private static final Logger LOGGER=LogManager.getLogger(ClassMain.class);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        double principle=s.nextInt();
        double rate=s.nextInt();
        double time=s.nextInt();
        LOGGER.info(Simple.calSimple(principle, rate, time));
    }
    
}
