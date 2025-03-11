package com.yang.demo1;

import java.io.*;
import java.util.ArrayList;

public class File_read_or_write {

    public void read_file(ArrayList<Old> old_list){
        try(BufferedReader br=new BufferedReader(new FileReader("老人基本信息.txt"))){
            String line;
            while((line=br.readLine())!=null){
                String[] str=line.split(" ");
                Old old=new Old();
                old.setId(str[0]);
                old.setName(str[1]);
                old.setSex(str[2]);
                old.setAge(str[3]);
                old.setPhone(str[4]);
                old.setCondition(str[5]);
                old.setRemark(str[6]);
                old_list.add(old);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void write_file(ArrayList<Old> old_list){
        for(int i=0;i<old_list.size();i++){
            if(i==0){
                try(BufferedWriter bw=new BufferedWriter(new FileWriter("老人基本信息.txt"))){
                    bw.write(old_list.get(i).getId()+" ");
                    bw.write(old_list.get(i).getName()+" ");
                    bw.write(old_list.get(i).getSex()+" ");
                    bw.write(old_list.get(i).getAge()+" ");
                    bw.write(old_list.get(i).getPhone()+" ");
                    bw.write(old_list.get(i).getCondition()+" ");
                    bw.write(old_list.get(i).getRemark());
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else{
                try(BufferedWriter bw=new BufferedWriter(new FileWriter("老人基本信息.txt",true))){
                    bw.write(old_list.get(i).getId()+" ");
                    bw.write(old_list.get(i).getName()+" ");
                    bw.write(old_list.get(i).getSex()+" ");
                    bw.write(old_list.get(i).getAge()+" ");
                    bw.write(old_list.get(i).getPhone()+" ");
                    bw.write(old_list.get(i).getCondition()+" ");
                    bw.write(old_list.get(i).getRemark());
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }

}
