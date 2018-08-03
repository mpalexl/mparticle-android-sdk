package com.mparticle.testutils;

import android.support.test.InstrumentationRegistry;

import com.mparticle.MParticle;

import org.junit.Before;

/**
 * Base class that will replicate the scenario or an app that has started, but has not called
 * MParticle.start(). This base class is useful for testing initialization behavior.
 */
abstract public class BaseCleanInstallEachTest extends BaseAbstractTest {

    @Before
    public void beforeBase() throws Exception {
        if (MParticle.getInstance() != null) {
            MParticle.reset(mContext);
        }
    }
}
