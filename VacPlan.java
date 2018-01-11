import java.util.Scanner;
import java.lang.Math;
class VacPlan {
 public static void main(String args[]) {
  Scanner input = new Scanner(System.in);
  System.out.println("Welcome to Vacation Planner!");
  System.out.print("What is your name? ");
  String name = input.nextLine();
  System.out.print("Nice to meet you "+name+" , where are you travelling to? ");
  String city = input.nextLine();
  System.out.println("Great! " + city + " sounds like a great trip");
  System.out.println("**********");
  System.out.println("");
  System.out.print("How many days are you going to spend travelling? ");
  int days = input.nextInt();
  System.out.print("How much money, in USD, are you planning to spend on your trip? ");
  double money = input.nextInt();
  System.out.print("What is the three letter currency symbol for your travel destination? ");
  String cs = input.next();
  System.out.print("How many " +cs+ " are there in 1 USD? ");
  double amt = input.nextDouble();
  System.out.println("");
  System.out.println("");
  int hours = days * 24;
  int minutes = hours * 60;
  System.out.println("If you are travelling for "+days+" days that is the same as "+hours+" hours or " + minutes + " minutes ");
  double money_in_day =(double) (money/days);
  double roundOffMoney = (double) Math.round(money_in_day*100) / 100;
  System.out.println("If you are going to spend $" +money+ "USD that means per day you can spend upto $" + roundOffMoney + "USD");
  double budget = money*amt;
  double budget_in_day = money_in_day*amt;
  double roundOffBudget = (double) Math.round(budget_in_day * 100) / 100;
  System.out.println("Your total budget in " +cs+ " is " +budget+" "+cs+", which per day is " +roundOffBudget+ " "+cs);
  System.out.println("**********");
  System.out.println("");
  System.out.print("What is the time difference, in hours, between your home and your destination? ");
  int time_diff = input.nextInt();
  int midnight_time;
  if(time_diff>=0)
     midnight_time = time_diff;
  else midnight_time = -(time_diff);
  int noon_time = time_diff + 12;
  System.out.println("That means that when it is midnight at home at home it will be "+midnight_time+":00 in your travel destination and when it is noon at home it will be "+noon_time+":00 ");
  System.out.println("**********");
  System.out.println("");
  System.out.print("What is the square area of your destination country in km2? ");
  double dis_in_km2 = input.nextDouble();
  double dis_in_mile2 = dis_in_km2 * 0.38610;
  double round_off_dist = (double) Math.round(dis_in_mile2 * 100) / 100;
  System.out.println("In mile2 that is "+round_off_dist);
  System.out.println("********");
  System.out.println("");


}
}
  



