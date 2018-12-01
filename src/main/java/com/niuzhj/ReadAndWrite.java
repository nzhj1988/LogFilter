/**
 * @program: LogFilter
 * @description:
 * @author: ZhaoJie Niu
 * @create: 2018-12-01 16:09
 **/

package com.niuzhj;

import java.io.*;

public class ReadAndWrite {
    public static void raw(String fileReader, String fileWriter, String keyWords) {
        BufferedReader buff_Reader = null;
        BufferedWriter buff_Writer = null;

        String[] keyWord = keyWords.split(",");
        int count = keyWord.length;

        try {
            buff_Reader = new BufferedReader(new FileReader(fileReader));
            buff_Writer = new BufferedWriter(new FileWriter(fileWriter));

            String readLine;
            String writeLine;

            while((readLine = buff_Reader.readLine()) != null) {

                for(int i=0; i<count; i++) {
                    writeLine = Filter.filterFunc(readLine, keyWord[i]);

                    if(writeLine.length() > 0) {
                        buff_Writer.write(writeLine, 0, writeLine.length());
                        buff_Writer.newLine();
                        break;
                    } else {
                        continue;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert buff_Reader != null;
            try {
                buff_Reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            assert buff_Writer != null;
            try {
                buff_Writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
