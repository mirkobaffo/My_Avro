package org.apache.avro.perf.test.basic.jmh_generated;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class BooleanTest_TestStateEncode_jmhType_B2 extends BooleanTest_TestStateEncode_jmhType_B1 {
    public volatile int setupTrialMutex;
    public volatile int tearTrialMutex;
    public final static AtomicIntegerFieldUpdater<BooleanTest_TestStateEncode_jmhType_B2> setupTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(BooleanTest_TestStateEncode_jmhType_B2.class, "setupTrialMutex");
    public final static AtomicIntegerFieldUpdater<BooleanTest_TestStateEncode_jmhType_B2> tearTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(BooleanTest_TestStateEncode_jmhType_B2.class, "tearTrialMutex");

    public volatile int setupIterationMutex;
    public volatile int tearIterationMutex;
    public final static AtomicIntegerFieldUpdater<BooleanTest_TestStateEncode_jmhType_B2> setupIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(BooleanTest_TestStateEncode_jmhType_B2.class, "setupIterationMutex");
    public final static AtomicIntegerFieldUpdater<BooleanTest_TestStateEncode_jmhType_B2> tearIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(BooleanTest_TestStateEncode_jmhType_B2.class, "tearIterationMutex");

    public volatile int setupInvocationMutex;
    public volatile int tearInvocationMutex;
    public final static AtomicIntegerFieldUpdater<BooleanTest_TestStateEncode_jmhType_B2> setupInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(BooleanTest_TestStateEncode_jmhType_B2.class, "setupInvocationMutex");
    public final static AtomicIntegerFieldUpdater<BooleanTest_TestStateEncode_jmhType_B2> tearInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(BooleanTest_TestStateEncode_jmhType_B2.class, "tearInvocationMutex");

}
