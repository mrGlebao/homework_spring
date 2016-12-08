package ru.sbt.bit.ood.hw1.updaters;

import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import ru.sbt.bit.ood.hw1.Trade;
import ru.sbt.bit.ood.hw1.values.TradeFieldValues;
import ru.sbt.bit.ood.hw1.dao.TradesDAO;

/**
 * Created by zabor on 13.11.2016.
 */
public class TradesUpdater implements Updater{


    private final TradesDAO tradesDAO;
    @Autowired
    private TradeFieldValues tradeFieldValues;

    public TradesUpdater(TradesDAO tradesDAO) {
        this.tradesDAO = tradesDAO;
    }


    public void updateTrades(Iterable<CSVRecord> trades) {
        tradesDAO.deleteAll();
        for (CSVRecord tradeRecord : trades) {
            tradeFieldValues.setMap(tradeRecord.toMap());
            Trade trade = new Trade(tradeFieldValues);
            tradesDAO.save(trade);
        }
    }
}