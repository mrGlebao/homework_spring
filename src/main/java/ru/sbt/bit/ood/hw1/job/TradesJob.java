package ru.sbt.bit.ood.hw1.job;

import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import ru.sbt.bit.ood.hw1.downloaders.Downloader;
import ru.sbt.bit.ood.hw1.parsers.Parser;
import ru.sbt.bit.ood.hw1.updaters.Updater;

public class TradesJob {

    @Autowired
    private Parser parser;
    @Autowired
    private Downloader downloader;
    @Autowired
    private Updater updater;


    public void run() {
        String filename = downloader.download();
        Iterable<CSVRecord> tradeRecords = parser.parse(filename);
        updater.updateTrades(tradeRecords);
    }
}