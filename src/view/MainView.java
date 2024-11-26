package view;

import model.dto.Type;

import java.util.Scanner;
public class MainView {
    public MenuView menuView = new MenuView();

    public Scanner sc = new Scanner(System.in);

    public void mainView(){
        while (true){
        System.out.println("1.매장식사    2.포장주문");

            int choose = 0;
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR");
                sc.nextLine();
                continue;
            }
            switch (choose){
            case 1:
                menuView.categoryView(Type.FOR_HERE);
                break;
            case 2:
                menuView.categoryView(Type.TO_GO);
                break;
            default:
                System.out.println("종료");
                return;
        }

        }
    }

}
