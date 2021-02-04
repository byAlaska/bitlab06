package bitlab.askar.module2.lesson8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {

    private Connection connection;

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bitlab_bd6?useUnicode=true&serverTimezone=UTC","root", ""
            );
            System.out.println("CONNECTED");
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public void addDog(Dog dog){
        try{
            PreparedStatement st = connection.prepareStatement("INSERT INTO dogs(name, age, weight) values(?,?,?)");

            st.setString(1,dog.getName());
            st.setInt(2,dog.getAge());
            st.setDouble(3,dog.getWeight());
            st.executeUpdate();
            st.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public ArrayList<Dog> getAllDogs(){
        ArrayList<Dog> dogs = new ArrayList<>();
        try{
            PreparedStatement st = connection.prepareStatement("SELECT * FROM dogs");
            ResultSet rs = st.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                double weight = rs.getDouble("weight");

                dogs.add(new Dog(id,name,age,weight));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return dogs;
    }


    public void updateDog(Dog dog){
        try{
            PreparedStatement st = connection.prepareStatement("UPDATE dogs set name = ?, age = ?, weight = ? where id = ?");

            st.setString(1, dog.getName());
            st.setInt(2, dog.getAge());
            st.setDouble(3, dog.getWeight());
            st.setInt(4, dog.getId());

            st.executeUpdate();

            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void deleteDog(int id){
        try{
            PreparedStatement st = connection.prepareStatement("DELETE FROM dogs where id = ?");

            st.setLong(1, id);
            st.executeUpdate();

            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
