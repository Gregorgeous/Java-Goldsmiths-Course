public abstract class Student {
    public static int NUM_OF_TESTS = 3;
    protected String name;
    protected int[] test;
    protected String courseGrade;
    public Student() {
        this("no name");
    }
    public Student(String name) {
        this.name = name; test=new int[NUM_OF_TESTS]; courseGrade= "xxxxx";
    }
    public String toString() {
        return "Student [name=" + name + ", courseGrade=" + courseGrade + "]";
    }
    public static int getNUM_OF_TESTS() {
        return NUM_OF_TESTS;
    }
    public static void setNUM_OF_TESTS(int nUM_OF_TESTS) {
        NUM_OF_TESTS = nUM_OF_TESTS;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourseGrade() {
        return courseGrade;
    }
    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }
    public void setTestScore(int testNumber, int testScore)
    {
        test[testNumber-1] = testScore;
    }
    abstract void computeCourseGrade();
}