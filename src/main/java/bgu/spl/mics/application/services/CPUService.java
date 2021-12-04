package bgu.spl.mics.application.services;

import bgu.spl.mics.MicroService;

/**
 * CPU service is responsible for handling the {@link DataPreProcessEvent}.
 * This class may not hold references for objects which it is not responsible for.
 *
 * You can add private fields and public methods to this class.
 * You MAY change constructor signatures and even add new public constructors.
 */
public class CPUService extends MicroService {
    public CPUService(String name) {
        super("Change_This_Name");
        // TODO Implement this
    }

    @Override
    protected void initialize() {
        // TODO Implement this

    }

    /**
     * CPU service is responsible for managing the processing of the batches.
     * first thing when the service runs it checks its Q, if Q is empty, it waits.
     * when we get a new batch from gpu we add it to our q from the cluster and here we tell the cpu to process it.
     */
}
