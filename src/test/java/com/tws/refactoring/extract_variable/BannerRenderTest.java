package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {
    @Test
    public void should_return_banner_when_browser_is_IE() {
        BannerRender bannerRender = new BannerRender();
        String banner= bannerRender.renderBanner("Windows","IE" );

        assertEquals("banner", banner );
    }

    @Test
    public void should_return_banner_when_platform_is_Mac() {
        BannerRender bannerRender = new BannerRender();
        String banner= bannerRender.renderBanner("Mac","IE" );

        assertEquals("IE on Mac?", banner );
    }
}