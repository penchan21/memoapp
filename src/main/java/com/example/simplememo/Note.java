package com.example.simplememo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Note {
    /** ID */
    public int id;
    /** ノートの名前 */
    public String title;
    /** ノートの本文 */
    public String body;
    /** 編集日時 */
    public Date date;

    public List<String> getBodyAsList() {
        List<String> lineList = new ArrayList<>();
        String[] stringArray = body.split("\n");
        for (String line : stringArray) {
            lineList.add(line);
        }
        return lineList;
    }

}