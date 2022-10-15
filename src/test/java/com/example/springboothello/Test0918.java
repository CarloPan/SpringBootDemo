package com.example.springboothello;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class Test0918 {

    public static void main(String[] args) {
        String hosts = "192.168.1.1:9200,192.168.1.2:9202,0.0.1.3:9203";

        String[] hostHosts= hosts.split(",");
        //Stream<String> stream = Arrays.stream(hostParts);
        Arrays.stream(hostHosts).map(host -> {
            String[] hostParts = host.split(":");
            return null;
        }).filter(Objects::nonNull);
    }
}
