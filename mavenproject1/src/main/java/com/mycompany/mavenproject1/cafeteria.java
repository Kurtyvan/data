/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Pc
 */
import java.util.Scanner;
public class cafeteria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ito yung apat na choice na kailangan sa assignment
        System.out.println("Cafeteria Menu");
        System.out.println("1. Kimbab: 70php");
        System.out.println("2. Tteokkboki: 60php");
        System.out.println("3. Eumok: 45php");
        System.out.println("4. Hotteok: 55php");
        

        int c1 = 0;
        boolean validMenu = false;
        while (!validMenu) {
            System.out.print("Enter your choice: ");
            if (input.hasNextInt()) {
                c1 = input.nextInt();
                if (c1 >= 1 && c1 <= 4) {
                    validMenu = true;
                } else {
                    System.out.println("Invalid choice! Please select 1 - 4 only");
                }
            } else {
                System.out.println("Invalid input! Please enter a number (1-4).");
                input.next(); // clear invalid input
            }
        }

        if (c1 == 1) {
            int Kimbab = 70;
            System.out.println("Your order is Kimbab: " + Kimbab + "php each");

            int q1 = 0;
            
            boolean validQty = false;
            while (!validQty) {
                System.out.print("How many do you want to order (if order > 10 you have 2% discount): ");
                if (input.hasNextInt()) {
                    q1 = input.nextInt();
                    if (q1 > 0) {
                        validQty = true;
                    } else {
                        System.out.println("Quantity must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    input.next();
                }
            }

            int mealtotal = Kimbab * q1;
            double discount = 0;
            double mealAfterDiscount = mealtotal;

            if (q1 > 10) {
                discount = mealtotal * 0.02;
                mealAfterDiscount = mealtotal - discount;
                System.out.println(" You got a 2% discount!");
            } else {
                System.out.println(" No discount applied!");
            }

            System.out.println("Would you like to add water for 10php? \n1.Yes \n2.No");
            int c2 = 0;
            boolean validDrink = false;
            while (!validDrink) {
                if (input.hasNextInt()) {
                    c2 = input.nextInt();
                    if (c2 == 1 || c2 == 2) {
                        validDrink = true;
                    } else {
                        System.out.println("Invalid choice! Please select 1 for Yes or 2 for No.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter 1 or 2.");
                    input.next();
                }
            }

            int drinktotal = 0;
            if (c2 == 1) {
                int q2 = 0;
                boolean validDrinkQty = false;
                while (!validDrinkQty) {
                    System.out.print("How many water do you want to order: ");
                    if (input.hasNextInt()) {
                        q2 = input.nextInt();
                        if (q2 > 0) {
                            validDrinkQty = true;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter a number.");
                        input.next();
                    }
                }
                int water = 10;
                drinktotal = water * q2;
            }

            double subtotal = mealAfterDiscount + drinktotal;
            double vat = subtotal * 0.12;
            double total = subtotal + vat;

            System.out.println("\n======= ORDER SUMMARY ==========");
            System.out.println("Meal Total : " + mealtotal + " php");
            System.out.println("Discount : " + discount + " php");
            System.out.println("Meal After Discount: " + mealAfterDiscount + " php");
            System.out.println("Drink Total : " + drinktotal + " php");
            System.out.println("Subtotal : " + subtotal + " php");
            System.out.println("VAT (12%) : " + vat + " php");
            System.out.println("-------------------------------");
            System.out.println("TOTAL TO PAY : " + total + " php");
            System.out.println("======= PLEASE PAY ==========\n");
           
            double cash = 0;
            boolean validCash = false;
            while (!validCash) {
                System.out.print("Enter your cash: ");
                if (input.hasNextDouble()) {
                    cash = input.nextDouble();
                    if (cash >= total) {
                        validCash = true;
                    } else {
                        System.out.println("Not enough cash. Please enter again.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a valid amount.");
                    input.next();
                }
            }

            double change = cash - total;

            System.out.println("\n======= FINAL RECEIPT ==========");
            System.out.println("Meal Total : " + mealtotal + " php");
            System.out.println("Discount : " + discount + " php");
            System.out.println("Meal After Discount: " + mealAfterDiscount + " php");
            System.out.println("Drink Total : " + drinktotal + " php");
            System.out.println("Subtotal : " + subtotal + " php");
            System.out.println("VAT (12%) : " + vat + " php");
            System.out.println("-------------------------------");
            System.out.println("TOTAL TO PAY : " + total + " php");
            System.out.println("Cash Given : " + cash + " php");
            System.out.println("Change : " + change + " php");
            System.out.println("======= THANK YOU! ===========");
        }
        // the rest pareho pareho na sila proven and tested naman to
 
        else if (c1 == 2) {
            int Tteokkboki = 60;
            System.out.println("Your order is Tteokkboki: " + Tteokkboki + "php each");

            int q1 = 0;
            boolean validQty = false;
            while (!validQty) {
                System.out.print("How many do you want to order (if order > 10 you have 2% discount): ");
                if (input.hasNextInt()) {
                    q1 = input.nextInt();
                    if (q1 > 0) {
                        validQty = true;
                    } else {
                        System.out.println("Quantity must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    input.next();
                }
            }

            int mealtotal = Tteokkboki * q1;
            double discount = 0;
            double mealAfterDiscount = mealtotal;

            if (q1 > 10) {
                discount = mealtotal * 0.02;
                mealAfterDiscount = mealtotal - discount;
                System.out.println(" You got a 2% discount!");
            } else {
                System.out.println(" No discount applied!");
            }

            System.out.println("Would you like to add water for 10php? \n1.Yes \n2.No");
            int c2 = 0;
            boolean validDrink = false;
            while (!validDrink) {
                if (input.hasNextInt()) {
                    c2 = input.nextInt();
                    if (c2 == 1 || c2 == 2) {
                        validDrink = true;
                    } else {
                        System.out.println("Invalid choice! Please select 1 for Yes or 2 for No.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter 1 or 2.");
                    input.next();
                }
            }

            int drinktotal = 0;
            if (c2 == 1) {
                int q2 = 0;
                boolean validDrinkQty = false;
                while (!validDrinkQty) {
                    System.out.print("How many water do you want to order: ");
                    if (input.hasNextInt()) {
                        q2 = input.nextInt();
                        if (q2 > 0) {
                            validDrinkQty = true;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter a number.");
                        input.next();
                    }
                }
                int water = 10;
                drinktotal = water * q2;
            }

            double subtotal = mealAfterDiscount + drinktotal;
            double vat = subtotal * 0.12;
            double total = subtotal + vat;

            System.out.println("\n======= ORDER SUMMARY ==========");
            System.out.println("Meal Total : " + mealtotal + " php");
            System.out.println("Discount : " + discount + " php");
            System.out.println("Meal After Discount: " + mealAfterDiscount + " php");
            System.out.println("Drink Total : " + drinktotal + " php");
            System.out.println("Subtotal : " + subtotal + " php");
            System.out.println("VAT (12%) : " + vat + " php");
            System.out.println("-------------------------------");
            System.out.println("TOTAL TO PAY : " + total + " php");
            System.out.println("======= PLEASE PAY ==========\n");

            double cash = 0;
            boolean validCash = false;
            while (!validCash) {
                System.out.print("Enter your cash: ");
                if (input.hasNextDouble()) {
                    cash = input.nextDouble();
                    if (cash >= total) {
                        validCash = true;
                    } else {
                        System.out.println("Not enough cash. Please enter again.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a valid amount.");
                    input.next();
                }
            }

            double change = cash - total;

            System.out.println("\n======= FINAL RECEIPT ==========");
            System.out.println("Meal Total : " + mealtotal + " php");
            System.out.println("Discount : " + discount + " php");
            System.out.println("Meal After Discount: " + mealAfterDiscount + " php");
            System.out.println("Drink Total : " + drinktotal + " php");
            System.out.println("Subtotal : " + subtotal + " php");
            System.out.println("VAT (12%) : " + vat + " php");
            System.out.println("-------------------------------");
            System.out.println("TOTAL TO PAY : " + total + " php");
            System.out.println("Cash Given : " + cash + " php");
            System.out.println("Change : " + change + " php");
            System.out.println("======= THANK YOU! ===========");
        }

        else if (c1 == 3) {
            int Eumok = 45;
            System.out.println("Your order is Eumok: " + Eumok + "php each");

            int q1 = 0;
            boolean validQty = false;
            while (!validQty) {
                System.out.print("How many do you want to order (if order > 10 you have 2% discount): ");
                if (input.hasNextInt()) {
                    q1 = input.nextInt();
                    if (q1 > 0) {
                        validQty = true;
                    } else {
                        System.out.println("Quantity must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    input.next();
                }
            }

            int mealtotal = Eumok * q1;
            double discount = 0;
            double mealAfterDiscount = mealtotal;

            if (q1 > 10) {
                discount = mealtotal * 0.02;
                mealAfterDiscount = mealtotal - discount;
                System.out.println(" You got a 2% discount!");
            } else {
                System.out.println(" No discount applied!");
            }

            System.out.println("Would you like to add water for 10php? \n1.Yes \n2.No");
            int c2 = 0;
            boolean validDrink = false;
            while (!validDrink) {
                if (input.hasNextInt()) {
                    c2 = input.nextInt();
                    if (c2 == 1 || c2 == 2) {
                        validDrink = true;
                    } else {
                        System.out.println("Invalid choice! Please select 1 for Yes or 2 for No.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter 1 or 2.");
                    input.next();
                }
            }

            int drinktotal = 0;
            if (c2 == 1) {
                int q2 = 0;
                boolean validDrinkQty = false;
                while (!validDrinkQty) {
                    System.out.print("How many water do you want to order: ");
                    if (input.hasNextInt()) {
                        q2 = input.nextInt();
                        if (q2 > 0) {
                            validDrinkQty = true;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter a number.");
                        input.next();
                    }
                }
                int water = 10;
                drinktotal = water * q2;
            }

            double subtotal = mealAfterDiscount + drinktotal;
            double vat = subtotal * 0.12;
            double total = subtotal + vat;

            System.out.println("\n======= ORDER SUMMARY ==========");
            System.out.println("Meal Total : " + mealtotal + " php");
            System.out.println("Discount : " + discount + " php");
            System.out.println("Meal After Discount: " + mealAfterDiscount + " php");
            System.out.println("Drink Total : " + drinktotal + " php");
            System.out.println("Subtotal : " + subtotal + " php");
            System.out.println("VAT (12%) : " + vat + " php");
            System.out.println("-------------------------------");
            System.out.println("TOTAL TO PAY : " + total + " php");
            System.out.println("======= PLEASE PAY ==========\n");

            double cash = 0;
            boolean validCash = false;
            while (!validCash) {
                System.out.print("Enter your cash: ");
                if (input.hasNextDouble()) {
                    cash = input.nextDouble();
                    if (cash >= total) {
                        validCash = true;
                    } else {
                        System.out.println("Not enough cash. Please enter again.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a valid amount.");
                    input.next();
                }
            }

            double change = cash - total;

            System.out.println("\n======= FINAL RECEIPT ==========");
            System.out.println("Meal Total : " + mealtotal + " php");
            System.out.println("Discount : " + discount + " php");
            System.out.println("Meal After Discount: " + mealAfterDiscount + " php");
            System.out.println("Drink Total : " + drinktotal + " php");
            System.out.println("Subtotal : " + subtotal + " php");
            System.out.println("VAT (12%) : " + vat + " php");
            System.out.println("-------------------------------");
            System.out.println("TOTAL TO PAY : " + total + " php");
            System.out.println("Cash Given : " + cash + " php");
            System.out.println("Change : " + change + " php");
            System.out.println("======= THANK YOU! ===========");
        }

        else if (c1 == 4) {
            int Hotteok = 55;
            System.out.println("Your order is Hotteok: " + Hotteok + "php each");

            int q1 = 0;
            boolean validQty = false;
            while (!validQty) {
                System.out.print("How many do you want to order (if order > 10 you have 2% discount): ");
                if (input.hasNextInt()) {
                    q1 = input.nextInt();
                    if (q1 > 0) {
                        validQty = true;
                    } else {
                        System.out.println("Quantity must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    input.next();
                }
            }

            int mealtotal = Hotteok * q1;
            double discount = 0;
            double mealAfterDiscount = mealtotal;

            if (q1 > 10) {
                discount = mealtotal * 0.02;
                mealAfterDiscount = mealtotal - discount;
                System.out.println(" You got a 2% discount!");
            } else {
                System.out.println(" No discount applied!");
            }

            System.out.println("Would you like to add water for 10php? \n1.Yes \n2.No");
            int c2 = 0;
            boolean validDrink = false;
            while (!validDrink) {
                if (input.hasNextInt()) {
                    c2 = input.nextInt();
                    if (c2 == 1 || c2 == 2) {
                        validDrink = true;
                    } else {
                        System.out.println("Invalid choice! Please select 1 for Yes or 2 for No.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter 1 or 2.");
                    input.next();
                }
            }

            int drinktotal = 0;
            if (c2 == 1) {
                int q2 = 0;
                boolean validDrinkQty = false;
                while (!validDrinkQty) {
                    System.out.print("How many water do you want to order: ");
                    if (input.hasNextInt()) {
                        q2 = input.nextInt();
                        if (q2 > 0) {
                            validDrinkQty = true;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter a number.");
                        input.next();
                    }
                }
                int water = 10;
                drinktotal = water * q2;
            }

            double subtotal = mealAfterDiscount + drinktotal;
            double vat = subtotal * 0.12;
            double total = subtotal + vat;

            System.out.println("\n======= ORDER SUMMARY ==========");
            System.out.println("Meal Total : " + mealtotal + " php");
            System.out.println("Discount : " + discount + " php");
            System.out.println("Meal After Discount: " + mealAfterDiscount + " php");
            System.out.println("Drink Total : " + drinktotal + " php");
            System.out.println("Subtotal : " + subtotal + " php");
            System.out.println("VAT (12%) : " + vat + " php");
            System.out.println("-------------------------------");
            System.out.println("TOTAL TO PAY : " + total + " php");
            System.out.println("======= PLEASE PAY ==========\n");

            double cash = 0;
            boolean validCash = false;
            while (!validCash) {
                System.out.print("Enter your cash: ");
                if (input.hasNextDouble()) {
                    cash = input.nextDouble();
                    if (cash >= total) {
                        validCash = true;
                    } else {
                        System.out.println("Not enough cash. Please enter again.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a valid amount.");
                    input.next();
                }
            }

            double change = cash - total;

            System.out.println("\n======= FINAL RECEIPT ==========");
            System.out.println("Meal Total : " + mealtotal + " php");
            System.out.println("Discount : " + discount + " php");
            System.out.println("Meal After Discount: " + mealAfterDiscount + " php");
            System.out.println("Drink Total : " + drinktotal + " php");
            System.out.println("Subtotal : " + subtotal + " php");
            System.out.println("VAT (12%) : " + vat + " php");
            System.out.println("-------------------------------");
            System.out.println("TOTAL TO PAY : " + total + " php");
            System.out.println("Cash Given : " + cash + " php");
            System.out.println("Change : " + change + " php");
            System.out.println("======= THANK YOU! ===========");
        }
    }
}
