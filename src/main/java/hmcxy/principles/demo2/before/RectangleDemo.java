package hmcxy.principles.demo2.before;

public class RectangleDemo {

    public static void main(String[] args) {

        //创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        //调用resize方法扩宽
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("==============");

        Square square = new Square();
        square.setLength(10);
        resize(square);
        printLengthAndWidth(square);


    }

    //扩宽方法
    public static void resize(Rectangle rectangle){
        //判断，如果宽的长度比长小，进行扩宽的操作
        while (rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    //打印长和宽
    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }



}
