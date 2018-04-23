package by.it.pilipuk.lesson03;

import java.util.Scanner;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
        public static int main(String[] args) {
          Scanner sc=new Scanner(System.in);
                  int a= sc.nextInt();
                     System.out.println(" ");
        int b= sc.nextInt();
        System.out.println(" ");
        int c= sc.nextInt();
        int dis =b*b-4*a*c;
        double scdis=Math.sqrt(dis);


        if (dis>0) System.out.println((-b+scdis)/2*a + " " + (-b-scdis)/2*a);

        if (dis==0) System.out.println((-b-scdis)/2*a);

        if (dis<0) System.out.println("Отрицательный дискриминант");

       private static double dis (int a, int b, int c){
            return b*b-4*a*c;
    }
}
