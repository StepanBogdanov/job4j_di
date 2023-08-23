package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        String name1 = ui.askString("Input name: ");
        String name2 = ui.askString("Input name: ");
        ui.add(name1);
        ui.add(name2);
        ui.print();
    }
}