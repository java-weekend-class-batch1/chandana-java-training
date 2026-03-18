package com.training.InnerClasses;

public class Widget {

    // 🔹 Private field (outer class)
    private int clickCount = 0;

    // 🔹 Method to simulate click
    public void simulateClick() {
        ClickHandler handler = new ClickHandler(); // create inner class object
        handler.handle(); // call method
    }

    // 🔹 Non-static Inner Class
    class ClickHandler {

        public void handle() {
            // Access and modify outer class private variable
            clickCount++;

            System.out.println("Widget clicked!");
            System.out.println("Total Click Count: " + clickCount);
        }
    }

    // 🔹 Main method (Test)
    public static void main(String[] args) {

        Widget widget = new Widget();

        // Simulate multiple clicks
        widget.simulateClick();
        widget.simulateClick();
        widget.simulateClick();
    }
}