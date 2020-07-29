package com.elaine.testpattern.builder;

/**
 * @author elaine
 * @date 2020/7/28
 */
public class Director {
    private ProductBuilder builder;

    public Director(ProductBuilder builder) {
        this.builder = builder;
    }

    public Product makeProduct(String productName, String companyName, String part1, String part2, String part3, String part4) {
        builder.builderProductName(productName);
        builder.builderCompanyName(companyName);
        builder.builderPart1(part1);
        builder.builderPart2(part2);
        builder.builderPart3(part3);
        builder.builderPart4(part4);

        Product product = builder.build();
        return product;
    }
}
