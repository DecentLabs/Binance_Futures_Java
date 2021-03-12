package com.binance.client.impl;

import com.binance.client.RequestOptions;
import com.binance.client.SubscriptionClient;
import com.binance.client.SubscriptionOptions;
import com.binance.client.SyncRequestClient;
import java.net.URI;

public final class BinanceApiInternalFactory {

    private static final BinanceApiInternalFactory instance = new BinanceApiInternalFactory();

    public static BinanceApiInternalFactory getInstance() {
        return instance;
    }

    private BinanceApiInternalFactory() {
    }

    public SyncRequestClient createSyncRequestClient(String apiKey, String secretKey, RequestOptions options) {
        RequestOptions requestOptions = new RequestOptions(options);
        RestApiRequestImpl requestImpl = new RestApiRequestImpl(apiKey, secretKey, requestOptions);
        return new SyncRequestImpl(requestImpl);
    }

    public SubscriptionClient createSubscriptionClient(String apiKey, String secretKey, SubscriptionOptions options) {
        SubscriptionOptions subscriptionOptions = new SubscriptionOptions(options);
        RequestOptions requestOptions = new RequestOptions();
        try {
            String host = new URI(options.getUri()).getHost();
            requestOptions.setServerUrl("https://" + host);
        } catch (Exception e) {

        }
        SubscriptionClient webSocketStreamClient = new WebSocketStreamClientImpl(apiKey, secretKey,
                subscriptionOptions);
        return webSocketStreamClient;
    }

}
