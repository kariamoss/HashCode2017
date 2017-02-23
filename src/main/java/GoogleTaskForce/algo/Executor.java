package GoogleTaskForce.algo;


import GoogleTaskForce.Context;

public class Executor {
    private Context context;
    private Strat strategie;

    public Executor(Context context){
        this.context = context;
        strategie = new basicStrat();
    }

    public void exec(){
        strategie.execute(context);
    }
}
