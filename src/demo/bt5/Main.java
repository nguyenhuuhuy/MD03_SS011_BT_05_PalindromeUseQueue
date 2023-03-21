package demo.bt5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String stName = sc.nextLine();
        String[] stNameSplipt = stName.split("");
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < stNameSplipt.length; i++) {
            queue.add(stNameSplipt[i]);
            stack.push(stNameSplipt[i]);
        }
        System.out.println("queue----> "+queue);
        System.out.println("stack-----> "+stack);
        boolean check = false;
        for (int i = 0; i < stNameSplipt.length; i++) {
            String queueCharacter = queue.poll();
            String stackCharacter = stack.pop();
//            System.out.print(queueCharacter);
//            System.out.print(stackCharacter);
            if (!stackCharacter.equalsIgnoreCase(queueCharacter)){
                System.out.println("không phải là chuỗi đảo ngược");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("chỗi trên là chuỗi đảo ngược");
        }

    }
}
