package GoogleTaskForce;

import GoogleTaskForce.ContextWriter.ContextWriter;
import GoogleTaskForce.algo.Executor;

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
        Executor executor = new Executor(context);
        executor.exec();
        new ContextWriter(context).printRes();
    }
}
