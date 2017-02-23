package GoogleTaskForce.basicObjects;

import GoogleTaskForce.BasicObjects.Cache;
import GoogleTaskForce.BasicObjects.EndPoint;
import GoogleTaskForce.BasicObjects.Request;
import GoogleTaskForce.BasicObjects.Video;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EndPointTest {
    private EndPoint point;

    @Before
    public void init(){
        point = new EndPoint(1000);
    }

    @Test
    public void basic(){
        point.addRequest(new Request(1500,new Video(7,20)));
        point.addCacheConnected(new Cache(30));
        assertTrue(point.operationPossible().isPresent());
    }

    @Test
    public void notOp(){
        assertTrue(!point.operationPossible().isPresent());
    }

    @Test
    public void basic2(){
        point.addRequest(new Request(1500,new Video(7,20)));
        point.addCacheConnected(new Cache(10));
        assertTrue(!point.operationPossible().isPresent());
    }

}
