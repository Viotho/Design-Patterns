package com.jackyzeng.designpatterns.behaviours.command;

public class Invoker {
    private Command[] onCommand;
    private Command[] offCommand;
    private final int slotNum = 10;

    public Invoker() {
        this.onCommand = new Command[slotNum];
        this.offCommand = new Command[slotNum];
    }

    public void setOnCommand(Command command, int slot) {
        onCommand[slot] = command;
    }

    public void setOffCommand(Command command, int slot) {
        offCommand[slot] = command;
    }

    public void onCommandInvoke(int slot) {
        onCommand[slot].execute();
    }

    public void offCommandInvoke(int slot) {
        offCommand[slot].execute();
    }

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        LightOnCommand onCommand = new LightOnCommand(light);
        LightOffCommand offCommand = new LightOffCommand(light);
        invoker.setOnCommand(onCommand, 0);
        invoker.setOffCommand(offCommand, 0);
        invoker.onCommandInvoke(0);
        invoker.offCommandInvoke(0);
    }
}
