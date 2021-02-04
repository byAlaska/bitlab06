package bitlab.askar.module2.lesson2.lab;

import java.util.Arrays;

public class Library {
    private String name;
    private String city;
    private Book []books = new Book[20];
    private int index = 0;

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Library() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getIndex() {
        return index;
    }

    public void addBook(Book book){
        try {
            books[index] = book;
            index++;
        }catch (NullPointerException e){
            System.out.println("Book is null");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Not enough place in library");
        }
    }


    @Override
    public String toString() {

        String result = printBooks();

        return "Library{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", books=" + result +
                ", index=" + index +
                '}';
    }

    public String printBooks(){
        String result = "";
        for (int i=0;i<index;i++){
            try {
                result += books[i].toString();
            }catch (NullPointerException e){
                e.printStackTrace();
            }
        }

        return result;
    }
}
