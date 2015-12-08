package com.coding;

class gcexample {
    public static void main(String[] args) {
        gcexample lion = new gcexample();
        System.out.println("Main is completed.");
        lion=null;
    }

    protected void finalize() {
        System.out.println("Rest in Peace!");
    }
}