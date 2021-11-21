package CreationalPattern.BuilderPattern.Example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {
    public OrderedItems preparePizza() throws IOException {
        OrderedItems items = new OrderedItems();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the choice of pizza");
        System.out.println("=========================");
        System.out.println("1. Veg-Pizza");
        System.out.println("2. Non-Veg-Pizza");
        System.out.println("3. Exit");
        System.out.println("=========================");

        int pizzaandcolddrinkchoice = Integer.parseInt(br.readLine());
        switch (pizzaandcolddrinkchoice) {
            case 1: {
                System.out.println("You ordered veg-pizza");
                System.out.println("Enter type of veg-pizza");
                System.out.println("1. Cheeze pizza");
                System.out.println("2. Onion pizza");
                System.out.println("3. Masala pizza");
                System.out.println("4. exit");

                int vegpizzachoice = Integer.parseInt(br.readLine());
                switch (vegpizzachoice) {
                    case 1: {
                        System.out.println("Cheeze pizza");
                        System.out.println("Enter size");
                        System.out.println("1. Small");
                        System.out.println("2. Medium");
                        System.out.println("3. Large");
                        System.out.println("4. Extra large");

                        int cheezepizasize = Integer.parseInt(br.readLine());
                        switch (cheezepizasize) {
                            case 1:
                                items.addItems(new SmallCheezePizza());
                                break;
                            case 2:
                                items.addItems(new MediumCheezePizza());
                                break;
                            case 3:
                                items.addItems(new LargeCheezePizza());
                                break;
                            case 4:
                                items.addItems(new ExtraLargeCheezePizza());
                                break;
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("Onion pizza");
                        System.out.println("Enter size");
                        System.out.println("1. Small");
                        System.out.println("2. Medium");
                        System.out.println("3. Large");
                        System.out.println("4. Extra large");

                        int onionpizzasize = Integer.parseInt(br.readLine());
                        switch (onionpizzasize) {
                            case 1:
                                items.addItems(new SmallOnionPizza());
                                break;
                            case 2:
                                items.addItems(new MediumOnionPizza());
                                break;
                            case 3:
                                items.addItems(new LargeOnionPizza());
                                break;
                            case 4:
                                items.addItems(new ExtraLargeOnionPizza());
                                break;
                        }
                    }
                    break;
                    case 3: {
                        System.out.println("Masala pizza");
                        System.out.println("Enter size");
                        System.out.println("1. Small");
                        System.out.println("2. Medium");
                        System.out.println("3. Large");
                        System.out.println("4. Extra large");

                        int masalapizzasize = Integer.parseInt(br.readLine());
                        switch (masalapizzasize) {
                            case 1:
                                items.addItems(new SmallMasalaPizza());
                                break;
                            case 2:
                                items.addItems(new MediumMasalaPizza());
                                break;
                            case 3:
                                items.addItems(new LargeMasalaPizza());
                                break;
                            case 4:
                                items.addItems(new ExtraLargeMasalaPizza());
                                break;
                        }
                    }
                    break;
                }
            }
            break;
            case 2: {
                System.out.println("You ordered non-veg pizza");
                System.out.println("Non-veg pizza");
                System.out.println("Enter size");
                System.out.println("1. Small");
                System.out.println("2. Medium");
                System.out.println("3. Large");
                System.out.println("4. Extra large");

                int nonvegpizzasize = Integer.parseInt(br.readLine());

                switch (nonvegpizzasize) {
                    case 1:
                        items.addItems(new SmallNonVegPizza());
                        break;
                    case 2:
                        items.addItems(new MediumNonVegPizza());
                        break;
                    case 3:
                        items.addItems(new MediumNonVegPizza());
                        break;
                    case 4:
                        items.addItems(new MediumNonVegPizza());
                        break;
                }
            }
            break;
            default: {
                break;
            }
        }

        System.out.println("Enter the choice of ColdDrink");
        System.out.println("1. Pepsi");
        System.out.println("2. Coke");
        System.out.println("3. Exit");

        int coldDrink = Integer.parseInt(br.readLine());
        switch (coldDrink){
            case 1:{
                System.out.println("Pepsi");
                System.out.println("Size: ");
                System.out.println("1. Small");
                System.out.println("2. Medium");
                System.out.println("3. Large");

                int pepsiszie = Integer.parseInt(br.readLine());
                switch (pepsiszie){
                    case 1:
                        items.addItems(new SmallPepsi());
                        break;
                    case 2:
                        items.addItems(new MediumPepsi());
                        break;
                    case 3:
                        items.addItems(new LargePepsi());
                        break;
                }
            }break;
            case 2:{
                System.out.println("Coke");
                System.out.println("Size: ");
                System.out.println("1. Small");
                System.out.println("2. Medium");
                System.out.println("3. Large");

                int cokeszie = Integer.parseInt(br.readLine());
                switch (cokeszie){
                    case 1:
                        items.addItems(new SmallCoke());
                        break;
                    case 2:
                        items.addItems(new MediumCoke());
                        break;
                    case 3:
                        items.addItems(new LargeCoke());
                        break;
                }
            }break;
            default:{
                break;
            }
        }
    return items;
    }
}
