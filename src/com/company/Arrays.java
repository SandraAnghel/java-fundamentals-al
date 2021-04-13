package com.company;

public class Arrays {

    public static int getFirstValue(int[] numbers) {
        return numbers[0];
    }

    public static int getVoteCount(int upvotes, int downvotes) {
        return upvotes - downvotes;
    }

    public static int[] makePair(int a, int b) {
        int[] makePairs = new int[2];
        makePairs[0] = a;
        makePairs[1] = b;
        return makePairs;
    }
}
