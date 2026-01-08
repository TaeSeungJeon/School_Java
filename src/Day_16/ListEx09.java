package Day_16;

import java.util.ArrayList;
import java.util.List;

/* 컬렉션에 제네릭을 지정함으로서 불필요한 레퍼런스간의 형변환인 업캐, 다캐 하지않는 예)
 */
public class ListEx09 {
    static void main(String[] args) {

        List<String> cityList = new ArrayList<String>(); // <String> 문자열 제네릭 타입을 지정해서 문자열값만 저장가능.
        
        cityList.add("seoul");
        cityList.add("daegu");
        cityList.add("busan");  // 문자열 값만 저장 가능
        
        String cityName = null;
        for (int i = 0; i < cityList.size(); i++) {

            cityName = cityList.get(i);
            System.out.print(cityName.toUpperCase()+"\t");
        }
        System.out.println("\n======================");

        for (String name : cityList) {
            System.out.println(name.toUpperCase());
        }
    }
}
