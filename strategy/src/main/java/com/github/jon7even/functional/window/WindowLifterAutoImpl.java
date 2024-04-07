package com.github.jon7even.functional.window;

public class WindowLifterAutoImpl implements WindowLifter {
    public void turnUpWindowLift() {
        System.out.println("Проверка блока...");
        System.out.println("Стеклоподъемники подключены.");
        System.out.println("Активирую привод, контакт +, подъем стекла...");
    }

    public void turnDownWindowLift() {
        System.out.println("Проверка блока...");
        System.out.println("Стеклоподъемники подключены.");
        System.out.println("Активирую инверсию привода, контакт -, опускаю стекло...");
    }
}
