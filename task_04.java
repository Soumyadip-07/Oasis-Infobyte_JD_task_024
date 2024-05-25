import java.util.*;
class task_04
{
    static Scanner sc=new Scanner(System.in);
    static Timer timer=new Timer();
    static int c=0;
    static String id, pass;
    static String userid, password;
    static boolean log=false;
    static void login()
    {
        id=("Soumyadip");
        pass=("Password");
        if ((userid.equals(id))&&(password.equals(pass)))
        {
            log=true;
            System.out.println("Login Successfully...");
        }
        else
        {
            System.out.println("Invalid Login details.");
        }
    }
    static void q1()
    {
        
        int ans=4;
        System.out.println("1. What is the capital of Australia?");
        System.out.println("1. Paris.\n2. Sydney.\n3. Delhi.\n4. Canberra.");
        System.out.print("Enter your answer(1-4)= ");
        int n= sc.nextInt();
        if(n==ans)
        {
            System.out.println("Correct Answer...");
            c++;
        }
        else
        {
            System.out.println("Wrong Answer...");
        }
    }
    static void q2()
    {
        int ans=2;
        System.out.println("2. Which planet is known as the Red Planet?");
        System.out.println("1. Earth\n2. Mars\n3. Jupiter\n4. Venus");
        System.out.print("Enter your answer(1-4)= ");
        int n= sc.nextInt();
        if(n==ans)
        {
            System.out.println("Correct Answer...");
            c++;
        }
        else
        {
            System.out.println("Wrong Answer...");
        }
    }
    static void q3()
    {
        int ans=3;
        System.out.println("3. Who wrote the play 'Romeo and Juliet'?");
        System.out.println("1. Charles Dickens\n2. J.K. Rowling\n3. William Shakespeare\n4. Mark Twain");
        System.out.print("Enter your answer(1-4)= ");
        int n= sc.nextInt();
        if(n==ans)
        {
            System.out.println("Correct Answer...");
            c++;
        }
        else
        {
            System.out.println("Wrong Answer...");
        }
    }
    static void q4()
    {
        int ans=2;
        System.out.println("4. Which element has the chemical symbol 'O'?");
        System.out.println("1. Gold\n2. Oxygen\n3. Osmium\n4. Mercury");
        System.out.print("Enter your answer(1-4)= ");
        int n= sc.nextInt();
        if(n==ans)
        {
            System.out.println("Correct Answer...");
            c++;
        }
        else
        {
            System.out.println("Wrong Answer...");
        }
    }
    static void q5()
    {
        int ans=1;
        System.out.println("5. In which year did the Titanic sink?");
        System.out.println("1. 1912\n2. 1905\n3. 1923\n4. 1931");
        System.out.print("Enter your answer(1-4)= ");
        int n= sc.nextInt();
        if(n==ans)
        {
            System.out.println("Correct Answer...");
            c++;
        }
        else
        {
            System.out.println("Wrong Answer...");
        }
    }
    static void q6()
    {
        int ans=3;
        System.out.println("6. Who was the first person to walk on the moon?");
        System.out.println("1. Yuri Gagarin\n2. Buzz Aldrin\n3. Neil Armstrong\n4. Michael Collins");
        System.out.print("Enter your answer(1-4)= ");
        int n= sc.nextInt();
        if(n==ans)
        {
            System.out.println("Correct Answer...");
            c++;
        }
        else
        {
            System.out.println("Wrong Answer...");
        }
    }
    static void q7()
    {
        int ans=2;
        System.out.println("7. What is the largest mammal in the world?");
        System.out.println("1. African Elephant\n2. Blue Whale\n3. Giraffe\n4. Orca");
        System.out.print("Enter your answer(1-4)= ");
        int n= sc.nextInt();
        if(n==ans)
        {
            System.out.println("Correct Answer...");
            c++;
        }
        else
        {
            System.out.println("Wrong Answer...");
        }
    }
    static void q8()
    {
        int ans=3;
        System.out.println("8. Which country is known as the Land of the Rising Sun?");
        System.out.println("1. China\n2. South Korea\n3. Japan\n4. Thailand");
        System.out.print("Enter your answer(1-4)= ");
        int n= sc.nextInt();
        if(n==ans)
        {
            System.out.println("Correct Answer...");
            c++;
        }
        else
        {
            System.out.println("Wrong Answer...");
        }
    }
    static void q9()
    {
        int ans=3;
        System.out.println("9. What is the hardest natural substance on Earth?");
        System.out.println("1. Gold\n2. Iron\n3. Diamond\n4. Quartz");
        System.out.print("Enter your answer(1-4)= ");
        int n= sc.nextInt();
        if(n==ans)
        {
            System.out.println("Correct Answer...");
            c++;
        }
        else
        {
            System.out.println("Wrong Answer...");
        }
    }
    static void q10()
    {
        int ans=3;
        System.out.println("10. Who painted the Mona Lisa?");
        System.out.println("1. Vincent van Gogh\n2. Pablo Picasso\n3. Leonardo da Vinci\n4. Claude Monet");
        System.out.print("Enter your answer(1-4)= ");
        int n= sc.nextInt();
        if(n==ans)
        {
            System.out.println("Correct Answer...");
            c++;
        }
        else
        {
            System.out.println("Wrong Answer...");
        }
    }
    static void question()
    {
        startTimer();
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
        q10();
        timer.cancel();
    }
    public static void main(String args[])
    {
        System.out.println("***ONLINE EXAMINATION SYSTEM***");
        while (true)
        {
            System.out.println("1. Login.");
            System.out.println("2. Exam Form.");
            System.out.println("3. Logout.");
            System.out.print("Enter your choice= ");
            int ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                {
                    System.out.print("Enter your userid= ");
                    userid=sc.nextLine();
                    System.out.print("Enter the password= ");
                    password=sc.nextLine();
                    login();
                    break;
                }
                case 2:
                {
                    if(log)
                    {
                        System.out.println("Here is 10 MCQ type questions.");
                        System.out.println("You need to answer all question within 60 seconds.");
                        System.out.println("Let's Start...");
                        question();
                        System.out.println("Exam Completed...");
                        System.out.println("You have answered "+c+" questions correctly.");
                    }
                    else 
                    {
                        System.out.println("You have to login first.");
                    }
                    break;
                }
                case 3:
                {
                    if(log)
                    {
                        System.out.println("Logged out successfully...");
                        System.exit(0);
                    }
                    else 
                    {
                        System.out.println("You have to login first.");
                    }
                    break;
                }
                default:
                {
                    System.out.println("You have entered a wrong choice");
                }
            }
        }
    }
    static void startTimer() 
    {
        TimerTask task = new TimerTask() 
        {
            public void run() 
            {
                System.out.println("\nOOPS!! Time's up!...");
                System.out.println("Exam Completed...");
                System.out.println("You have answered "+c+" questions correctly.");
                timer.cancel();
                System.exit(0);
            }
        };
        timer.schedule(task, 60000);
    }
}