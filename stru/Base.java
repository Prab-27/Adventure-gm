package stru;

import java.util.ArrayList;
import java.util.Scanner;

public class Base {
    
    class Node{
        int points;     //points it can get
        Node left;  //left child
        Node right;     //right child
        String place;   // A place where user reach
        int eventIndex;  // An adventure event happen
        int eventIndex2;
        

        // A constructor for node
        Node(String place,int points,int eventIndex,int eventIndex2){
            this.place = place;
            this.points = points;
            this.eventIndex = eventIndex;
            this.eventIndex2 = eventIndex2;
        }

        Node(String place,int points,int eventIndex){
            this.place = place;
            this.points = points;
            this.eventIndex = eventIndex;
        }

        //A constuctor to creat a node with left and right
        Node(String place,int points,Node left,Node right,int eventIndex,int eventIndex2){
            this.place = place;
            this.points = points;
            this.left = left;
            this.right = right;
            this.eventIndex = eventIndex;
            this.eventIndex2 = eventIndex2;
        }

        Node(String place,int points,Node left,Node right,int eventIndex){
            this.place = place;
            this.points = points;
            this.left = left;
            this.right = right;
            this.eventIndex = eventIndex;
        }

        boolean isCheckSolution(int deal_number,int eventIndex){
            if (deal_number == 1 && (eventIndex == 0 || eventIndex == 2 || eventIndex == 12 || eventIndex == 28 || eventIndex == 32)) {
                return true;    
            }else if (deal_number == 0 && (eventIndex == 31 || eventIndex == 10 || eventIndex == 16 || eventIndex == 31)) {
                return true;
            }else if (deal_number == 2 && (eventIndex == 9) || eventIndex == 24) {
                return true;
            }else if (deal_number == 3 && (eventIndex == 13 || eventIndex == 18 || eventIndex == 19 || eventIndex == 23 || eventIndex == 33)) {
                return true; 
            }else if (deal_number == 4 && eventIndex == 22) {
                return true;
            }else if (deal_number == 5 && eventIndex == 27) {
                return true;
            } else if (deal_number == 6 && eventIndex == 4) {
                return true;
            }else if (deal_number == 7 && eventIndex == 7) {
                return true;
            }else{
                return false;
            }
        }

    }

    String getEvent(int index){      //A method that return a String from list of  adventure events
        ArrayList<String> eventList = new ArrayList<>();
        eventList.add(0,"A poltergeist that throws objects at the u,causing damage");
        eventList.add(4,"A giant squid that grabs the player’s boat or submarine with its tentacles and tries to drag it down");
        eventList.add(2,"A cannon that fires unexpectedly, creating a loud noise and a cloud of smoke.");
        eventList.add(7,"A crocodile that leaps out of the water and tries to bite the player or their boat");
        eventList.add(13,"A malfunctioning robot that goes rogue and attacks the player with its weapons or tools.");
        eventList.add(12,"A treasure chest that contains a deadly trap or a cursed item");
        eventList.add(10,"A bat swarm that flies out of the darkness and bites the player or obscures their vision.");
        eventList.add(9,"A waterfall that appears suddenly and forces the player to make a risky jump or swim.");
        eventList.add(18,"A carnivorous plant that traps the player with its vines and tries to digest them");
        eventList.add(16,"A volcanic eruption that spews lava and ash and creates earthquakes and tsunamis");
        eventList.add(22,"A sandstorm that blinds the player and buries them under piles of sand.");
        eventList.add(21,"A swarm of bees that stings the player and causes them to swell and suffocate.");
        eventList.add(19,"A lion that stalks and pounces on the player and tries to rip them apart with its claws and teeth.");
        eventList.add(28,"A dragon that breathes fire and burns the player and their vehicle.");
        eventList.add(27,"A yeti that ambushes the player and tries to crush them with its strength and fury.");
        eventList.add(24,"A mirage that lures the player to a false oasis and makes them drink contaminated water.");
        eventList.add(31, "The mixes of chemical spreads and leading unconsciousness");
        eventList.add(32, "they want to sacrifice u to their god");
        eventList.add(33, "zombies can kill u because they can smell u");

        // return a list of an event
        return eventList.get(index);
    } 

    void dealSituation(){
        System.out.println("How do u deal with this situation");
        System.out.println("choose correct option wisely");
        ArrayList<String> howdeal = new ArrayList<>();
        howdeal.add(0,"Run");
        howdeal.add(1,"Hide");
        howdeal.add(2,"wait");
        howdeal.add(3,"Fire");
        howdeal.add(4,"sleep");
        howdeal.add(5,"Fight");
        howdeal.add(6,"Swim");
        howdeal.add(7,"Climb to a tree");
        for (int i = 0; i < 8; i++) {
            System.out.println(i + " "+ howdeal.get(i));
        }
        //list of deal situation and print so user can choose

       
    }

    Scanner sc = new Scanner(System.in);
    void userDeal(Scanner sc,int eventIndex){
        System.out.println("how do u deal with this situation ? ");
        System.out.println("Write a number which action u want to do ....");
        int deal_number = sc.nextInt();
        isCheckSolution();
    }

    
    

    public static void main(String[] args) {
        System.out.println(getEvent(0));
    }

    class Events extends Question{
        String occure;
        String solution;
        int answer;
        boolean getPoints = false;

        Events (String eventocure ,String answer){
            this.occure = eventocure;
            this.solution = answer;    
        }

        Events(String que,int answer){
            this.occure = que;
            this.answer = answer;
        }

        @Override
        void askQue(String occure) {
            System.out.print("There is a question or a event waiting for u ");
            System.out.print("if u pass u will get points");
            System.out.println(occure);
            //tell user for a que or event
        }

        @Override
        boolean isPass(String userAns) {
            if (userAns.equalsIgnoreCase(solution)) {
                getPoints = true;
               return true; 
            }
            return false;
            //chk user ans if its in String
        }

        @Override
        boolean isPass(int ans) {
            if (answer == ans) {
                getPoints = true;
                return true;
            }
            return false;
            //chk user ans if in int
        }
        
    }

    private Node root = new Node("U r at dark forest", 5,34);


    private void construct(){
        Node n = new Node("A hord of Zombies in a post - apocalyptic city", 10,33);
        Node m = new Node("U r kidnapped by a cult ", 10,32);
        Node g = new Node("A haunted house", 5, 0,1);
        Node h = new Node("An old fort", 5, null,null,2,3);
        Node i = new Node("At the unknown sea without direction",8,4);
        Node j = new Node("A reiverFront only", 2, null, null,7,9);
        Node k = new Node("Danger chemical laboratory", 9,31);
        Node l = new Node("At the bad robotic world", 9,13);
        Node f = new Node("A secret cave", 5, m, n,10,12);
        Node e = new Node("An unknown island", 6, k, l,16,18);
        Node d = new Node("Jungle full of wild Animals", 9, i, j,19,21);
        Node c = new Node("A dessert", 4, g, h,22,24);
        Node a = new Node("Himaliyan Mountains", 10, c, d,27);
        Node b = new Node("Dragon Safari", 8, e, f,28);
        root.left = a;
        root.right = b;

    }

    public void start(Scanner sc){
        System.out.println("Hi,lets play an adventure game");
        System.out.println("Here, U hve a bicycle & a cute dogi for giving company");
        System.out.println("hey! stop whats ur name write ur name first");
        System.out.println("");
    }
    
}
