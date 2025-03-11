package com.yang.demo1;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MainFrame extends JFrame implements MouseListener {

    ArrayList<Old> oldList = new ArrayList<>();
    ArrayList<User> userList = new ArrayList<>();
    User_data_init user_data_init = new User_data_init();
    File_read_or_write file_read_or_write = new File_read_or_write();
    JButton my=new JButton("我的");
    JButton log_out=new JButton("退出登录");
    JButton change_password = new JButton("修改密码");
    JButton add = new JButton("添加老人信息");
    JButton delete = new JButton("删除老人信息");
    JButton update = new JButton("修改老人信息");
    JButton check = new JButton("查询老人信息");
    JButton add_sure = new JButton("确定");
    JButton delete_sure = new JButton("删除");
    JButton update_sure = new JButton("修改");
    JButton check_sure = new JButton("查询");
    JButton finish_update = new JButton("完成更改");
    JButton back = new JButton("返回");
    JButton change_sure = new JButton("确定");
    JButton cancel = new JButton("取消");




    ImageIcon white_back = new ImageIcon("model1//photo//white_back.png");
    ImageIcon Photo = new ImageIcon("model1//photo//photo1.jpg");
    JLabel label = new JLabel(white_back);
    JLabel photo1 = new JLabel(Photo);

    JLabel top = new JLabel();
    JLabel all_num = new JLabel();
    JLabel Name = new JLabel();
    JLabel Phone = new JLabel();
    JLabel old_id = new JLabel();
    JLabel old_name = new JLabel();
    JLabel old_sex = new JLabel();
    JLabel old_age = new JLabel();
    JLabel old_phone = new JLabel();
    JLabel old_condition = new JLabel();
    JLabel old_remark = new JLabel();
    JLabel delete_id_or_name = new JLabel();
    JLabel update_id_or_name = new JLabel();
    JLabel check_id_or_name = new JLabel();
    JLabel show_id = new JLabel();
    JLabel show_name = new JLabel();
    JLabel show_sex = new JLabel();
    JLabel show_age = new JLabel();
    JLabel show_phone = new JLabel();
    JLabel show_condition = new JLabel();
    JLabel show_remark = new JLabel();
    JLabel right_password = new JLabel();
    JLabel new_password = new JLabel();
    JLabel confirm_password = new JLabel();




    JTextField textField0 = new JTextField();
    JTextField static_textField0 = new JTextField();
    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();
    JTextField textField4 = new JTextField();
    JTextField textField5 = new JTextField();
    JTextField textField6 = new JTextField();
    JTextField textField7 = new JTextField();
    JTextField textField8 = new JTextField();
    JTextField textField9 = new JTextField();
    JTextField textField10 = new JTextField();
    JTextField textField11 = new JTextField();
    JTextField textField12 = new JTextField();



    private String name;
    private final String phone;
    private String password;


    public MainFrame(String name, String phone, String password) {
        user_data_init.read_file(userList);
        this.name = name;
        this.phone = phone;
        this.password = password;
        file_read_or_write.read_file(oldList);
        initFrame();
        init_background();
        add_menu();
        add_myFrame();
        add_back_photo();
        add_sure.addMouseListener(this);
        delete_sure.addMouseListener(this);
        update_sure.addMouseListener(this);
        check_sure.addMouseListener(this);
        finish_update.addMouseListener(this);
        back.addMouseListener(this);
        change_sure.addMouseListener(this);
        cancel.addMouseListener(this);
        change_password.addMouseListener(this);
        log_out.addMouseListener(this);
    }
    public void setName(String name) {
        this.name = name;
    }


    public void add_back_photo(){
        photo1.setBounds(0, 0, 1000, 800);
        this.getContentPane().add(photo1);
    }

    public void initFrame() {
        this.setTitle("养老院老人健康信息管理系统v1.0");
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void init_background(){

        label.setBounds(54, 80, 892, 648);
        label.setBorder(new BevelBorder(BevelBorder.LOWERED));
        this.getContentPane().add(label);
    }

    public void add_menu(){
        my.setBounds(54, 50, 60, 30);
        add.setBounds(114, 50, 150, 30);
        delete.setBounds(264, 50, 150, 30);
        update.setBounds(414, 50, 150, 30);
        check.setBounds(564, 50, 150, 30);

        my.addMouseListener(this);
        my.setBackground(Color.CYAN);
        my.setBorderPainted(false);

        add.addMouseListener(this);
        delete.addMouseListener(this);
        update.addMouseListener(this);
        check.addMouseListener(this);

        this.getContentPane().add(my);
        this.getContentPane().add(add);
        this.getContentPane().add(delete);
        this.getContentPane().add(update);
        this.getContentPane().add(check);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource()==my){
            label.removeAll();
            my.setBackground(Color.CYAN);
            my.setBorderPainted(false);
            add.setBackground(null);
            add.setBorderPainted(true);
            delete.setBackground(null);
            delete.setBorderPainted(true);
            update.setBackground(null);
            update.setBorderPainted(true);
            check.setBackground(null);
            check.setBorderPainted(true);
            check.setBackground(null);
            add_myFrame();
            label.repaint();
        }
        else if(e.getSource()==add){
            label.removeAll();
            add.setBackground(Color.CYAN);
            add.setBorderPainted(false);
            my.setBackground(null);
            my.setBorderPainted(true);
            delete.setBackground(null);
            delete.setBorderPainted(true);
            update.setBackground(null);
            update.setBorderPainted(true);
            check.setBackground(null);
            check.setBorderPainted(true);
            check.setBackground(null);
            add_addFrame();

            textField0.setText("");

            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            label.repaint();
        }
        else if(e.getSource()==delete){
            label.removeAll();
            delete.setBackground(Color.CYAN);
            delete.setBorderPainted(false);
            add.setBackground(null);
            add.setBorderPainted(true);
            my.setBackground(null);
            my.setBorderPainted(true);
            update.setBackground(null);
            update.setBorderPainted(true);
            check.setBackground(null);
            check.setBorderPainted(true);
            add_deleteFrame();
            textField7.setText("");
            label.repaint();
        }
        else if(e.getSource()==update){
            label.removeAll();
            update.setBackground(Color.CYAN);
            update.setBorderPainted(false);
            add.setBackground(null);
            add.setBorderPainted(true);
            delete.setBackground(null);
            delete.setBorderPainted(true);
            my.setBackground(null);
            my.setBorderPainted(true);
            check.setBackground(null);
            check.setBorderPainted(true);
            add_updateFrame();
            textField8.setText("");
            label.repaint();
        }
        else if(e.getSource()==check){
            label.removeAll();
            check.setBackground(Color.CYAN);
            check.setBorderPainted(false);
            add.setBackground(null);
            add.setBorderPainted(true);
            delete.setBackground(null);
            delete.setBorderPainted(true);
            update.setBackground(null);
            update.setBorderPainted(true);
            my.setBackground(null);
            my.setBorderPainted(true);
            add_checkFrame();
            textField9.setText("");
            label.repaint();
        }
        else if(e.getSource()==add_sure){
            Old old = appointment();
            int n=check_item();
            if(n==0){
                boolean bool=check_id(old.getId());
                if(bool){
                    oldList.add(old);
                    textField0.setText("");
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    textField5.setText("");
                    textField6.setText("");
                    file_read_or_write.write_file(oldList);
                    System.out.println("添加成功");
                    JOptionPane.showMessageDialog(this, "添加成功");
                }else{
                    System.out.println("编号已存在");
                    JOptionPane.showMessageDialog(this, "编号已存在");
                }
            }
            else if(n==1){
                System.out.println("编号不能为空");
                JOptionPane.showMessageDialog(this, "编号不能为空");
            }
            else if(n==2){
                System.out.println("姓名不能为空");
                JOptionPane.showMessageDialog(this, "姓名不能为空");
            }
            else if(n==3){
                System.out.println("性别不能为空");
                JOptionPane.showMessageDialog(this, "性别不能为空");
            }
            else if(n==4){
                System.out.println("年龄不能为空");
                JOptionPane.showMessageDialog(this, "年龄不能为空");
            }
            else if(n==5){
                System.out.println("家属电话不能为空");
                JOptionPane.showMessageDialog(this, "家属电话不能为空");
            }
            else if(n==6){
                System.out.println("健康状况不能为空");
                JOptionPane.showMessageDialog(this, "健康状况不能为空");
            }
            else if(n==7){
                System.out.println("编号开头不能为零");
                JOptionPane.showMessageDialog(this, "编号开头不能为零");
            }
            else if(n==8){
                System.out.println("编号必须为数字");
                JOptionPane.showMessageDialog(this, "编号必须为数字");
            }
            else if(n==9){
                System.out.println("年龄必须为数字");
                JOptionPane.showMessageDialog(this, "年龄必须为数字");
            }
            else if(n==10){
                System.out.println("备注不能为空");
                JOptionPane.showMessageDialog(this, "备注不能为空");
            }

        }
        else if(e.getSource()==delete_sure){
            String id=textField7.getText();
            boolean bool=delete_old(id);
            if(bool){
                textField7.setText("");
                file_read_or_write.write_file(oldList);
                System.out.println("删除成功");
                JOptionPane.showMessageDialog(this, "删除成功");
            }else{
                System.out.println("删除失败,编号不存在");
                JOptionPane.showMessageDialog(this, "删除失败,编号不存在");
            }
        }
        else if(e.getSource()==update_sure){
            String id=textField8.getText();
            int n=find_old(id);
            if(n>=0){
                label.removeAll();
                update_old(n);
                label.repaint();
            }else{
                System.out.println("编号不存在");
                JOptionPane.showMessageDialog(this, "编号不存在");
            }

        }
        else if(e.getSource()==finish_update){
            String id=textField8.getText();
            int n=new_check_item();
            if(n==0){
                Old old=new Old(textField8.getText(),textField1.getText(),textField2.getText(),textField3.getText(),textField4.getText(),textField5.getText(),textField6.getText());

                label.removeAll();
                oldList.set(find_old(id),old);
                file_read_or_write.write_file(oldList);
                textField0.setText("");
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField8.setText("");
                add_updateFrame();
                label.repaint();
                System.out.println("修改成功");
                JOptionPane.showMessageDialog(this, "修改成功");



            }
            else if(n==1){
                System.out.println("编号不能为空");
                JOptionPane.showMessageDialog(this, "编号不能为空");
            }
            else if(n==2){
                System.out.println("姓名不能为空");
                JOptionPane.showMessageDialog(this, "姓名不能为空");
            }
            else if(n==3){
                System.out.println("性别不能为空");
                JOptionPane.showMessageDialog(this, "性别不能为空");
            }
            else if(n==4){
                System.out.println("年龄不能为空");
                JOptionPane.showMessageDialog(this, "年龄不能为空");
            }
            else if(n==5){
                System.out.println("家属电话不能为空");
                JOptionPane.showMessageDialog(this, "家属电话不能为空");
            }
            else if(n==6){
                System.out.println("健康状况不能为空");
                JOptionPane.showMessageDialog(this, "健康状况不能为空");
            }else{
                System.out.println("test");
            }
        }
        else if(e.getSource()==check_sure){
            String id=textField9.getText();
            int n=find_old(id);
            if(n>=0){
                label.removeAll();
                System.out.println("查询成功");
                check_old(n);
                label.repaint();
            }else{
                System.out.println("编号不存在");
                JOptionPane.showMessageDialog(this, "编号不存在");
            }
        }
        else if(e.getSource()==back){
            label.removeAll();
            add_checkFrame();
            textField9.setText("");
            label.repaint();
        }
        else if(e.getSource()==log_out){
            this.dispose();
            new LoginFrame();
        }
        else if(e.getSource()==change_password){
            label.removeAll();
            add_change_password_Frame();
            textField10.setText("");
            textField11.setText("");
            textField12.setText("");
            label.repaint();
        }
        else if(e.getSource()==change_sure){
            String right_password=textField10.getText();
            String new_password=textField11.getText();
            String confirm_password=textField12.getText();
            if(right_password.equals(password)){
                if(new_password.equals(confirm_password)){
                    password=new_password;
                    for(int i=0;i<userList.size();i++){
                        if(userList.get(i).getName().equals(name)){
                            userList.get(i).setPassword(password);
                            user_data_init.write_file(userList);
                            break;
                        }
                    }
                    System.out.println("修改成功");
                    JOptionPane.showMessageDialog(this, "修改成功");

                    label.removeAll();
                    add_myFrame();
                    label.repaint();
                }
                else{
                    System.out.println("两次密码不一致");
                    JOptionPane.showMessageDialog(this, "两次密码不一致");
                }
            }
            else{
                System.out.println("原密码输入错误");
                JOptionPane.showMessageDialog(this, "原密码输入错误");
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public void add_myFrame(){
        top.setText("护理员信息");
        top.setBounds(300, 10, 500, 50);
        top.setFont(new Font("宋体", Font.BOLD, 40));
        Name.setText("姓名:"+name);
        Name.setBounds(350, 300, 100 ,50);
        Name.setFont(new Font("宋体", Font.BOLD, 20));
        Phone.setText("电话:"+phone);
        Phone.setBounds(350, 350, 200,50);
        Phone.setFont(new Font("宋体", Font.BOLD, 20));
        all_num.setText("养老院老人总人数:"+oldList.size());
        all_num.setBounds(350, 450, 500,50);
        all_num.setFont(new Font("宋体", Font.BOLD, 20));
        change_password.setBounds(350, 500, 150, 30);
        log_out.setBounds(350, 550, 150, 30);

        label.add(top);
        label.add(all_num);
        label.add(Name);

        label.add(Phone);
        label.add(change_password);
        label.add(log_out);
    }
    public void add_addFrame(){
        old_id.setText("编号:");
        old_id.setBounds(300, 50, 100,30);
        old_id.setFont(new Font("宋体", Font.BOLD, 20));
        textField0.setBounds(400, 50, 200,30);
        old_name.setText("姓名:");
        old_name.setBounds(300, 100, 100,30);
        old_name.setFont(new Font("宋体", Font.BOLD, 20));
        textField1.setBounds(400, 100, 200,30);
        old_sex.setText("性别:");
        old_sex.setBounds(300, 150, 100,30);
        old_sex.setFont(new Font("宋体", Font.BOLD, 20));
        textField2.setBounds(400, 150, 200,30);
        old_age.setText("年龄:");
        old_age.setBounds(300, 200, 100,30);
        old_age.setFont(new Font("宋体", Font.BOLD, 20));
        textField3.setBounds(400, 200, 200,30);
        old_phone.setText("家属电话:");
        old_phone.setBounds(300, 250, 100,30);
        old_phone.setFont(new Font("宋体", Font.BOLD, 20));
        textField4.setBounds(400, 250, 200,30);
        old_condition.setText("健康状况:");
        old_condition.setBounds(300, 300, 100,30);
        old_condition.setFont(new Font("宋体", Font.BOLD, 20));
        textField5.setBounds(400, 300, 200,30);
        old_remark.setText("备注:");
        old_remark.setBounds(300, 350, 100,30);
        old_remark.setFont(new Font("宋体", Font.BOLD, 20));
        textField6.setBounds(400, 350, 200,30);
        add_sure.setBounds(400, 425, 150, 30);



        label.add(old_id);
        label.add(textField0);
        label.add(old_name);
        label.add(textField1);
        label.add(old_sex);
        label.add(textField2);
        label.add(old_phone);
        label.add(textField3);
        label.add(old_age);
        label.add(textField4);
        label.add(old_condition);
        label.add(textField5);
        label.add(old_remark);
        label.add(textField6);
        label.add(add_sure);
    }

    public void add_deleteFrame(){
        delete_id_or_name.setText("请输入老人的编号:");
        delete_id_or_name.setBounds(200, 50, 200,30);
        delete_id_or_name.setFont(new Font("宋体", Font.BOLD, 20));
        textField7.setBounds(400, 50, 200,30);
        delete_sure.setBounds(400, 100, 150, 30);

        label.add(delete_id_or_name);
        label.add(textField7);
        label.add(delete_sure);
    }
    public void add_updateFrame(){

        update_id_or_name.setText("请输入老人的编号:");
        update_id_or_name.setBounds(200, 50, 200,30);
        update_id_or_name.setFont(new Font("宋体", Font.BOLD, 20));
        textField8.setBounds(400, 50, 200,30);
        update_sure.setBounds(400, 100, 150, 30);

        label.add(update_id_or_name);
        label.add(textField8);
        label.add(update_sure);
    }
    public void add_checkFrame(){
        check_id_or_name.setText("请输入老人的编号:");
        check_id_or_name.setBounds(200, 50, 200,30);
        check_id_or_name.setFont(new Font("宋体", Font.BOLD, 20));
        textField9.setBounds(400, 50, 200,30);
        check_sure.setBounds(400, 100, 150, 30);

        label.add(check_id_or_name);
        label.add(textField9);
        label.add(check_sure);
    }
    public Old appointment(){
        Old old = new Old();

        old.setId(textField0.getText());
        old.setName(textField1.getText());
        old.setSex(textField2.getText());
        old.setAge(textField3.getText());
        old.setPhone(textField4.getText());
        old.setCondition(textField5.getText());
        old.setRemark(textField6.getText());

        return old;
    }
    public boolean check_error_id(){
        boolean flag = false;
        for(int i=0;i<textField0.getText().length();i++){
            if(textField0.getText().charAt(i)>'9'||textField0.getText().charAt(i)<'0'){
                flag = true;
                break;
            }
        }return flag;
    }
    public boolean check_error_age(){
        boolean flag = false;
        for(int i=0;i<textField3.getText().length();i++){
            if(textField3.getText().charAt(i)>'9'||textField3.getText().charAt(i)<'0'){
                flag = true;
                break;
            }
        }return flag;
    }
    public int check_item() {
        if (textField0.getText().equals("")) {
            return 1;
        }
        else if (textField1.getText().equals("")) {
            return 2;
        }
        else if (textField2.getText().equals("")) {
            return 3;
        }
        else if (textField3.getText().equals("")) {
            return 4;
        }
        else if (textField4.getText().equals("")) {
            return 5;
        }
        else if (textField5.getText().equals("")) {
            return 6;
        }
        else if (textField0.getText().charAt(0)=='0'){
            return 7;
        }
        else if (check_error_id()) {
            return 8;
        }
        else if (check_error_age()) {
            return 9;
        }
        else if(textField6.getText().equals("")){
            return 10;
        }
        return 0;
    }
    public int new_check_item() {
        if (static_textField0.getText().equals("")) {
            return 1;
        }else if (textField1.getText().equals("")) {
            return 2;
        }
        else if (textField2.getText().equals("")) {
            return 3;
        }
        else if (textField3.getText().equals("")) {
            return 4;
        }
        else if (textField4.getText().equals("")) {
            return 5;
        }
        else if (textField5.getText().equals("")) {
            return 6;
        }else{
            return 0;
        }
    }
    public boolean check_id(String id){
        for (Old old : oldList) {
            if (old.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    public boolean delete_old(String id){
        for (int i=0;i<oldList.size();i++) {
            if (oldList.get(i).getId().equals(id)) {
                oldList.remove(i);
                return true;
            }
        }
        return false;
    }
    public void update_old(int n){


        old_id.setText("编号:");
        old_id.setBounds(300, 50, 100,30);
        old_id.setFont(new Font("宋体", Font.BOLD, 20));
        static_textField0.setBounds(400, 50, 200,30);
        static_textField0.setText(oldList.get(n).getId());
        static_textField0.setEditable(false);

        old_name.setText("姓名:");
        old_name.setBounds(300, 100, 100,30);
        old_name.setFont(new Font("宋体", Font.BOLD, 20));
        textField1.setBounds(400, 100, 200,30);
        textField1.setText(oldList.get(n).getName());

        old_sex.setText("性别:");
        old_sex.setBounds(300, 150, 100,30);
        old_sex.setFont(new Font("宋体", Font.BOLD, 20));
        textField2.setBounds(400, 150, 200,30);
        textField2.setText(oldList.get(n).getSex());

        old_age.setText("年龄:");
        old_age.setBounds(300, 200, 100,30);
        old_age.setFont(new Font("宋体", Font.BOLD, 20));
        textField3.setBounds(400, 200, 200,30);
        textField3.setText(oldList.get(n).getAge());

        old_phone.setText("家属电话:");
        old_phone.setBounds(300, 250, 100,30);
        old_phone.setFont(new Font("宋体", Font.BOLD, 20));
        textField4.setBounds(400, 250, 200,30);
        textField4.setText(oldList.get(n).getPhone());

        old_condition.setText("健康状况:");
        old_condition.setBounds(300, 300, 100,30);
        old_condition.setFont(new Font("宋体", Font.BOLD, 20));
        textField5.setBounds(400, 300, 200,30);
        textField5.setText(oldList.get(n).getCondition());

        old_remark.setText("备注:");
        old_remark.setBounds(300, 350, 100,30);
        old_remark.setFont(new Font("宋体", Font.BOLD, 20));
        textField6.setBounds(400, 350, 200,30);
        textField6.setText(oldList.get(n).getRemark());

        finish_update.setBounds(400, 450, 150, 30);

        label.add(old_id);
        label.add(static_textField0);
        label.add(old_name);
        label.add(textField1);
        label.add(old_sex);
        label.add(textField2);
        label.add(old_phone);
        label.add(textField3);
        label.add(old_age);
        label.add(textField4);
        label.add(old_condition);
        label.add(textField5);
        label.add(old_remark);
        label.add(textField6);
        label.add(finish_update);
    }
    public int find_old(String id){
        for (int i=0;i<oldList.size();i++) {
            if (oldList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void check_old(int n){

            show_id.setText("编号:"+oldList.get(n).getId());
            show_id.setBounds(300, 50, 100,30);
            show_id.setFont(new Font("宋体", Font.BOLD, 20));
            show_name.setText("姓名:"+oldList.get(n).getName());
            show_name.setBounds(300, 100, 100,30);
            show_name.setFont(new Font("宋体", Font.BOLD, 20));
            show_sex.setText("性别:"+oldList.get(n).getSex());
            show_sex.setBounds(300, 150, 100,30);
            show_sex.setFont(new Font("宋体", Font.BOLD, 20));
            show_age.setText("年龄:"+oldList.get(n).getAge());
            show_age.setBounds(300, 200, 100,30);
            show_age.setFont(new Font("宋体", Font.BOLD, 20));
            show_phone.setText("家属电话:"+oldList.get(n).getPhone());
            show_phone.setBounds(300, 250, 500,30);
            show_phone.setFont(new Font("宋体", Font.BOLD, 20));
            show_condition.setText("健康状况:"+oldList.get(n).getCondition());
            show_condition.setBounds(300, 300, 500,30);
            show_condition.setFont(new Font("宋体", Font.BOLD, 20));
            if(oldList.get(n).getRemark()==null){
                show_remark.setText("备注:"+"无");
                show_remark.setBounds(300, 350, 500,30);
                show_remark.setFont(new Font("宋体", Font.BOLD, 20));
            }else{
                show_remark.setText("备注:"+oldList.get(n).getRemark());
                show_remark.setBounds(300, 350, 500,30);
                show_remark.setFont(new Font("宋体", Font.BOLD, 20));
            }
            back.setBounds(400, 450, 150, 30);
            label.add(show_id);
            label.add(show_name);
            label.add(show_sex);
            label.add(show_age);
            label.add(show_phone);
            label.add(show_condition);
            label.add(show_remark);
            label.add(back);
    }


    public void add_change_password_Frame(){

        right_password.setText("请输入原密码");
        right_password.setBounds(200, 50, 200,30);
        right_password.setFont(new Font("宋体", Font.BOLD, 20));
        textField10.setBounds(400, 50, 200,30);
        textField10.setFont(new Font("宋体", Font.BOLD, 20));
        new_password.setText("请输入新密码");
        new_password.setBounds(200, 100, 200,30);
        new_password.setFont(new Font("宋体", Font.BOLD, 20));
        textField11.setBounds(400, 100, 200,30);
        textField11.setFont(new Font("宋体", Font.BOLD, 20));
        confirm_password.setText("请再次输入新密码");
        confirm_password.setBounds(200, 150, 200,30);
        confirm_password.setFont(new Font("宋体", Font.BOLD, 20));
        textField12.setBounds(400, 150, 200,30);
        textField12.setFont(new Font("宋体", Font.BOLD, 20));
        change_sure.setBounds(400, 200, 150, 30);
        cancel.setBounds(400, 250, 150, 30);

        label.add(right_password);
        label.add(textField10);
        label.add(new_password);
        label.add(textField11);
        label.add(confirm_password);
        label.add(textField12);

        label.add(change_sure);
        label.add(cancel);


    }
}
