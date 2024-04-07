package com.github.jon7even.functional.window;

public class WindowLifterManualImpl implements WindowLifter {
    public void turnUpWindowLift() {
        System.out.println("Проверка блока...");
        System.out.println("Стеклоподъемники не подключены.");
        System.out.println("Вы приобрели машину с веслами, просьба поднять их вручную:)");
    }

    public void turnDownWindowLift() {
        System.out.println("Проверка блока...");
        System.out.println("Стеклоподъемники не подключены.");
        System.out.println("Вы приобрели машину с веслами, просьба опустить их вручную:)");
    }
}
