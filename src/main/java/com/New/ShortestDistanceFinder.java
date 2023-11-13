package com.New;

public class ShortestDistanceFinder {

    public static int shortestDistance2(String document, String word1, String word2) {
        String[] words = document.split(" ");
        int minDistance = Integer.MAX_VALUE;
        int indexWord1 = -1;
        int indexWord2 = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                indexWord1 = i;
                if (indexWord2 != -1) {
                    int distance = Math.abs(indexWord1 - indexWord2);
                    minDistance = Math.min(minDistance, distance);
                }
            } else if (words[i].equals(word2)) {
                indexWord2 = i;
                if (indexWord1 != -1) {
                    int distance = Math.abs(indexWord1 - indexWord2);
                    minDistance = Math.min(minDistance, distance);
                }
            }
        }

        return minDistance;
    }

    public static double shortestDistance(String document, String word1, String word2){
        document = document.toLowerCase();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int sDist = Integer.MAX_VALUE;
        String words[] = document.split("[[ ]*|[,]*|[\\.]]*");
        for( int i=0; i<words.length; i++ ){
            if(words[i].equals(word1)){
                for(int j=0; j<words.length; j++){
                    if (words[j].equals(word2)) {
                        int start = Math.min(i, j);
                        int end = Math.max(i, j);
                        int dist = end - start;
                        dist += (word1.length() + word2.length()) / 2;
                        for(int k = start+1; k<end; k++){
                            dist += words[k].length();
                        }
                        sDist = Math.min(sDist, dist);
                    }
                }
            }
        }
        return sDist;
    }

    public static void main(String[] args) {
        String document = "Example we just made up";
        String word1 = "we";
        String word2 = "just";

        double distance = shortestDistance(document, word1, word2);
        System.out.println("Shortest distance: " + distance);
    }
}

