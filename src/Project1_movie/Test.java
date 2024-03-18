package Project1_movie;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        Movie m1 = new Movie(1,"电影1",29.9,9.8,"康超越","康超越","100万人想看");
        Movie m2 = new Movie(2,"电影1",29.9,9.8,"康超越","康超越","100万人想看");
        Movie m3 = new Movie(3,"电影1",29.9,9.8,"康超越","康超越","100万人想看");

        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;

        MovieOperator operator = new MovieOperator(movies);
//        operator.printAllMovies();
//        operator.searchMovieById(3);

        System.out.println("==电影信息系统==");
        System.out.println("1、查询全部电影信息");
        System.out.println("2、根据id查询某个电影的详细信息展示");
        System.out.println("请输入操作命令:");
        Scanner sc = new Scanner(System.in);
        int command = sc.nextInt();
        switch (command){
            case 1:
                operator.printAllMovies();
                break;
            case 2:
                System.out.println("请您输入查询的电影id:");
                int id = sc.nextInt();
                operator.searchMovieById(id);
                break;
            default:
                System.out.println("您输入的命令有问题~~");
                break;
        }
    }
}
