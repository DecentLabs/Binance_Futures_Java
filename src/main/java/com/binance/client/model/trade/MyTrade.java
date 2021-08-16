package com.binance.client.model.trade;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class MyTrade {

    private Long id;

    private Long orderId;

    private Boolean isBuyer;

    private BigDecimal commission;

    private String commissionAsset;

    private Long counterPartyId;

    private Boolean isMaker;

    private BigDecimal price;

    private BigDecimal qty;

    private BigDecimal quoteQty;

    private BigDecimal baseQty;

    private BigDecimal realizedPnl;

    private String side;

    private String positionSide;

    private String symbol;

    private String pair;

    private String marginAsset;

    private Long time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Boolean getIsBuyer() {
        return isBuyer;
    }

    public void setIsBuyer(Boolean isBuyer) {
        this.isBuyer = isBuyer;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public String getCommissionAsset() {
        return commissionAsset;
    }

    public void setCommissionAsset(String commissionAsset) {
        this.commissionAsset = commissionAsset;
    }

    public Long getCounterPartyId() {
        return counterPartyId;
    }

    public void setCounterPartyId(Long counterPartyId) {
        this.counterPartyId = counterPartyId;
    }

    public Boolean getIsMaker() {
        return isMaker;
    }

    public void setIsMaker(Boolean isMaker) {
        this.isMaker = isMaker;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getQuoteQty() {
        return quoteQty;
    }

    public void setQuoteQty(BigDecimal quoteQty) {
        this.quoteQty = quoteQty;
    }

    public BigDecimal getBaseQty() {
        return baseQty;
    }

    public void setBaseQty(BigDecimal baseQty) {
        this.baseQty = baseQty;
    }

    public BigDecimal getRealizedPnl() {
        return realizedPnl;
    }

    public void setRealizedPnl(BigDecimal realizedPnl) {
        this.realizedPnl = realizedPnl;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(String positionSide) {
        this.positionSide = positionSide;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public String getMarginAsset() {
        return marginAsset;
    }

    public void setMarginAsset(String marginAsset) {
        this.marginAsset = marginAsset;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
            .append("id", id)
            .append("orderId", orderId)
            .append("isBuyer", isBuyer)
            .append("commission", commission)
            .append("commissionAsset", commissionAsset)
            .append("counterPartyId", counterPartyId)
            .append("isMaker", isMaker)
            .append("price", price)
            .append("qty", qty)
            .append("quoteQty", quoteQty)
            .append("baseQty", baseQty)
            .append("realizedPnl", realizedPnl)
            .append("side", side)
            .append("positionSide", positionSide)
            .append("symbol", symbol)
            .append("pair", pair)
            .append("marginAsset", marginAsset)
            .append("time", time)
            .toString();
    }
}
