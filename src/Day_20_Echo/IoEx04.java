package Day_20_Echo;

// java.io 패키지의 File 클래스 특징
//  1. File 클래스를 활용하면 일반 게시판에 파일 첨부기능이 있는 자료실을 만들 수 있다.
//  여기서는 이 클래스 하위에 있는 list() 메서드를 사용해서 해당 경로에 있는 파일목록을 문자열 배열로 반환해본다.

import java.io.File;

public class IoEx04 {
    static void main(String[] args) {

        File dirFile = new File("./src");
        String[] fileList = dirFile.list();

        // 문제1) 일반 for 반복문을 사용해서 파일목록을 가져와서 출력해본다.
        if (fileList != null) {

        for (int i = 0; i < fileList.length; i++) {
            System.out.println("파일명" + (i + 1) + ": " + fileList[i]);
        }
        }else {
            System.out.println("존재하지 않거나 읽을 수 없습니다.");
        }


        System.out.println("\n=====================");

        // 문제2) 향상된 확장 for 반복문을 사용해서 파일목록을 출력해본다.

        if (fileList != null) {
            for (String fileName : fileList) {
                System.out.println("파일명: " + fileName);
            }
        } else {
            System.out.println("디렉토리가 존재하지 않거나 읽을 수 없습니다.");
        }
    }
}

