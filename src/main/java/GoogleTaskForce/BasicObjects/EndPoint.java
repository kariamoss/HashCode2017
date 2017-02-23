package GoogleTaskForce.BasicObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jehan on 23/02/2017, 19:08.
 */
public class EndPoint {
    List<Cache> cacheConnected;
    int dataCenterLatency;

    public EndPoint(int dataCenterLatency) {
        cacheConnected = new ArrayList<Cache>();
        this.dataCenterLatency = dataCenterLatency;
    }

    void addCacheConnected(Cache cache){
        cacheConnected.add(cache);
    }
}
