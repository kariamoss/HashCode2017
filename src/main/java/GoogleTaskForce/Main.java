package GoogleTaskForce;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        String contextPath = args[0];
        Context context = new Context();
        new ContextReader(contextPath, context);
    }
}
