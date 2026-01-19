package Day_20_Echo;

import java.io.File;

/*
    java.io 패키지의 File 내장 클래스 하위 메서드에 관한 실습)
*/
public class IoEx12 {
    public static void main(String[] args) {

        String path = "./src";
        File dirPath = new File(path);
        String[] fileLists = dirPath.list(); // src 폴더의 파일목록을 문자열 배열로 반환

        for (String fileName : fileLists) {
            File f = new File(path + "/" + fileName);

            System.out.println("\n===========================\n");
            System.out.println("파일이름: " + f.getName());
            System.out.println("경로: " + f.getPath());
            System.out.println("절대경로: " + f.getAbsolutePath());
            System.out.println("디렉토리 여부: " + f.isDirectory());
            System.out.println("파일여부: " + f.isFile());
        }
    }
}
