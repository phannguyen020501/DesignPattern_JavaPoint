package CreationalPattern.ObjectPoolPattern;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;

public abstract class ObjectPool<T> {
    //pool is based on ConcurrentLinkedQueue from the java.until.concurrent package
    //the queue follows FIFO technique (first in first out)

    private ConcurrentLinkedQueue<T> pool;


    /*

   ScheduledExecutorService starts a special task in a separate thread and observes
   the minimum and maximum number of objects in the pool periodically in a specified
    time (with parameter validationInterval).
   When the number of objects is less than the minimum, missing instances will be created.
   When the number of objects is greater than the maximum, too many instances will be removed.
   This is sometimes useful for the balance of memory consuming objects in the pool.
*/
    private ScheduledExecutorService executorService;

    public ObjectPool(final int miniObjects){

    }
}
