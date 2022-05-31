package _03_behavioral_patterns._22_template._03_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    private String path;
    public FileProcessor(String path) {
        this.path = path;
    }

    public int process(Operator operator) {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) { // try 괄호안에 변수선언시 finally 블록에다 close 호출 안해도 알아서 해줌
            int result = 0;
            String line = null;
            while((line = reader.readLine()) != null) {
                result = operator.getResult(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }
}
