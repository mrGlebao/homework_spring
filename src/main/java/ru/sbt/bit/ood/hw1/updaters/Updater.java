package ru.sbt.bit.ood.hw1.updaters;

import org.apache.commons.csv.CSVRecord;

/**
 * Cbyreated  zabor on 04.12.2016.
 */
public interface Updater {
    void updateTrades(Iterable<CSVRecord> trades);
}
