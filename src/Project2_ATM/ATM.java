package Project2_ATM;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Account loginAcc;//记录登录后的用户账户

    //欢迎界面
    public void start() {
        while (true) {
            System.out.println("=欢迎您进入到了ATM系统==");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //用户登录操作
                    login();
                    break;
                case 2:
                    //用户开户操作
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作请重新选择！");
                    break;
            }
        }
    }

    //用户开户方法
    private void createAccount() {
        Account acc = new Account();

        System.out.println("请输入您的账户名称:");
        String name = sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请输入您的性别");
            char sex = sc.next().charAt(0);
            if (sex == '男' || sex == '女') {
                acc.setSex(sex);
                break;
            } else {
                System.out.println("您输入的性别有误");
            }
        }
        while (true) {
            System.out.println("请输入您的账户密码：");
            String password = sc.next();
            System.out.println("请输入您的确认密码：");
            String Okpassword = sc.next();
            if (Okpassword.equals(password)) {
                acc.setPassWord(password);
                break;
            } else {
                System.out.println("您输入的两次密码不一致，请您确认");
            }
        }
        System.out.println("请您输入您的取现额度：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        String newCardId = createCardId();
        acc.setCardId(newCardId);

        accounts.add(acc);
        System.out.println("恭喜您，" + acc.getUserName() + ",开户成功，您的卡号是：" + acc.getCardId());


    }

    private String createCardId() {
        //利用Random生成一个8位的随机卡号
        while (true) {
            Random r = new Random();
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10);
                cardId += data;
            }
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {

                return cardId;
            }
        }
    }

    private Account getAccountByCardId(String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }

    private void login() {
        System.out.println("==系统登录==");
        //
        if (accounts.size() == 0) {
            System.out.println("当前系统中没有任何账户，请先开户");
            return;
        }
        while (true) {
            System.out.println("请输入您的登录卡号:");
            String cardId = sc.next();

            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                System.out.println("您输入的卡号不存在，请确认");
            } else {
                while (true) {
                    System.out.println("请您输入登录密码:");
                    String passWord = sc.next();
                    if (acc.getPassWord().equals(passWord)) {
                        loginAcc = acc;
                        //密码正确登录成功
                        System.out.println("登录成功-----" + acc.getUserName());
                        //展示登录成功后的操作界面
                        showUserCommand();

                        return;//跳出并结束当前登录方法
                    } else {
                        System.out.println("您输入的密码不正确，请确认");
                    }
                }

            }
        }
    }

    //登录后的界面
    private void showUserCommand() {
        while (true) {
            System.out.println(loginAcc.getUserName() + "您可以选择如下功能进行账户的处理====");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.密码修改");
            System.out.println("6.退出");
            System.out.println("7.注销当前账户");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //展示账户信息
                    showLoginAccount();
                    break;
                case 2:
                    //存款
                    depositMoney();

                    break;
                case 3:
                    //取款
                    drawMoney();
                    break;
                case 4:
                    //转账
                    transferMoney();
                    break;
                case 5:
                    //密码修改
                    updatePassWord();
                    break;
                case 6:
                    System.out.println(loginAcc.getUserName() + "您退出系统成功");
                    return;//跳出当前方法
                case 7:
                    //注销当前账户
                    if(deleteAccount())
                    {
                        return;
                    }

                    break;
                default:
                    System.out.println("您当前选择的操作不存在");
                    break;
            }
        }
    }

    private void updatePassWord() {
        System.out.println("==账户密码修改操作==");
        while (true) {
            System.out.println("请您输入当前账户的密码:");
            String currentPassword = sc.next();
            if(loginAcc.getPassWord().equals(currentPassword)){
                //输入的当前密码正确  可以修改

                while (true) {
                    System.out.println("请您输入修改后的密码:");
                    String changePassWord = sc.next();
                    System.out.println("请再次输入修改的密码：");
                    String confirmPassWord = sc.next();
                    if(confirmPassWord.equals(changePassWord)){
                        System.out.println("恭喜您，修改密码成功");
                        loginAcc.setPassWord(changePassWord);
                        return;
                    }else {
                        System.out.println("两次输入密码不一致，请重新输入");
                    }
                }

            }else{
                System.out.println("输入的当前密码错误，请重新输入");
            }
        }
    }

    private boolean deleteAccount() {
        System.out.println("==进行销户操作==");
        System.out.println("请问您确认销户吗？y/n");
        String command = sc.next();
        switch (command){
            case "y":
                if(loginAcc.getMoney() == 0){
                    accounts.remove(loginAcc);
                    System.out.println("您的账户已经成功销户");
                    return true;
                }else {
                    System.out.println("您的账户中存钱余额，不能销户");
                    return false;
                }
            default:
                System.out.println("您好，您的账户保留！！");
                return false;
        }



    }

    private void transferMoney() {
        System.out.println("==用户转账==");
        if(accounts.size() < 2){
            System.out.println("当前系统中只有你一个账户，无法为其他账户转账");
            return;
        }
        //判断自己的账户中是否有钱
        if(loginAcc.getMoney() == 0){
            System.out.println("账户没钱");
            return;
        }

        //真正开始转账了
        while (true) {
            System.out.println("请您输入对方的卡号：");
            String carId = sc.next();

            //判断卡号是否正确
            Account acc =  getAccountByCardId(carId);
            if(acc == null){
                System.out.println("您输入的对方的卡号不存在！");
            }else {
                //对方的账户存在
                String name = "*" + acc.getUserName().substring(1);
                System.out.println("请您输入 【" + name + "】的姓氏");
                String prename = sc.next();
                if(acc.getUserName().startsWith(prename)){
                    //认证通过了  可以转账
                    while (true) {
                        System.out.println("请输入您要转的金额:");
                        double money = sc.nextDouble();
                        if(loginAcc.getMoney() >= money)
                        {
                            //更新自己的账户
                            loginAcc.setMoney(loginAcc.getMoney() - money);
                            //更新对方的账户
                            acc.setMoney(loginAcc.getMoney() + money);

                            return;//跳出转账方法
                        }else {
                            System.out.println("余额不足，最多可转" + loginAcc.getMoney());
                        }
                    }

                }else{
                    System.out.println("对不起，您输入的姓氏有问题");
                }
            }
        }

    }

    private void drawMoney() {
        System.out.println("==取款操作==");
        if (loginAcc.getMoney() <= 100) {
            System.out.println("余额不足100元");
            return;
        }
        while (true) {
            System.out.println("请您输入取款金额");
            double money = sc.nextDouble();

            //判断账户余额是否足够
            if (loginAcc.getMoney() >= money) {
                //账户中的余额是足够的
                //判断当前取款金额是否超出限额
                if(money > loginAcc.getLimit()){
                    System.out.println("您当前取款金额超过了每次限额，您每次最多可取:" + loginAcc.getLimit());
                }else {
                    //代表可以开始取钱了
                    loginAcc.setMoney(loginAcc.getMoney() - money);
                    System.out.println("您取款：" + money + "成功，取款后您剩余：" + loginAcc.getMoney());
                    break;
                }
            } else {
                System.out.println("余额不足，您账户中的余额是：" + loginAcc.getMoney());
            }
        }
    }

    private void depositMoney() {
        System.out.println("==存钱操作==");
        System.out.println("请您输入存款金额");
        double money = sc.nextDouble();


        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println("恭喜您，存钱成功" + money + "成功，存钱后余额是: " + loginAcc.getMoney());

    }

    private void showLoginAccount() {
        System.out.println("==当前您的账户信息如下:==");
        System.out.println("卡号：" + loginAcc.getCardId());
        System.out.println("户主：" + loginAcc.getUserName());
        System.out.println("性别：" + loginAcc.getSex());
        System.out.println("余额：" + loginAcc.getMoney());
        System.out.println("每次取现额度：" + loginAcc.getLimit());
    }

}
