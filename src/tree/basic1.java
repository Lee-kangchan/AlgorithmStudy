package tree;

import java.util.Scanner;

public class basic1 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("안녕하세요");
            int click = scanner.nextInt();

            switch (click) {
                case 1: {
                    System.out.println("값 입력");
                    int num = scanner.nextInt();
                    Tree current = tree;
                    while (true) {
                        if (current.getNum() == 0) {
                            current.setNum(num);
                            break;
                        } else {
                            if (current.getNum() <= num) {
                                if(current.getNext()==null){
                                    current.setNext(new Tree());
                                }
                                current = current.getNext();
                            } else {
                                if(current.getPrev()==null){
                                    current.setPrev(new Tree());
                                }
                                current = current.getPrev();
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("전위출력");
                    Print1(tree);
                    System.out.println("\n중위출력");
                    Print2(tree);
                    System.out.println("\n후위출력");
                    Print3(tree);
                    System.out.println("\n");
                    break;
                }

                case 3: {
                    System.out.println("번호찾기");
                    int num = scanner.nextInt();
                    System.out.println(tree.getNum());
                    Tree current = tree;
                    while (current != null) {

                        System.out.println(current.getNum());
                        if(current == null){
                            System.out.println("없음");
                            break;
                        }
                        if (current.getNum() == num) {
                            System.out.println("찾음 "+num);
                            break;
                        } 
                        else {
                            if (current.getNum() <= num) {
                                current = current.getNext();
                            } else {
                                current = current.getPrev();
                            }
                        }

                    }
                    break;
                }

            }
        }
    }
    public static Tree Print1(Tree tree){
        if(tree!=null){
            System.out.print(tree.getNum()+" ");
            Print1(tree.getPrev());
            Print1(tree.getNext());
        }
        return null;
    }
    public static Tree Print2(Tree tree){
        if(tree!=null){
            Print2(tree.getPrev());
            System.out.print(tree.getNum()+" ");
            Print2(tree.getNext());
        }
        return null;
    }
    public static Tree Print3(Tree tree){
        if(tree!=null){
            Print3(tree.getPrev());
            Print3(tree.getNext());
            System.out.print(tree.getNum()+" ");
        }
        return null;
    }

}

class Tree {
    private int num;
    private Tree prev;
    private Tree next;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Tree getPrev() {
        return prev;
    }

    public void setPrev(Tree prev) {
        this.prev = prev;
    }

    public Tree getNext() {
        return next;
    }

    public void setNext(Tree next) {
        this.next = next;
    }
}