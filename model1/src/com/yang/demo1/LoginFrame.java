package com.yang.demo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class LoginFrame extends JFrame implements MouseListener {

    ArrayList<User> user_list=new ArrayList<>();
    User_data_init user_data_init=new User_data_init();
    ImageIcon icon = new ImageIcon("model1//photo//white_back.png");
    JLabel background = new JLabel(icon);
    JLabel label1 = new JLabel("用户名:");
    JLabel label2 = new JLabel("密码:");
    JLabel label3 = new JLabel("验证码:");
    JLabel label4 = new JLabel("用户名:");
    JLabel label5 = new JLabel("密码:");
    JLabel label6 = new JLabel("确认密码:");
    JLabel label7 = new JLabel("手机号:");
    JLabel label8 = new JLabel("新密码:");
    JLabel label9 = new JLabel("确认新密码:");

    JTextField text1 = new JTextField();
    JPasswordField text2 = new JPasswordField();
    JTextField text3 = new JTextField();
    JTextField text4 = new JTextField();
    JTextField text5 = new JTextField();
    JTextField text6 = new JTextField();
    JTextField text7 = new JTextField();
    JTextField text8 = new JTextField();
    JTextField text9 = new JTextField();


    JButton log_in = new JButton("登录");
    JButton register = new JButton("点击注册");
    JButton find_password = new JButton("找回密码");
    JButton code = new JButton();
    JButton back = new JButton("返回");
    JButton sure = new JButton("确定");
    JButton sure1 = new JButton("确定");
    JButton sure2 = new JButton("确定");

    public LoginFrame(){
        user_data_init.read_file(user_list);
        initFrame();
        init_login();
        log_in.addMouseListener(this);
        register.addMouseListener(this);
        find_password.addMouseListener(this);
        code.addMouseListener(this);
        back.addMouseListener(this);
        sure.addMouseListener(this);
        sure1.addMouseListener(this);
        sure2.addMouseListener(this);
    }
    public void initFrame(){
        this.setTitle("护理员登录");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        background.setBounds(0, 0, 600, 600);
        this.getContentPane().add(background);

        this.setVisible(true);
    }
    public void init_login(){
        label1.setBounds(150, 150, 100, 30);
        label1.setFont(new Font("宋体", Font.BOLD, 20));
        label2.setBounds(150, 200, 100, 30);
        label2.setFont(new Font("宋体", Font.BOLD, 20));
        label3.setBounds(150, 250, 100, 30);
        label3.setFont(new Font("宋体", Font.BOLD, 20));

        text1.setBounds(250, 150, 200, 30);
        text1.setFont(new Font("宋体", Font.BOLD, 20));
        text2.setBounds(250, 200, 200, 30);
        text2.setFont(new Font("宋体", Font.BOLD, 20));
        text3.setBounds(250, 250, 100, 30);
        text3.setFont(new Font("宋体", Font.BOLD, 20));
        log_in.setBounds(250, 350, 100, 30);
        log_in.setFont(new Font("宋体", Font.BOLD, 20));

        register.setBounds(120, 300, 100, 30);
        register.setFont(new Font("宋体", Font.BOLD, 10));
        register.setForeground(Color.BLUE);
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);

        find_password.setBounds(350, 300, 200, 30);
        find_password.setFont(new Font("宋体", Font.BOLD, 10));
        find_password.setForeground(Color.BLUE);
        find_password.setBorderPainted(false);
        find_password.setContentAreaFilled(false);

        code.setBounds(350, 240, 100, 50);
        code.setText(generateCode());
        code.setFont(new Font("宋体", Font.BOLD, 20));
        code.setBorderPainted(false);
        code.setContentAreaFilled(false);


        background.add(label1);
        background.add(label2);
        background.add(label3);
        background.add(text1);
        background.add(text2);
        background.add(text3);
        background.add(log_in);
        background.add(register);
        background.add(find_password);
        background.add(code);


    }
    public String generateCode(){
        char[] code = new char[4];
        Random random = new Random();
        char[] pool = {'1','2','3','4','5','6','7','8','9','0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i = 0; i < 4; i++){
            int index = random.nextInt(pool.length);
            code[i] = pool[index];
        }
        return new String(code);
    }
    public void init_register(){
        label4.setBounds(150, 150, 100, 30);
        label4.setFont(new Font("宋体", Font.BOLD, 20));
        label5.setBounds(150, 200, 100, 30);
        label5.setFont(new Font("宋体", Font.BOLD, 20));
        label6.setBounds(150, 250, 100, 30);
        label6.setFont(new Font("宋体", Font.BOLD, 20));
        label7.setBounds(150, 300, 100, 30);
        label7.setFont(new Font("宋体", Font.BOLD, 20));
        text4.setBounds(250, 150, 200, 30);
        text4.setFont(new Font("宋体", Font.BOLD, 20));
        text5.setBounds(250, 200, 200, 30);
        text5.setFont(new Font("宋体", Font.BOLD, 20));
        text6.setBounds(250, 250, 200, 30);
        text6.setFont(new Font("宋体", Font.BOLD, 20));
        text7.setBounds(250, 300, 200, 30);
        text7.setFont(new Font("宋体", Font.BOLD, 20));
        sure.setBounds(150, 400, 100, 30);
        sure.setFont(new Font("宋体", Font.BOLD, 20));
        back.setBounds(350, 400, 100, 30);
        back.setFont(new Font("宋体", Font.BOLD, 20));
        background.add(label4);
        background.add(label5);
        background.add(label6);
        background.add(label7);
        background.add(text4);
        background.add(text5);
        background.add(text6);
        background.add(text7);
        background.add(sure);
        background.add(back);
    }
    public void register(){
        String register_name = text4.getText();
        String register_password1 = text5.getText();
        String register_password2 = text6.getText();
        String register_phone = text7.getText();
        if(register_name.equals("")||register_password1.equals("")||register_password2.equals("")||register_phone.equals("")){
            JOptionPane.showMessageDialog(this, "请输入完整信息");
        }
        else if(!register_password1.equals(register_password2)){
            JOptionPane.showMessageDialog(this, "两次密码不一致");
        }
        else if(register_phone.length()!=11){
            JOptionPane.showMessageDialog(this, "手机号长度不正确");
        }
        else{
            User user = new User();
            user.setName(register_name);
            user.setPassword(register_password1);
            user.setPhone(register_phone);
            if(function(user_list,user)){
                user_list.add(user);
                user_data_init.write_file(user_list);
                JOptionPane.showMessageDialog(this, "注册成功");
                text4.setText("");
                text5.setText("");
                text6.setText("");
                text7.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "用户名已存在,请返回登录");
            }
        }
    }
    public boolean function(ArrayList<User> user_list,User user){
        for(int i=0;i<user_list.size();i++){
            if(user_list.get(i).getName().equals(user.getName())){
                return false;
            }
        }return true;
    }
    public void login(){
        char[] getPassword = text2.getPassword();
        String login_name = text1.getText();
        String login_password = new String(getPassword);
        String login_code = text3.getText();
        if(login_name.equals("")||login_password.equals("")||login_code.equals("")){
            JOptionPane.showMessageDialog(this, "请输入完整信息");
        }
        else if(!login_code.equalsIgnoreCase(code.getText())){
            JOptionPane.showMessageDialog(this, "验证码错误");
        }
        else{
            for(int i=0;i<user_list.size();i++){
                if(login_name.equals(user_list.get(i).getName())&&login_password.equals(user_list.get(i).getPassword())){
                    JOptionPane.showMessageDialog(this, "登录成功");
                    new MainFrame(user_list.get(i).getName(),user_list.get(i).getPhone(),user_list.get(i).getPassword());
                    this.dispose();
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "用户名或密码错误");
        }
    }
    public void init_find_password1(){
        label4.setBounds(150, 150, 100, 30);
        label4.setFont(new Font("宋体", Font.BOLD, 20));
        label7.setBounds(150, 250, 100, 30);
        label7.setFont(new Font("宋体", Font.BOLD, 20));
        text4.setBounds(250, 150, 200, 30);
        text4.setFont(new Font("宋体", Font.BOLD, 20));
        text7.setBounds(250, 250, 200, 30);
        text7.setFont(new Font("宋体", Font.BOLD, 20));
        sure1.setBounds(150, 400, 100, 30);
        sure1.setFont(new Font("宋体", Font.BOLD, 20));
        back.setBounds(350, 400, 100, 30);
        back.setFont(new Font("宋体", Font.BOLD, 20));

        background.add(label4);
        background.add(label7);
        background.add(text4);
        background.add(text7);
        background.add(sure1);
        background.add(back);
    }
    public void init_find_password2(){
        label8.setBounds(150, 150, 100, 30);
        label8.setFont(new Font("宋体", Font.BOLD, 20));
        label9.setBounds(150, 250, 200, 30);
        label9.setFont(new Font("宋体", Font.BOLD, 20));
        text8.setBounds(350, 150, 200, 30);
        text8.setFont(new Font("宋体", Font.BOLD, 20));
        text9.setBounds(350, 250, 200, 30);
        text9.setFont(new Font("宋体", Font.BOLD, 20));
        sure2.setBounds(150, 400, 100, 30);
        sure2.setFont(new Font("宋体", Font.BOLD, 20));
        back.setBounds(350, 400, 100, 30);
        back.setFont(new Font("宋体", Font.BOLD, 20));
        background.add(label8);
        background.add(label9);
        background.add(text8);
        background.add(text9);
        background.add(back);
        background.add(sure2);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource()==code){
            String code1 = generateCode();
            code.setText(code1);
        }
        else if(e.getSource()==register){
            background.removeAll();
            init_register();
            repaint_text();
            background.repaint();
        }
        else if(e.getSource()==back){
            background.removeAll();
            repaint_text();
            init_login();
            background.repaint();
        }
        else if(e.getSource()==sure){
            register();
        }
        else if(e.getSource()==log_in){
            login();
        }
        else if(e.getSource()==find_password){
            background.removeAll();
            init_find_password1();
            repaint_text();
            background.repaint();
        }else if(e.getSource()==sure1){
            String find_password_name = text4.getText();
            String find_password_phone = text7.getText();
            if(find_password_name.equals("")||find_password_phone.equals("")){
                JOptionPane.showMessageDialog(this, "请输入完整信息");
            }
            else{
                int n=0;
                for(int i=0;i<user_list.size();i++){
                    if(find_password_name.equals(user_list.get(i).getName())&&find_password_phone.equals(user_list.get(i).getPhone())){
                        n=1;
                        break;
                    }
                }
                if(n==1){
                    background.removeAll();
                    init_find_password2();
                    background.repaint();
                }else{
                    JOptionPane.showMessageDialog(this, "用户名或手机号错误");
                }
            }
        }
        else if(e.getSource()==sure2){
            String find_password_password1 = text8.getText();
            String find_password_password2 = text9.getText();
            if(find_password_password1.equals("")||find_password_password2.equals("")){
                JOptionPane.showMessageDialog(this, "请输入完整信息");
            }
            else if(!find_password_password1.equals(find_password_password2)){
                JOptionPane.showMessageDialog(this, "两次密码不一致");
            }
            else{
                for(int i=0;i<user_list.size();i++){
                    if(user_list.get(i).getName().equals(text4.getText())){
                        user_list.get(i).setPassword(find_password_password1);
                        user_data_init.write_file(user_list);
                        JOptionPane.showMessageDialog(this, "密码修改成功");
                        background.removeAll();
                        repaint_text();
                        init_login();
                        background.repaint();
                    }
                }
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public void repaint_text(){
        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
        text5.setText("");
        text6.setText("");
        text7.setText("");
        text8.setText("");
        text9.setText("");
    }
}
