package GoogleTaskForce.BasicObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Jehan on 23/02/2017, 19:08.
 */
public class EndPoint {
    List<Cache> cacheConnected;
    private List<Request> requests;
    int dataCenterLatency;

    public EndPoint(int dataCenterLatency) {
        cacheConnected = new ArrayList<>();
        this.dataCenterLatency = dataCenterLatency;
        requests = new ArrayList<>();
    }

    public void addCacheConnected(Cache cache){
        cacheConnected.add(cache);
    }

    public boolean isConnectedToCache(){
        return cacheConnected.isEmpty();
    }

    public void addRequest(Request req){
        requests.add(req);
    }

    public Optional<Video> operationPossible(){
        for(Request req : requests){
            if(isRequestSat(req)) continue;
            for(Cache cache : cacheConnected){
                if(cache.requestFit(req)) return Optional.of(req.getVideo());
            }
        }
        return Optional.empty();
    }

    public boolean isRequestSat(Request req){
        for(Cache cache : cacheConnected){
            if(cache.hasVideo(req.getVideo()))return true;
        }
        return false;
    }




}
