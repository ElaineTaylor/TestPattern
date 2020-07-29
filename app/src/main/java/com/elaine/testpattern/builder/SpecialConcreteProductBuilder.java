package com.elaine.testpattern.builder;

/**
 * @author elaine
 * @date 2020/7/28
 */
public class SpecialConcreteProductBuilder implements ProductBuilder {
    private String productName;
    private String companyName;
    private String part1;
    private String part2;
    private String part3;
    private String part4;

    @Override
    public void builderProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public void builderCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void builderPart1(String part1) {
        this.part1 = part1;
    }

    @Override
    public void builderPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public void builderPart3(String part3) {
        this.part3 = part3;
    }

    @Override
    public void builderPart4(String part4) {
        this.part4 = part4;
    }

    @Override
    public Product build() {
        return new Product(this.productName, this.companyName, this.part1, this.part2, this.part3, this.part4);
    }
}