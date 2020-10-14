package com.lolita.welzlAlgorithm.model;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import static java.util.Objects.nonNull;


public class JSONParse {
    private String url;

    public List<Object> getJson(Integer length, Integer width, Integer height, Integer dotsQuantity) {
        if (nonNull(length) || nonNull(width) || nonNull(height) || nonNull(dotsQuantity)){
            url = String.format("http://localhost:8080/random-dots?length=%d&width=%d&height=%d&dotsQuantity=%d",
                    length, width, height, dotsQuantity);
        }
        else {
            url = "http://localhost:8080/random-dots";
        }

        RestTemplate restTemplate = new RestTemplate();
        String resp = restTemplate.getForObject(url, String.class);

        JsonParser springParser = JsonParserFactory.getJsonParser();

        List<Object> list = springParser.parseList(resp);

        return list;
    }
}
