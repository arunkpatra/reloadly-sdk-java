package software.reloadly.sdk.core.enums;

import software.reloadly.sdk.core.constant.ServiceURLs;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Service {
    BILLPAY(ServiceURLs.BILLPAY, ServiceURLs.BILLPAY),
    BILLPAY_SANDBOX(ServiceURLs.BILLPAY_SANDBOX, ServiceURLs.BILLPAY_SANDBOX),
    GIFTCARD(ServiceURLs.GIFTCARD, ServiceURLs.GIFTCARD),
    GIFTCARD_SANDBOX(ServiceURLs.GIFTCARD_SANDBOX, ServiceURLs.GIFTCARD_SANDBOX),
    AIRTIME(ServiceURLs.AIRTIME, "https://topups-hs256.reloadly.com"),
    AIRTIME_SANDBOX(ServiceURLs.AIRTIME_SANDBOX, "https://topups-hs256-sandbox.reloadly.com");

    private final String serviceUrl;
    private final String serviceAudience;
}
