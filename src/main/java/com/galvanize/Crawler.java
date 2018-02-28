package com.galvanize;

import java.net.URI;

class Crawler implements Browseable {

    private URI currentPage;

    @Override
    public void visit(URI uri) {
        currentPage = uri;
    }

    @Override
    public URI getCurrentPage() {
        return currentPage;
    }
}
