package org.apache.commons.text.similarity;

public class MM {

    public static void main(String[] args) {
        LevenshteinDistance ld = new LevenshteinDistance();
        int i = ld.apply("Bruno", "Bren");
        System.out.println(i);
        
        LevenshteinDetailedDistance ldd = new LevenshteinDetailedDistance();
        LevenshteinResults lr = ldd.apply("Bruno", "Bren");
        System.out.println(lr);
        
        LevenshteinDetailedDistance2 ldd2 = new LevenshteinDetailedDistance2();
        LevenshteinResults lr2 = ldd2.apply("Bruno", "Bren");
        System.out.println(lr2);
    }

}
