package ru.sbt.bit.ood.hw1.parsers;

import org.apache.commons.csv.CSVRecord;

/**
 * Created by zabor on 13.11.2016.
 */
public interface Parser {
    Iterable<CSVRecord> parse(String filename);
}
