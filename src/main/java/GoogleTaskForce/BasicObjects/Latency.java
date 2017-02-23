package GoogleTaskForce.BasicObjects;

/**
 * Created by Jehan on 23/02/2017, 19:10.
 */
public class Latency {
    EndPoint endpoint;
    Cache cache;
    int time;

    public Latency(EndPoint endpoint, Cache cache, int time) {
        this.endpoint = endpoint;
        this.cache = cache;
        this.time = time;
    }
}
