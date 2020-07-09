module scribejava.core {
    requires transitive com.fasterxml.jackson.databind;

    exports com.github.scribejava.core.builder;
    exports com.github.scribejava.core.builder.api;
    exports com.github.scribejava.core.exceptions;
    exports com.github.scribejava.core.extractors;
    exports com.github.scribejava.core.httpclient;
    exports com.github.scribejava.core.httpclient.jdk;
    exports com.github.scribejava.core.httpclient.multipart;
    exports com.github.scribejava.core.java8;
    exports com.github.scribejava.core.model;
    exports com.github.scribejava.core.oauth;
    exports com.github.scribejava.core.oauth2;
    exports com.github.scribejava.core.oauth2.bearersignature;
    exports com.github.scribejava.core.oauth2.clientauthentication;
    exports com.github.scribejava.core.pkce;
    exports com.github.scribejava.core.revoke;
    exports com.github.scribejava.core.services;
    exports com.github.scribejava.core.utils;

    provides com.github.scribejava.core.httpclient.HttpClientProvider with
        com.github.scribejava.core.httpclient.jdk.JDKHttpProvider;

}
