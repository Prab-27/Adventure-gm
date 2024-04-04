package stru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
            System.out.println("Congratulation....");
            where(live);
            this.value = live;
        }
        
    }
    private Node root;

    Scanner sc = new Scanner(System.in);
    
    private void road(Node node){
        System.out.println("write a number");
        int no = sc.nextInt();
        while (no > 7) {
            no = no/7;
        }
        node.left = new Node(no);
        node.right = new Node(no);

    }
    public void start(){
        System.out.println("lets go!!!...");
        
    }
    private void where(int no){
        String space = atNode().get(no);
        System.out.println("U r at "+ space);
        System.out.println("how can u reach at home ? ");
        System.out.print("ya i have a key how can u reach at home");
        System.out.println("Enter a number b/w 1 to 100");
        int eventdecide = sc.nextInt();
        while (eventdecide > 13) {
            eventdecide = eventdecide/13;
        }
        if (no == 9) {
            eventdecide = 5;
        }else if (no == 10) {
            eventdecide = 7;
        }
        if (eventdecide == 5 || eventdecide == 7) {
            eventdecide = eventdecide -1;
        }
        System.out.println("so u get ....");
        eventsList(eventdecide);
        System.out.println("what do u think to face this situation");
        
    }
   
    private List things(){
        ArrayList<String> carylist = new ArrayList<>();
        carylist.add("Apple");
        carylist.add("knife");
        carylist.add("Compass");
        carylist.add("Rope");
        carylist.add("Match box");
        carylist.add("water bottle");
        carylist.add("Scarf");
        carylist.add("Wooden sticks");
        
        return carylist;
       
    }
    public boolean choseThings(int no,List<E> takeList){
        if (no > 8) {
            return true;
        }
        System.out.println("enter a no which thing u want to carry");
        System.out.println(Arrays.toString(takeList));
        int takeThing = sc.nextInt();
        if (no == 0) {
            if (takeThing == 1 || takeThing == 4 || takeThing == 3) {
                return true;
            }
        }else if (no == 1) {
            if (takeThing == 0 || takeThing == 4 ||takeThing == 6 || takeThing == 7) {
                return true;
            }
        }else if (no == 2) {
            if (takeThing == 4 || takeThing == 6 || takeThing == 7 || takeThing == 1) {
                return true;
            }
        }else if (no == 3) {
            if (takeThing == 7 || takeThing == 6 || takeThing == 4 || takeThing == 0) {
                return true;
            }
        }else if (no == 4) {
            if (takeThing == 2 || takeThing == 4) {
                return true;
            }
        }else if (no == 5) {
            if (takeThing == 5 || takeThing == 4 || takeThing == 2 || takeThing == 3) {
                return true;
            }
        }else if (no == 6) {
            if (takeThing == 4 || takeList == 2 || takeThing == 3) {
                return true;
            }
        }else if (no == 7) {
            if (takeThing == 6 || takeThing == 2 || takeThing == 0) {
                return true;
            }
        }else if (no == 8) {
            if (takeThing == 5 || takeThing == 2 || takeThing == 6) {
                return true;
            }
        }
        

    }
    public void selectthings(List<String> caryList){
         for (int i = 0; i < 7; i++) {
            System.out.println(carylist.indexOf(i) + " " +carylist.get(i));
        }
        System.out.println("write number u want to take");
        int[] takeAry = new int[3];
        for (int i = 0; i < takeThing.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("u have chose....");
        System.out.println(Arrays.toString(takeAry));
        System.out.println("u want to change things if yes type 1 if no type any number");
        int chk = sc.nextInt();
        if (chk == 1) {
            selectthings();
        }else{
            return;
        }
    }
    
    
    

    private List<String> spcList(){
        ArrayList<String> spaceList = new ArrayList<>();
        spaceList.add("Himaliyan Mountains with full of ice");
        spaceList.add("Jungle where wild animals");
        spaceList.add("River front only");
        spaceList.add("A secret cave");
        spaceList.add("A Haunted house");
        spaceList.add("An old fort");
        spaceList.add("A Dessert ");
        spaceList.add("dragon Safari");
        spaceList.add("At the unkown island");
        spaceList.add(" a horde of zombies in a post - apocalyptic city");
        spaceList.add("U r kidnapped by a cult ");
        return spaceList;
    }
    private String eventsList(int eventdecide){
        ArrayList<String> eventList = new ArrayList<>();
        eventList.add("Attacked by a monster");
        eventList.add("A thunder strom");
        eventList.add("Attacked by a swarm of Giant insects ");
        eventList.add("high raining");
        eventList.add("they want to sacrifice u to their god");
        eventList.add("A smart powerful Robot want to kill u");
        eventList.add("zombies can kill u because they can smell u");
        eventList.add("A danger chemical spreads here...");
        eventList.add("A live hot volcano");
        eventList.add("u get a key of a big treasure");
        eventList.add("u get delicious food");
        eventList.add("u wlc by a king of where u r");
        eventList.add("U can get a hidden gem");

        return eventList.get(eventdecide);
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
        System.out.println(bw.check());
    

        /* === for zombies and screifice god chk event and space */

    }
}



