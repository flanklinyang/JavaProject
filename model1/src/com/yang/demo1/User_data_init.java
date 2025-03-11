package com.yang.demo1;

import java.io.*;
import java.util.ArrayList;

public class User_data_init {
    public void read_file(ArrayList<User> user_list){
        try(BufferedReader br=new BufferedReader(new FileReader("用户基本信息.txt"))){
            String line;
            while((line=br.readLine())!=null){
                String[] str=line.split(" ");
                User user=new User();
                user.setName(str[0]);
                user.setPassword(str[1]);
                user.setPhone(str[2]);
                user_list.add(user);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void write_file(ArrayList<User> user_list){
        for(int i=0;i<user_list.size();i++){
            if(i==0){
                try(BufferedWriter bw=new BufferedWriter(new FileWriter("用户基本信息.txt"))){

                    bw.write(user_list.get(i).getName()+" ");
                    bw.write(user_list.get(i).getPassword()+" ");
                    bw.write(user_list.get(i).getPhone());
                    bw.newLine();
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else{
                try(BufferedWriter bw=new BufferedWriter(new FileWriter("用户基本信息.txt",true))){
                    bw.write(user_list.get(i).getName()+" ");
                    bw.write(user_list.get(i).getPassword()+" ");
                    bw.write(user_list.get(i).getPhone());
                    bw.newLine();
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
