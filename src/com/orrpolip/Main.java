package com.orrpolip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        String n;
        List<Integer> numbers = new ArrayList<>();
        List<Integer> primes = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        n = scan.nextLine();

        int endNum = Integer.parseInt(n);

        int baseNum = 2;

        for (int counter = 0; counter < endNum -2 ; counter++) {

            baseNum += 1;

            numbers.add(baseNum);

        }
        primes.add(2);

        Double mySqrt;
        int remainder;

        for (int i = 0; i < numbers.size(); i++) {

            mySqrt = Math.sqrt(numbers.get(i));

            for (int j = 0; j < primes.size() ; j++) {

                if (mySqrt >= primes.get(j)) {

                    remainder = numbers.get(i) % primes.get(j);

                    if (remainder != 0){
                        continue;

                    }
                    else{
                        break;
                    }
                }
                else {
                    primes.add(numbers.get(i));
                    break;
                }

            }

        }

        System.out.println(numbers);
        System.out.println(primes);
    }
}
