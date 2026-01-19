package Day_10_Cons;

// 13장. 생성자.pdf No.20쪽 2번문제
// Product 클래스 Product02 클래스로 변경해서 한다.

class Product02{
    String name;
    int price;

    public Product02(){ }

    public Product02(String name){
        this(name, 500);
    }
    public Product02(int price){
        this("커피", 800);
    }
    public  Product02(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void pr(){
        System.out.println(name + ", " + price);
    }
        }

public class Ex13_02 {
    public static void main(String[] args) {

        Product02 p01 = new Product02("물");
        Product02 p02 = new Product02(800);
        Product02 p03 = new Product02("웰치스", 700);

        p01.pr(); p02.pr(); p03.pr();
    }
}
