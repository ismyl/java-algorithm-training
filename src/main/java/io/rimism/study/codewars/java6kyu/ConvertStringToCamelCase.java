package io.rimism.study.codewars.java6kyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @apiNote https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
 * @since 2020.03.10
 * */
public class ConvertStringToCamelCase {

    static String toCamelCase(String s){
        String[] splitTarget;
        if(s.lastIndexOf("-") > 0) {
            splitTarget = s.split("-");
        } else if(s.lastIndexOf("_") > 0) {
            splitTarget = s.split("_");
        } else {
            return "";
        }

        StringBuilder returnTarget = new StringBuilder();
        for(int i = 0; i < splitTarget.length; i++) {
            if(i == 0) {
                returnTarget.append(splitTarget[i]);
            } else {
                String target = splitTarget[i];
                for (int j = 0; j < target.length(); j++) {
                    if (j == 0) {
                        returnTarget.append(Character.toUpperCase(target.charAt(j)));
                    } else {
                        returnTarget.append(target.charAt(j));
                    }
                }
            }
        }

        return returnTarget.toString();
    }

    static String toCamelCase_BASE_PRACTICE(String s){
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }
}
