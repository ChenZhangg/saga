package com.github.timurstrekalov.saga.core.sourcepreloader;

import java.io.IOException;

import com.github.timurstrekalov.saga.core.cfg.Config;
import com.github.timurstrekalov.saga.core.RunStats;
import com.github.timurstrekalov.saga.core.instrumentation.ScriptInstrumenter;

interface SourcePreloader {

    /**
     * Preload the sources as specified by the config, adding them to the total run statistics.
     */
    void preloadSources(Config config, ScriptInstrumenter instrumenter, RunStats totalStats) throws IOException;

}