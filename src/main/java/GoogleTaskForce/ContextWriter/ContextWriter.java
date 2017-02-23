package GoogleTaskForce.ContextWriter;

import GoogleTaskForce.BasicObjects.Cache;
import GoogleTaskForce.Context;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Jehan on 23/02/2017, 19:32.
 */
public class ContextWriter {
    Context context;

    public ContextWriter(Context context) {
        this.context = context;
    }

    public void printRes(){
        try{
            PrintWriter writer = new PrintWriter("output.out", "UTF-8");
            writer.println(context.nbCacheNotEmpty());
            for(int i = 0; i < context.nbCacheNotEmpty(); i++){
                Cache cache = context.getCacheById(i);
                writer.print(i);
                writer.println(cache);
            }
            writer.close();
        } catch (IOException e) {
            // do something
        }

    }
}
