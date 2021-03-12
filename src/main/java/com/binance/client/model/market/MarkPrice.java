package com.binance.client.model.market;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class MarkPrice {

    private String symbol;

    private BigDecimal markPrice;

    private BigDecimal lastFundingRate;

    private Long nextFundingTime;

    private Long time;

    private String pair;

    private BigDecimal indexPrice;

    private BigDecimal estimatedSettlePrice;

    private BigDecimal interestRate;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(BigDecimal markPrice) {
        this.markPrice = markPrice;
    }

    public BigDecimal getLastFundingRate() {
        return lastFundingRate;
    }

    public void setLastFundingRate(BigDecimal lastFundingRate) {
        this.lastFundingRate = lastFundingRate;
    }

    public Long getNextFundingTime() {
        return nextFundingTime;
    }

    public void setNextFundingTime(Long nextFundingTime) {
        this.nextFundingTime = nextFundingTime;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public BigDecimal getIndexPrice() {
        return indexPrice;
    }

    public void setIndexPrice(BigDecimal indexPrice) {
        this.indexPrice = indexPrice;
    }

    public BigDecimal getEstimatedSettlePrice() {
        return estimatedSettlePrice;
    }

    public void setEstimatedSettlePrice(BigDecimal estimatedSettlePrice) {
        this.estimatedSettlePrice = estimatedSettlePrice;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("symbol", symbol)
                .append("markPrice", markPrice).append("lastFundingRate", lastFundingRate)
                .append("nextFundingTime", nextFundingTime).append("time", time)
                .append("pair", pair).append("indexPrice", indexPrice)
                .append("estimatedSettlePrice", estimatedSettlePrice).append("interestRate", interestRate)
                .toString();
    }
}
