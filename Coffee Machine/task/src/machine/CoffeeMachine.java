package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = 400;
        int m = 540;
        int cb = 120;
        int c = 9;
        int money = 550;
        Action first = new Action(w, m, cb, c, money);

        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = s.next();
        while (action.equals("buy") || action.equals("fill") || action.equals("take") || action.equals("remaining") ) {
            switch (action) {
                case "buy":
                    first.buy();
                    break;
                case "fill":
                    first.fill();
                    break;
                case "take":
                    first.take();
                    break;
                case "remaining":
                    first.speak();
                    break;
                default:
                    break;
            }
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                action = s.next();
        }
    }
}

class  Action {
    private int water;
    private int milk;
    private int coffee;
    private int cups;
    private int money;
    Scanner x = new Scanner(System.in);

    public Action (int water, int milk, int coffee, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cups = cups;
        this.money = money;
    }

    public  void setWater (int water) {
        this.water = water;
    }

    public int getWater() {
        return water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getMilk() {
        return milk;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getCups() {
        return cups;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public  enum Move {
        fill, buy, take, remaining, exit
    }

    public void fill () {
        System.out.println("Write how many ml of water do you want to add:");
        water = water + x.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk = milk + x.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffee = coffee + x.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups = cups + x.nextInt();
    }

    public void take () {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void buy () {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String num = x.next();
        switch (num) {
            case "1":
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else if (coffee < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else if (cups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                else {
                    water = water - 250;
                    coffee = coffee - 16;
                    cups = cups - 1;
                    money = money + 4;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }
            case "2":
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                else if (coffee < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else if (cups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                else {
                    water = water - 350;
                    milk = milk - 75;
                    coffee = coffee - 20;
                    cups = cups - 1;
                    money = money + 7;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }
            case "3":
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                else if (coffee < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else if (cups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                else {
                    water = water - 200;
                    milk = milk - 100;
                    coffee = coffee - 12;
                    cups = cups - 1;
                    money = money + 6;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }
            case "back":
                break;
            default:
                System.out.println("Error in coffee selection");
                break;
        }
    }

    public void speak () {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
}