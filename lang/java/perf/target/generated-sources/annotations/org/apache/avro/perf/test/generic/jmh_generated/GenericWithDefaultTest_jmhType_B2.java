package org.apache.avro.perf.test.generic.jmh_generated;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class GenericWithDefaultTest_jmhType_B2 extends GenericWithDefaultTest_jmhType_B1 {
    public volatile int setupTrialMutex;
    public volatile int tearTrialMutex;
    public final static AtomicIntegerFieldUpdater<GenericWithDefaultTest_jmhType_B2> setupTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(GenericWithDefaultTest_jmhType_B2.class, "setupTrialMutex");
    public final static AtomicIntegerFieldUpdater<GenericWithDefaultTest_jmhType_B2> tearTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(GenericWithDefaultTest_jmhType_B2.class, "tearTrialMutex");

    public volatile int setupIterationMutex;
    public volatile int tearIterationMutex;
    public final static AtomicIntegerFieldUpdater<GenericWithDefaultTest_jmhType_B2> setupIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(GenericWithDefaultTest_jmhType_B2.class, "setupIterationMutex");
    public final static AtomicIntegerFieldUpdater<GenericWithDefaultTest_jmhType_B2> tearIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(GenericWithDefaultTest_jmhType_B2.class, "tearIterationMutex");

    public volatile int setupInvocationMutex;
    public volatile int tearInvocationMutex;
    public final static AtomicIntegerFieldUpdater<GenericWithDefaultTest_jmhType_B2> setupInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(GenericWithDefaultTest_jmhType_B2.class, "setupInvocationMutex");
    public final static AtomicIntegerFieldUpdater<GenericWithDefaultTest_jmhType_B2> tearInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(GenericWithDefaultTest_jmhType_B2.class, "tearInvocationMutex");

}
