package com.elaine.testpattern.builder;

/**
 * @author elaine
 * @date 2020/7/28
 */
public interface ProductBuilder {
    void builderProductName(String productName);

    void builderCompanyName(String companyName);

    void builderPart1(String part1);

    void builderPart2(String part2);

    void builderPart3(String part3);

    void builderPart4(String part4);

    Product build();
}
