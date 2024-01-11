package com.rathod.oops;
/*package com.polaris.cache;

import java.util.concurrent.Semaphore;

public abstract class Updatable<T>
{
    protected volatile long lastRefreshed = 0;
    private final int REFRESH_FREQUENCY_MILLISECONDS = 300000; // 5 minutes
    private Thread updateThread;
    private final Semaphore updateInProgress = new Semaphore(1);

   

    public void forceRefresh()
    {
        try
        {
            updateInProgress.acquire();
        }
        catch (InterruptedException e)
        {
            log.warn("forceRefresh Interrupted");
        }

        try
        {
            loadAllData();
        }
        catch (Exception e)
        {
            log.error("Exception while updating data from DB", e);
        }
        finally
            {
            updateInProgress.release();
        }

    }

    protected void checkRefresh()
    {
        if (lastRefreshed + REFRESH_FREQUENCY_MILLISECONDS <     System.currentTimeMillis())
            startUpdateThread();
    }

    private void startUpdateThread()
    {
        if (updateInProgress.tryAcquire())
        {
            updateThread = new Thread(new Runnable()
            {
                public void run()
                {
                    try
                    {
                        loadAllData();
                    }
                    catch (Exception e)
                    {
                        log.error("Exception while updating data from DB", e);
                    }
                    finally
                    {
                        updateInProgress.release();
                    }
                }
            });

            updateThread.start();
        }
    }
    *//**
     * implement this function to load the data from DB
     *
     * @return
     *//*
    protected abstract List<T> loadFromDB();

    *//**
     * Implement this function to hotswap the data in memory after it was loaded from DB
     *
     * @param data
     *//*
    protected abstract void updateData(List<T> data);

    private void loadAllData()
    {
        List<T> l = loadFromDB();
        updateData(l);
        lastRefreshed = System.currentTimeMillis();
    }

    public void invalidateCache()
    {
         lastRefreshed = 0;
    }

}
*/