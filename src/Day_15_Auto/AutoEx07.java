package Day_15_Auto;
/* 1. 문자열을 다루는 String 내장 API클래스는 자기 자신 내용을 수정할 수 없다.
   2. StringBuffer 내장 API는 자기 자신값을 수정할 수 있다.
 */

public class AutoEx07 {
    static void main(String[] args) {

        String cityName = "daejeon";

        System.out.println("도시이름을 영문대문자로 변경 :" + cityName.toUpperCase());
        System.out.println("cityName: " + cityName);
        System.out.println("'daejeon' 문자 길이: " + cityName.length());
        System.out.println("'daejeon' 세번째 단일문자: " + cityName.charAt(2));
        System.out.println("'daejeon' 에서 e가 몇번째 위치?: " + (cityName.indexOf('e') + 1));
        System.out.println("====================================");

        StringBuffer str01 = new StringBuffer();
        str01.append("Java");
        str01.append(" Programming");
        System.out.println("추가된 문자: " + str01.toString());

        String resultChar = str01.substring(0, 4);
        System.out.println("0이상 4미만 사이의 문자반환: " + resultChar);

        str01.replace(0, 4, "Jsp");
        System.out.println("변경된 문자: " + str01.toString());
    }
}
