class Main {
    public static void main(String[] args) {
        System.out.println("IA");
        //Database
        Database myDatabase = new Database("input.txt");
        //User
        //User u = new User("user","pass");
        //u.display();
        //u.userVerification("userPass.txt");//dont work
        //Generating Questions

        //g.questionsInBinaryTopic();

        //q.isTopicValid("input.txt"); //??
        //q.printLine("input.txt"); //??
        Grouping g = new Grouping();
        g.Grouping();
        QuestionSet testSet = new QuestionSet(myDatabase);
        //QuestionSet(myDatabase, "Binary Search", 1, 100);
        testSet.display();

    }
}