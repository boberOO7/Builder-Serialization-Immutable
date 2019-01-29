package com.liakhovskyi.serialization;

public interface Figure {

    float calculatePerimeter();
    float calculateArea();
    String getName();
    String getPerimeterXml();
    String getPerimeterJson();
    String getAreaXml();
    String getAreaJson();
 }
