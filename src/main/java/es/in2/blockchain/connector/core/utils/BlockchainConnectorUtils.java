package es.in2.blockchain.connector.core.utils;

import org.springframework.stereotype.Component;

@Component
public class BlockchainConnectorUtils {

    private BlockchainConnectorUtils() {
    }

    public static final String HASHLINK_PARAMETER = "?hl=";
    public static final String CONTENT_HEADER = "Content-Type";
    public static final String APPLICATION_JSON_HEADER = "application/json";

}
