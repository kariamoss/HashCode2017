package GoogleTaskForce.basicObjects;

import GoogleTaskForce.BasicObjects.Cache;
import GoogleTaskForce.BasicObjects.Video;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CacheTest {
    private Cache cache;

    @Before
    public void init(){
        cache = new Cache(500);
    }

    @Test
    public void test(){
        assertTrue(cache.videoFit(new Video(20,20)));
        cache.putVideo(new Video(20,400));
        assertTrue(cache.videoFit(new Video(20,20)));
    }
}
