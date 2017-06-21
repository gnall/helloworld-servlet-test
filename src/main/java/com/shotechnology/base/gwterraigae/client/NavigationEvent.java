package com.shotechnology.base.gwterraigae.client;

public class NavigationEvent
{
    private Page page;

    public NavigationEvent() {
    }

    public NavigationEvent(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}