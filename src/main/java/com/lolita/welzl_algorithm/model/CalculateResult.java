package com.lolita.welzl_algorithm.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lolita.welzl_algorithm.algorithm.SmallestEnclosingCircle;
import com.lolita.welzl_algorithm.algorithm.Point;
import com.lolita.welzl_algorithm.algorithm.Circle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CalculateResult {
    private List<Point> dotList = new ArrayList<Point>(); // two-dimensional representation of dot
    private List<Object> zList = new ArrayList<Object>();
    private String resultJSON;

    private Double asDouble(Object o) {
        Double val = null;
        if (o instanceof Number) {
            val = ((Number) o).doubleValue();
        }
        return val;
    }

    private Object getResult(Integer length, Integer width, Integer height, Integer dotsQuantity) {
        JSONParse json = new JSONParse();
        List<Object> jsonList = json.getJson(length, width, height, dotsQuantity);

        for (Object o : jsonList) {
            if (o instanceof Map) {
                Map<String, Object> map = (Map<String, Object>) o;

                Point dot = new Point(asDouble(map.get("x")), asDouble(map.get("y")));
                dotList.add(dot);
                zList.add(asDouble(map.get("z")));
            }
        }

        SmallestEnclosingCircle algorithm = new SmallestEnclosingCircle();
        Circle c = new Circle(null, 0);
        long startTime = System.currentTimeMillis();
        c = algorithm.makeCircle(dotList);
        long totalTime = System.currentTimeMillis() - startTime;

        com.lolita.welzl_algorithm.model.Result result = new com.lolita.welzl_algorithm.model.Result(c, asDouble(Collections.min(zList, null)), asDouble(Collections.max(zList, null)),
                zList.size(), totalTime);

        return result;
    }

    public String getResultJSON (Integer length, Integer width, Integer height, Integer dotsQuantity) {
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            resultJSON = objectMapper.writeValueAsString(getResult(length, width, height, dotsQuantity));

        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return resultJSON;
    }
}