package stru;

import java.util.Scanner;

public class Based {
    class Node {
        Node left;
        Node right;
        int value;
        String space;
        int height;
        int live;
        int[] ary = new int[3];

        public Node(int live){
            this.value = live;
        }
        
    }
    private Node root;

    Scanner sc = new Scanner(System.in);
    public void start(){
        
        System.out.println("here, u r at dark room u have no idea where it is!!!");
        System.out.println("so u have 2 options left door and right door choose any one");
        System.out.println("let's start ...");
        
        choseDoor(root);
    }
    private void choseDoor(Node node){
        System.out.println("write only left or right in small order");
        String door = sc.next();
        System.out.println();
        if (door.equals("left")) {
            int y = path();
            node.left = new Node(node.live);
            atNode(y,node.left);
            
        }
        if (door.equals("right")) {
            node.right = new Node(node.live);
            path();
        }
    }

    private int path(){
        System.out.println("u r at path for ur next destination");
        System.out.print("In this there are 3 things which one u want to carry with u ");
        System.out.println("And this thing will useful or not depend on ur next destination");

        System.out.println("1st apples on a tree");
        System.out.println("2nd a water bottle made with metal");
        System.out.println("3rd some wooden sticks and a match box");
        System.out.println("one which u want to carry write a number");
        
        int t = sc.nextInt();
        return t;
    }

    private void atNode(int t,Node node){
        System.out.println("Wlc at ....");
        if (((node.value * t) & 1) == 0) {
            if ((t & 1) == 1) {
                node.space = "Himaliyan Mountains";
                System.out.println(node.space);
                switch (t) {
                    case 1:
                        System.out.println("U can eat apples so u r safe");
                        node.live = 5;
                        break;
                    case 2:
                        System.out.println("No need of water,water every where, its too cold");
                        node.live = 1;
                        break;
                    case 3:
                        System.out.println("ya u can get heat from fire");
                        node.live = 2;
                        break;
                }
            }else{
                node.space = "Jungle with Animals";
                System.out.println(node.space);
                switch (t) {
                    case 1:
                        System.out.print("u r around trees, full of fruits!!!");
                        node.live = 1;
                        break;
                    case 2:
                        System.out.println("U can use water to drink");
                        node.live = 3;
                        break;
                    case 3:
                        System.out.println("U can save urself with fire");
                        node.live = 5;
                        break;

                }
            }
        }else{
            
        }
        choseDoor(node);
    }
    

    public int height(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        if (root == null) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("whats ur name?");
        String nam = sc.next();
        System.out.println("hi"+ nam);
        System.out.println("lets start our game , " + nam + "!!");
        Based bw = new Based();
        bw.start();

    }
}
