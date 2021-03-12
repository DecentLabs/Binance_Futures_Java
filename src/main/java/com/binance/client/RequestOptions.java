package com.binance.client;

import com.binance.client.constant.BinanceApiConstants;
import com.binance.client.exception.BinanceApiException;
import java.net.URL;

/**
 * The configuration for the request APIs
 */
public class RequestOptions {

    private String serverUrl;
    private String apiBase;

    public RequestOptions() {
        this(BinanceApiConstants.SERVER_URL_FAPI, BinanceApiConstants.API_BASE_FAPI);
    }

    public RequestOptions(String serverUrl, String apiBase) {
        setServerUrl(serverUrl);
        setApiBase(apiBase);
    }

    public RequestOptions(RequestOptions option) {
        this.serverUrl = option.serverUrl;
        this.apiBase = option.apiBase;
    }

    /**
     * Set the server URL for request.
     *
     * @param serverUrl The URL name like "https://fapi.binance.com".
     */
    public void setServerUrl(String serverUrl) {
        try {
            URL u = new URL(serverUrl);
            this.serverUrl = u.toString();
        } catch (Exception e) {
            throw new BinanceApiException(BinanceApiException.INPUT_ERROR, "The URI is incorrect: " + e.getMessage());
        }
        this.serverUrl = serverUrl;
    }

    /**
     * Set the api base for request.
     *
     * @param apiBase The API base like "/fapi/v1".
     */
    public void setApiBase(String apiBase) {
        this.apiBase = apiBase;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public String getApiBase() {
        return apiBase;
    }
}
