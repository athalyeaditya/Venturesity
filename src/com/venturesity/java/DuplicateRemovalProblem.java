package com.venturesity.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

/**
 * Created by aathalye
 * Date : 16/9/15
 * Time : 2:01 PM
 */
public class DuplicateRemovalProblem {

    public static void removeDupsAndPrintStrings(Collection<String> strings) {
        //Treeset uses a Red Black tree underneath which will give us log(n)
        //time for every operation, since strings will be maintained in sorted
        //order upon every insert by balancing the RB tree.
        //The set property will discard duplicates.
        TreeSet<String> treeSet = new TreeSet<>(strings);

        for (String s : treeSet) {
            System.out.println(s);
        }
    }

    public static void main(String[] r) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        Collection<String> strings = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            strings.add(br.readLine());
        }
        removeDupsAndPrintStrings(strings);
    }
}
