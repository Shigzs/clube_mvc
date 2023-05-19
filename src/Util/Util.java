package Util;

import java.util.Random;

public class Util{
    public static Long gerarCartao(){
        Random rand = new Random();
        Long num = rand.nextLong(999999999);
        return num;
    }
}