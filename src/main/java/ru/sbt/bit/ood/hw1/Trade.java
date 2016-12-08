package ru.sbt.bit.ood.hw1;

import ru.sbt.bit.ood.hw1.values.TradeFieldValues;

import java.util.Map;

public class Trade {
    private final String tradeId;
    private final String instrument;
    private final double price;
    private final double quantity;

    public Trade(TradeFieldValues tfv) {
        Map<String, String> tradeFieldValues = tfv.toMap();
        tradeId = tradeFieldValues.get("tradeId");
        instrument = tradeFieldValues.get("instrument");
        price = Double.parseDouble(tradeFieldValues.get("price"));
        quantity = Double.parseDouble(tradeFieldValues.get("quantity"));
    }
}
