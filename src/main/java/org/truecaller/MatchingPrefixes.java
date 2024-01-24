package org.truecaller;

import org.truecaller.Utils.FileHelper;

import java.io.*;
import java.util.*;

public class MatchingPrefixes {
    public static void main(String[] args) {

        Tst tst = new Tst();
        System.out.println("Matching Longest Prefix");

        //Upload all prefixes from sample_prefixes file in Resources directory
        String sample_prefixes ="sample_prefixes.txt";

        InputStream is = FileHelper.getPrefixesFileAsIOStream(sample_prefixes);
        ArrayList<String> prefixes_list;

        try {
            prefixes_list = FileHelper.uploadPrefixesFileContent(is);

            for (String prefix : prefixes_list) {
                tst.add(prefix);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get search key from user with console
        try {
            Scanner scanner = new Scanner(new InputStreamReader(System.in));
            System.out.println("Enter the search key: ");

            String search_Key = scanner.nextLine();
            Optional<String> longestPrefixInputResult = tst.longestPrefixOf(search_Key);

            if (longestPrefixInputResult.isPresent()) {
                System.out.println("The longest Prefix Result: " + longestPrefixInputResult.get());

            }
            else {
                System.out.println("No search result found.");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}