package GoogleTaskForce;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * This class handle the context of the simulation
 */
public class Context {
    private int nbVid;
    private int nbEndPoint;
    private int nbRequest;
    private int nbCache;
    private int sizeCache;


    public Context(int nbVid, int nbEndPoint, int nbRequest, int nbCache, int sizeCache) {
        this.nbVid = nbVid;
        this.nbEndPoint = nbEndPoint;
        this.nbRequest = nbRequest;
        this.nbCache = nbCache;
        this.sizeCache = sizeCache;
    }

    public int getNbVid() {
        return nbVid;
    }

    public int getNbEndPoint() {
        return nbEndPoint;
    }

    public int getNbRequest() {
        return nbRequest;
    }

    public int getNbCache() {
        return nbCache;
    }

    public int getSizeCache() {
        return sizeCache;
    }

}