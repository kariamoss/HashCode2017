package GoogleTaskForce.ContextWriter;

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
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        } catch (IOException e) {
            // do something
        }

    }
}
