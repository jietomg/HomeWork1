package org.future.code.homework.metal;

public class Test {
    public static void main(String[] args) {
        // incorrect: <Plastic> plasticSword = new Sword<>(new Plastic());
        Sword<Steel> steelSword = new Sword<>(new Steel());
        System.out.println(steelSword.isOk());
    }
}
