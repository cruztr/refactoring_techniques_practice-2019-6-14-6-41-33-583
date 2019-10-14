package com.tws.refactoring.extract_variable;

public class BannerRender {

    public static final String MAC = "MAC";
    public static final String IE = "IE";
    public static final String IE_ON_MAC = "IE on Mac?";
    public static final String BANNER = "banner";

    public String renderBanner(String platform, String browser) {
        if (isPlatformMac(platform) && isBrowserIE(browser)) {
            return IE_ON_MAC;
        }
        return BANNER;
    }

    private boolean isBrowserIE(String browser) {
        return browser.toUpperCase().contains(IE);
    }

    private boolean isPlatformMac(String platform) {
        return platform.toUpperCase().contains(MAC);
    }
}
